package techno_kryon.spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my-database")
class MyDatabaseConfiguration {

    private String username;
    private String password;
    private String db;

    // Getters

    public String getUserName() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDb() {
        return this.db;
    }

    // Setters

    public void setUserName(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDb(String db) {
        this.db = db;
    }

    // toString Method

    public String toString() {
        return "{\n\tusername: " + this.username + ",\n\tpassword: " + this.password + ",\n\tdb: " + this.db + "\n}";
    }

}
