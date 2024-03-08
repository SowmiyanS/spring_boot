package techno_kryon.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

        // Printing to the console
        System.out.println("\n\tWELCOME TO SPRING BOOT APPLICATION\n");
	}

}
