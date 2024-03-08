## Week 1 (Create and run an application)
1. Understanding the spring boot framework. (What, why,advantage)
2. Create spring boot project using spring initializr. Maven [https://start.spring.io/](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.2.3&packaging=war&jvmVersion=17&groupId=techno_kryon&artifactId=spring_boot&name=spring_boot&description=Demo%20project%20for%20Spring%20Boot&packageName=techno_kryon.spring_boot)
3. Import that project using IDE. Once application runs, WELCOME TO SPRING BOOT APPLICATION should be printed in the console.
4. Push the code in Git.

### To start the application run

`mvnw spring-boot:run`

### Output:

      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::                (v3.2.3)

    2024-03-08T22:49:50.156+05:30  INFO 3982 --- [           main] techno_kryon.spring_boot.Application     : Starting Application using Java 20.0.2 with PID 3982 (/home/sowmiyan/Projects/TechnoKryon/spring_boot/target/classes started by sowmiyan in /home/sowmiyan/Projects/TechnoKryon/spring_boot)
    2024-03-08T22:49:50.162+05:30  INFO 3982 --- [           main] techno_kryon.spring_boot.Application     : No active profile set, falling back to 1 default profile: "default"
    2024-03-08T22:49:51.589+05:30  INFO 3982 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
    2024-03-08T22:49:51.611+05:30  INFO 3982 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
    2024-03-08T22:49:51.612+05:30  INFO 3982 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.19]
    2024-03-08T22:49:51.680+05:30  INFO 3982 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2024-03-08T22:49:51.682+05:30  INFO 3982 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1426 ms
    2024-03-08T22:49:52.175+05:30  INFO 3982 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
    2024-03-08T22:49:52.191+05:30  INFO 3982 --- [           main] techno_kryon.spring_boot.Application     : Started Application in 2.6 seconds (process running for 3.041)

            WELCOME TO SPRING BOOT APPLICATION

