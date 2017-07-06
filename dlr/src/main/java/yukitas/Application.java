package yukitas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://127.0.0.1:8081");
            }
        };
    }

/*    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(new

                Record("2017-07-01", true, false, false, true, true));
        repository.save(new

                Record("2017-07-02", false, false, false, false, true));

        System.out.println("Customers found with findAll():");
        for (Record record : repository.findAll()) {
            System.out.println(record);
        }

        System.out.println("-------------------------------");

        System.out.println("Record found on 2017-07-01:");
        System.out.println(repository.findByDate("2017-07-01"));
    }*/
}
