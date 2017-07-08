package yukitas;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class RecordControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    private RecordController controller;

    @Mock
    private RecordService service;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void getAllRecords_WithCorrectData() throws Exception {
        List<Record> expectedRecord = asList(new Record());
        when(service.getAllRecords()).thenReturn(expectedRecord);

        mockMvc.perform(get("/dlr/records")).andExpect(status().isOk());
    }

    @Test
    public void saveRecord_WithCorrectData() throws Exception {
        mockMvc.perform(post("/dlr/records").content("{\"date\": \"2017-07-08\"}").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}