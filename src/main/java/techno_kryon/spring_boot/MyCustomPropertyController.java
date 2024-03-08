package techno_kryon.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class MyCustomPropertyController {
    
    @Autowired
    private MyCustomPropertyConfiguration configuration;

    @RequestMapping("/myConfigProperty")
    public MyCustomPropertyConfiguration findall() {
        return configuration;
    }

}
