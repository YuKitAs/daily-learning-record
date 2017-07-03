package yukitas;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.Instant;

public interface RecordRepository extends MongoRepository<Record, String> {
    public Record findByDate(String date);
}
