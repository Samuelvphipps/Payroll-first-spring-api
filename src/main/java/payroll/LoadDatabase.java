package payroll;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    //Srping Boot will run ALL CommandLineRunner beans once the app context is loaded
    //This runner will request a copy of the EmployeeRepository I just created in EmployeeRepository.java
    //Will then store the args in the repository
    CommandLineRunner initDatabase(EmployeeRepository repository){

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
        };

    }

}
