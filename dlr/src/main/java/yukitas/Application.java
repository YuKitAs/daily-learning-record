package yukitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private RecordRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(new Record("2017-07-01", true, false, false, true, true));
        repository.save(new Record("2017-07-02", false, false, false, false, true));

        System.out.println("Customers found with findAll():");
        for (Record record : repository.findAll()) {
            System.out.println(record);
        }

        System.out.println("-------------------------------");

        System.out.println("Record found on 2017-07-01:");
        System.out.println(repository.findByDate("2017-07-01"));
    }
}
