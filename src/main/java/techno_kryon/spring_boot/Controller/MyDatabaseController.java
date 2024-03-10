package techno_kryon.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDatabaseController {

    @Autowired
    private MyDatabaseConfiguration configuration;

    @RequestMapping("/database")
    public MyDatabaseConfiguration getDatabaseDetails() {
        return configuration;
    }

}
