package yukitas;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.Instant;

public interface RecordRepository extends MongoRepository<Record, String> {
    Record findByDate(String date);
}
