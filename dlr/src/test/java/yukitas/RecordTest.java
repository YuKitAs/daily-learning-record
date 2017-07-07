package yukitas;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RecordTest {
    private static final String ID = "595f66c798c57517978e9405";
    private static final String DATE = "2017-01-01";
    private static final Boolean TASK_1 = true;
    private static final Boolean TASK_2 = false;

    private JacksonTester<Record> json;

    @Autowired
    private ObjectMapper objectMapper;

    @Before
    public void setUp() throws IOException {
        JacksonTester.initFields(this, objectMapper);
    }

    @Test
    public void deserialize_WithCorrectJson() throws IOException {
        Record record = json.readObject(getClass().getResourceAsStream("Record.json"));

        assertThat(record.getId()).isEqualTo(ID);
        assertThat(record.getDate()).isEqualTo(DATE);
        assertThat(record.getTask1()).isEqualTo(TASK_1);
        assertThat(record.getTask2()).isEqualTo(TASK_2);
    }

    @Test
    public void serialize_WithCorrectValues() throws IOException {
        Record record = json.readObject(getClass().getResourceAsStream("Record.json"));

        assertThat(json.write(record)).isEqualToJson("Record.json");
    }
}
