package techno_kryon.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCustomPropertyController {
    
    @Autowired
    private MyCustomPropertyConfiguration configuration;

    @Autowired
    private MyCustomPropertyComponent component;

    @RequestMapping("/1")
    public MyCustomPropertyComponent getMyString1() {
        return component;
    }

    @RequestMapping("/2")
    public MyCustomPropertyConfiguration getMyString2() {
        return configuration;
    }

}
