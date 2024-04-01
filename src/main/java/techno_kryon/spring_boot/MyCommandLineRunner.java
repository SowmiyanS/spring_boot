package techno_kryon.spring_boot;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;  // For getting database config values
import org.springframework.jdbc.core.JdbcTemplate;
import org.slf4j.Logger;                                        // For logging
import org.slf4j.LoggerFactory;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private MyDatabaseConfiguration config;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    Logger logger = LoggerFactory.getLogger(MyCommandLineRunner.class);

    @Override
    public void run(String ... args) throws Exception {
        logger.info("This is my commandline runner!");

        logger.info("WELCOME TO SPRING BOOT APPLICATION");


        // Print the Database configuration values for the database.
        //logger.info(config); // accessing the database config | commented it because logger throws error that it does not know what to do with it
        
        // Now to connect to a database.
        if(checkDatabaseConnection()) {
            logger.info("Successfully Connected to Database!");
        }
        else {
            logger.info("ERROR cannot connect to database");
        }

        //System.out.println("Inserting value into database!\n");

        //Department department = new Department("Java", "Chennai");
        //departmentRepository.save(department);
        //Employee employee = new Employee("SowmiyanS", "sowmiyan9491@gmail.com", "verystrongpassword1", department);
        //employeeRepository.save(employee);

        //logger.info("Successfully saved values!");

    }

    public boolean checkDatabaseConnection() {
        try {
            jdbcTemplate.execute("SHOW TABLES");
            return true;
        }
        catch(Exception e) {
            logger.error(e.getMessage());
            return false;
        }
    }
}
