package techno_kryon.spring_boot;

import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Component
@ConfigurationProperties(prefix = "my-custom-property")
public class MyCustomPropertyConfiguration {
    
    private String myString2;

    public MyCustomPropertyConfiguration() {
        // Default constructor
    }

    public String getMyString2() {
        return this.myString2;
    }

    public void setMyString2(String s) {
        this.myString2 = s;
    }

    public String toString() {
        return this.myString2;
    }
}
