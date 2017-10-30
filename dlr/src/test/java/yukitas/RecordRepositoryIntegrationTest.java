package yukitas;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {SpringMongoConfiguration.class})
public class RecordRepositoryIntegrationTest {
    private static final String DATE = "2017-07-07";
    private static final Boolean TASK_1 = true;
    private static final Boolean TASK_2 = false;
    private static final Boolean TASK_3 = false;
    private static final Boolean TASK_4 = false;
    private static final Boolean TASK_5 = false;

    private Record record;
    private String recordId;

    @Autowired
    private RecordRepository repository;

    @Before
    public void setUp() {
        repository.deleteAll();
        record = new Record(DATE, TASK_1, TASK_2, TASK_3, TASK_4, TASK_5);
        recordId = repository.save(record).getId();
    }

    @Test
    public void findByDate_WithCorrectRecord() throws Exception {
        Record record = repository.findByDate("2017-07-07");
        assertThat(record.getId()).isEqualTo(recordId);
        assertThat(record.getTask1()).isEqualTo(TASK_1);
        assertThat(record.getTask2()).isEqualTo(TASK_2);
    }

    @Test
    public void save_WithCorrectRecord() {
        Record returnedRecord = repository.save(record);
        Record savedRecord = repository.findOne(recordId);

        assertThat(savedRecord.getId()).isEqualTo(returnedRecord.getId()).isEqualTo(recordId);
        assertThat(savedRecord.getDate()).isEqualTo(returnedRecord.getDate()).isEqualTo(DATE);
        assertThat(savedRecord.getTask1()).isEqualTo(returnedRecord.getTask1()).isEqualTo(TASK_1);
        assertThat(savedRecord.getTask2()).isEqualTo(returnedRecord.getTask2()).isEqualTo(TASK_2);
    }

    @Test
    public void delete_WithRecordSuccessfullyDeleted() {
        repository.delete(repository.findByDate(DATE));
        assertThat(repository.findAll().iterator().hasNext()).isFalse();
    }
}