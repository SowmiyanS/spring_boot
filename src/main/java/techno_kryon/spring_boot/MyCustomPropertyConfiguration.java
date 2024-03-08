package techno_kryon.spring_boot;

import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Component
@ConfigurationProperties(prefix = "my-custom-property")
public class MyCustomPropertyConfiguration {
    
    private String myString;

    public MyCustomPropertyConfiguration() {
        // Default constructor
    }

    public String getMyString() {
        return this.myString;
    }

    public void setMyString(String s) {
        this.myString = s;
    }
}
