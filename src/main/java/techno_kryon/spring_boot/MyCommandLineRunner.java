package techno_kryon.spring_boot;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;  // For getting database config values
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private MyDatabaseConfiguration config;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String ... args) throws Exception {
        System.out.println("\n\tThis is my commandline runner!\n");

        System.out.println("\n\tWELCOME TO SPRING BOOT APPLICATION\n");


        // Print the Database configuration values for the database.
        System.out.println(config); // accessing the database config
        
        // Now to connect to a database.
        if(checkDatabaseConnection()) {
            System.out.println("\n\tSuccessfully Connected to Database!\n");
        }
        else {
            System.out.println("\n\tERROR cannot connect to database");
        }

        //System.out.println("Inserting value into database!\n");

        //Department department = new Department("Java", "Chennai");
        //departmentRepository.save(department);
        //Employee employee = new Employee("SowmiyanS", "sowmiyan9491@gmail.com", "verystrongpassword1", department);
        //employeeRepository.save(employee);

        System.out.println("Successfully saved values!\n");

    }

    public boolean checkDatabaseConnection() {
        try {
            jdbcTemplate.execute("SHOW TABLES");
            return true;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
