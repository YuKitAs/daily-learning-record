package yukitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/dlr")
public class RecordController {
    @Autowired
    private RecordService service;

    @RequestMapping(value = "/records", method = RequestMethod.GET)
    public List<Record> getAllRecords() {
        return service.getAllRecords();
    }

    @RequestMapping(value = "/records", method = RequestMethod.POST)
    public Record saveRecord(@RequestBody Record record) {
        return service.createRecord(record);
    }

    @RequestMapping(value = "/records/{date}", method = RequestMethod.DELETE)
    public void deleteRecord(@PathVariable String date) {
        service.deleteRecord(date);
    }
}
