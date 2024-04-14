package techno_kryon.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication//(exclude = { SecurityAutoConfiguration.class }) // Other wise the spring security generates a login page before we can use any api endpoints
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

        // Printing to the console
        // Commenting this code because it is now implemented in CommandLineRunner
        //System.out.println("\n\tWELCOME TO SPRING BOOT APPLICATION\n");


	}

}
