package techno_kryon.spring_boot;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class MyCustomPropertyComponent {

    @Value("${my-custom-property.myString1}")
    private String myString1;

    public MyCustomPropertyComponent() {
        // Default constructor
    }

    public String getMyString1() {
        return this.myString1;
    }

    public void setMyString1(String s) {
        this.myString1 = s;
    }

    public String toString() {
        return this.myString1;
    }

}
