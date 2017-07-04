package yukitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/daily_learning_record")
public class RecordController {
    @Autowired
    private RecordRepository repository;

    @RequestMapping(value = "/records", method = RequestMethod.GET)
    public List<Record> getAllRecords() {
        return repository.findAll();
    }

    @RequestMapping(value = "/records", method = RequestMethod.POST)
    public List<Record> saveRecords(@RequestBody List<Record> records) {
        return repository.save(records);
    }
}
