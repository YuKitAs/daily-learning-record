package yukitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {
    @Autowired
    private RecordRepository repository;

    public List<Record> getAllRecords() {
        return repository.findAll();
    }

    public Record createRecord(Record record) {
        Record old = repository.findByDate(record.getDate());
        if (old != null) {
            record.setId(old.getId());
        }

        return repository.save(record);
    }

    public void deleteRecord(String id) {
        repository.delete(id);
    }
}
