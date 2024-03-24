# Week 2 tasks

1. How to make our application into WAR file using maven.
2. Use of properties file.
3. Declare some custom values inside properties file and use it in .java file.
4. Download and install dbeaver, create a MySQL database and connect with spring boot application.

## 1) How to make our application into WAR file using maven.

- Our project can be converted into WAR file.
- Run `mvn clean install`.

### output: 
    see below

## 2) Use of properties file.

- This project uses the `applications.properties` file for many purposes.
1. To change the default port number of the tomcat server. `server.port=5000`
2. To create our own custom properties. `myStringProperty="This is my string from application.properties file!."`
- There are two ways to access our custom property values inside our java program.
    - Spring Framework \- Use of @Value() annotation and Spring Beans
        - There is MyCustomPropertyComponent class, it is @Autowired to get the values from application.properties
        - In this method we use @Value("${my-custom-property.myString1}") and @Component()
    - Spring Boot Framework \- Use of @ConfigurationProperties() annotation
        - There is MyCustomPropertyConfiguration class, it is @Autowired to get the values from application.properties
        - In this method 2 we use @ConfigurationProperties(prefix = "my-custom-property") and @Component Annotation and create a private variable with same name as in application properties file.
- In Both methods we @Autowired the classes so that the values are loaded by spring framework.

## 3) Declare some custom values in application.properties file and use it in java file.

- Created a Database config in application.property file.
- Access it by using @ConfigurationProperties Annotation and storing it's value inside a DatabaseConfiguration Component.
- Using MyCommandLineRunner java class to print the database configuration values to the console.
Notes:
    - use @Autowired annotation outside of run() method otherwise get errors:
        - modifier private is not allowed here error in spring boot
        - annotation interface not applicable to this kind of declaraion error in spring boot 

## 4) Download and install dbeaver, create a Mysql database and connect with spring boot application.

- For this application to test locally we need a database server to be running locally.
- DBeaver Community is a free, multi-platform database tool for developers.
- To download DBeaver visit : [https://dbeaver.io/download/](https://dbeaver.io/download/)
1. Add the mysql-connector-java dependency to pom.xml.
2. Add datasource configuration in properties file.
3. Add two dependencies in pom.xml \- mysql-connector-java with version number and spring-boot-starter-jdbc.
4. Connect to database and print if database was connected successfully.

### Output:

    sowmiyan@debian:~/Projects/TechnoKryon/spring_boot$ ./mvnw spring-boot:run
    [INFO] Scanning for projects...
    [INFO]
    [INFO] ----------------------< techno_kryon:spring_boot >----------------------
    [INFO] Building spring_boot 0.0.1-SNAPSHOT
    [INFO]   from pom.xml
    [INFO] --------------------------------[ war ]---------------------------------
    [INFO]
    [INFO] >>> spring-boot:3.2.3:run (default-cli) > test-compile @ spring_boot >>>
    [INFO]
    [INFO] --- resources:3.3.1:resources (default-resources) @ spring_boot ---
    [INFO] Copying 3 resources from src/main/resources to target/classes
    [INFO] Copying 0 resource from src/main/resources to target/classes
    [INFO]
    [INFO] --- compiler:3.11.0:compile (default-compile) @ spring_boot ---
    [INFO] Changes detected - recompiling the module! :source
    [INFO] Compiling 8 source files with javac [debug release 17] to target/classes
    [INFO]
    [INFO] --- resources:3.3.1:testResources (default-testResources) @ spring_boot ---
    [INFO] skip non existing resourceDirectory /home/sowmiyan/Projects/TechnoKryon/spring_boot/src/test/resources
    [INFO]
    [INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ spring_boot ---
    [INFO] Changes detected - recompiling the module! :dependency
    [INFO] Compiling 1 source file with javac [debug release 17] to target/test-classes
    [INFO]
    [INFO] <<< spring-boot:3.2.3:run (default-cli) < test-compile @ spring_boot <<<
    [INFO]
    [INFO]
    [INFO] --- spring-boot:3.2.3:run (default-cli) @ spring_boot ---
    [INFO] Attaching agents: []

      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::                (v3.2.3)

    2024-03-10T15:11:40.096+05:30  INFO 14726 --- [           main] techno_kryon.spring_boot.Application     : Starting Application using Java 20.0.2 with PID 14726 (/home/sowmiyan/Projects/TechnoKryon/spring_boot/target/classes started by sowmiyan in /home/sowmiyan/Projects/TechnoKryon/spring_boot)
    2024-03-10T15:11:40.101+05:30  INFO 14726 --- [           main] techno_kryon.spring_boot.Application     : The following 1 profile is active: "dev"
    2024-03-10T15:11:41.818+05:30  INFO 14726 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
    2024-03-10T15:11:41.840+05:30  INFO 14726 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
    2024-03-10T15:11:41.841+05:30  INFO 14726 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.19]
    2024-03-10T15:11:42.018+05:30  INFO 14726 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2024-03-10T15:11:42.022+05:30  INFO 14726 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1808 ms
    2024-03-10T15:11:42.821+05:30  INFO 14726 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
    2024-03-10T15:11:42.844+05:30  INFO 14726 --- [           main] techno_kryon.spring_boot.Application     : Started Application in 3.392 seconds (process running for 4.245)

        This is my commandline runner!


        WELCOME TO SPRING BOOT APPLICATION

    {
        username: "root",
        password: "root",
        db: "db_example"
    }
    2024-03-10T15:11:42.858+05:30  INFO 14726 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
    2024-03-10T15:11:43.502+05:30  INFO 14726 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@73894c5a
    2024-03-10T15:11:43.505+05:30  INFO 14726 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.

        Successfully Connected to Database!

### Output for 1) generating WAR file:
    sowmiyan@debian:~/Projects/TechnoKryon/spring_boot$ mvn clean install
    [INFO] Scanning for projects...
    [INFO]
    [INFO] ----------------------< techno_kryon:spring_boot >----------------------
    [INFO] Building spring_boot 0.0.1-SNAPSHOT
    [INFO]   from pom.xml
    [INFO] --------------------------------[ war ]---------------------------------
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-war-plugin/3.4.0/maven-war-plugin-3.4.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-war-plugin/3.4.0/maven-war-plugin-3.4.0.pom (8.4 kB at 5.5 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-war-plugin/3.4.0/maven-war-plugin-3.4.0.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-war-plugin/3.4.0/maven-war-plugin-3.4.0.jar (83 kB at 137 kB/s)
    [INFO]
    [INFO] --- clean:3.3.2:clean (default-clean) @ spring_boot ---
    [INFO] Deleting /home/sowmiyan/Projects/TechnoKryon/spring_boot/target
    [INFO]
    [INFO] --- resources:3.3.1:resources (default-resources) @ spring_boot ---
    [INFO] Copying 3 resources from src/main/resources to target/classes
    [INFO] Copying 0 resource from src/main/resources to target/classes
    [INFO]
    [INFO] --- compiler:3.11.0:compile (default-compile) @ spring_boot ---
    [INFO] Changes detected - recompiling the module! :source
    [INFO] Compiling 8 source files with javac [debug release 17] to target/classes
    [INFO]
    [INFO] --- resources:3.3.1:testResources (default-testResources) @ spring_boot ---
    [INFO] skip non existing resourceDirectory /home/sowmiyan/Projects/TechnoKryon/spring_boot/src/test/resources
    [INFO]
    [INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ spring_boot ---
    [INFO] Changes detected - recompiling the module! :dependency
    [INFO] Compiling 1 source file with javac [debug release 17] to target/test-classes
    [INFO]
    [INFO] --- surefire:3.1.2:test (default-test) @ spring_boot ---
    [INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
    Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.pom (3.0 kB at 25 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.jar (184 kB at 151 kB/s)
    [INFO]
    [INFO] -------------------------------------------------------
    [INFO]  T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running techno_kryon.spring_boot.ApplicationTests
    15:14:27.326 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [techno_kryon.spring_boot.ApplicationTests]: ApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
    15:14:27.579 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration techno_kryon.spring_boot.Application for test class techno_kryon.spring_boot.ApplicationTests

      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::                (v3.2.3)

    2024-03-10T15:14:28.722+05:30  INFO 14872 --- [           main] t.spring_boot.ApplicationTests           : Starting ApplicationTests using Java 20.0.2 with PID 14872 (started by sowmiyan in /home/sowmiyan/Projects/TechnoKryon/spring_boot)
    2024-03-10T15:14:28.724+05:30  INFO 14872 --- [           main] t.spring_boot.ApplicationTests           : The following 1 profile is active: "dev"
    2024-03-10T15:14:32.382+05:30  INFO 14872 --- [           main] t.spring_boot.ApplicationTests           : Started ApplicationTests in 4.359 seconds (process running for 6.591)

        This is my commandline runner!


        WELCOME TO SPRING BOOT APPLICATION

    {
        username: "root",
        password: "root",
        db: "db_example"
    }
    2024-03-10T15:14:32.397+05:30  INFO 14872 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
    2024-03-10T15:14:33.355+05:30  INFO 14872 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@72ce812e
    2024-03-10T15:14:33.361+05:30  INFO 14872 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.

        Successfully Connected to Database!

    Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.08 s -- in techno_kryon.spring_boot.ApplicationTests
    [INFO]
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO]
    [INFO] --- war:3.4.0:war (default-war) @ spring_boot ---
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.pom (5.9 kB at 42 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.7.1/plexus-archiver-4.7.1.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.7.1/plexus-archiver-4.7.1.pom (6.5 kB at 31 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.1/plexus-io-3.4.1.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.1/plexus-io-3.4.1.pom (6.0 kB at 37 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-2/zstd-jni-1.5.5-2.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-2/zstd-jni-1.5.5-2.pom (1.9 kB at 11 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-mapping/3.0.0/maven-mapping-3.0.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-mapping/3.0.0/maven-mapping-3.0.0.pom (4.1 kB at 15 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/22/maven-shared-components-22.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/22/maven-shared-components-22.pom (5.1 kB at 23 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/27/maven-parent-27.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/27/maven-parent-27.pom (41 kB at 129 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/17/apache-17.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/17/apache-17.pom (16 kB at 136 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.pom (6.6 kB at 18 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.0/maven-3.0.pom (22 kB at 102 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/15/maven-parent-15.pom (24 kB at 194 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/6/apache-6.pom (13 kB at 65 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.pom (3.9 kB at 16 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.pom (2.2 kB at 9.6 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.14/plexus-interpolation-1.14.pom (910 B at 4.1 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.1.18/plexus-components-1.1.18.pom (5.4 kB at 22 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.pom (1.9 kB at 9.7 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.pom (1.9 kB at 7.1 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom (2.3 kB at 10 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.pom (5.4 kB at 35 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-plexus/1.4.2/guice-plexus-1.4.2.pom (3.1 kB at 42 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-bean/1.4.2/guice-bean-1.4.2.pom (2.6 kB at 15 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject/1.4.2/sisu-inject-1.4.2.pom (1.2 kB at 21 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-parent/1.4.2/sisu-parent-1.4.2.pom (7.8 kB at 40 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/6/forge-parent-6.pom (11 kB at 37 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.4/plexus-component-annotations-1.5.4.pom (815 B at 5.9 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.4/plexus-containers-1.5.4.pom (4.2 kB at 50 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.5/plexus-2.0.5.pom (17 kB at 91 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.pom (4.0 kB at 19 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.6/plexus-2.0.6.pom (17 kB at 112 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.pom (5.5 kB at 55 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7.pom (11 kB at 57 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.pom (2.2 kB at 39 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.pom (2.5 kB at 10 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.pom (1.7 kB at 12 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-parent/1.7/aether-parent-1.7.pom (7.7 kB at 95 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.pom (2.1 kB at 13 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.pom (3.7 kB at 27 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.pom (1.7 kB at 19 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar (151 kB at 160 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.7.1/plexus-archiver-4.7.1.jar
    Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-2/zstd-jni-1.5.5-2.jar
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-mapping/3.0.0/maven-mapping-3.0.0.jar
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-mapping/3.0.0/maven-mapping-3.0.0.jar (11 kB at 13 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar (38 kB at 9.2 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar (30 kB at 4.9 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.7.1/plexus-archiver-4.7.1.jar (221 kB at 36 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar (52 kB at 7.2 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar (527 kB at 73 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar (165 kB at 23 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar (49 kB at 6.7 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar (14 kB at 1.8 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar (148 kB at 19 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar (51 kB at 6.4 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-util/1.7/aether-util-1.7.jar (108 kB at 13 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar (106 kB at 13 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar (74 kB at 8.5 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-bean/1.4.2/sisu-inject-bean-1.4.2.jar (153 kB at 17 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar (46 kB at 4.8 kB/s)
    Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.jar (29 kB at 2.9 kB/s)
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.jar (13 kB at 1.3 kB/s)
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar (202 kB at 19 kB/s)
    Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/2.1.7/sisu-guice-2.1.7-noaop.jar (472 kB at 38 kB/s)
    Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-2/zstd-jni-1.5.5-2.jar (5.9 MB at 207 kB/s)
    [INFO] Packaging webapp
    [INFO] Assembling webapp [spring_boot] in [/home/sowmiyan/Projects/TechnoKryon/spring_boot/target/spring_boot-0.0.1-SNAPSHOT]
    [INFO] Processing war project
    [INFO] Building war: /home/sowmiyan/Projects/TechnoKryon/spring_boot/target/spring_boot-0.0.1-SNAPSHOT.war
    [INFO]
    [INFO] --- spring-boot:3.2.3:repackage (repackage) @ spring_boot ---
    [INFO] Replacing main artifact /home/sowmiyan/Projects/TechnoKryon/spring_boot/target/spring_boot-0.0.1-SNAPSHOT.war with repackaged archive, adding nested dependencies in BOOT-INF/.
    [INFO] The original artifact has been renamed to /home/sowmiyan/Projects/TechnoKryon/spring_boot/target/spring_boot-0.0.1-SNAPSHOT.war.original
    [INFO]
    [INFO] --- install:3.1.1:install (default-install) @ spring_boot ---
    [INFO] Installing /home/sowmiyan/Projects/TechnoKryon/spring_boot/pom.xml to /home/sowmiyan/.m2/repository/techno_kryon/spring_boot/0.0.1-SNAPSHOT/spring_boot-0.0.1-SNAPSHOT.pom
    [INFO] Installing /home/sowmiyan/Projects/TechnoKryon/spring_boot/target/spring_boot-0.0.1-SNAPSHOT.war to /home/sowmiyan/.m2/repository/techno_kryon/spring_boot/0.0.1-SNAPSHOT/spring_boot-0.0.1-SNAPSHOT.war
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  01:04 min
    [INFO] Finished at: 2024-03-10T15:15:19+05:30
    [INFO] ------------------------------------------------------------------------
    sowmiyan@debian:~/Projects/TechnoKryon/spring_boot$ ls target/
    classes            generated-test-sources  maven-status                spring_boot-0.0.1-SNAPSHOT.war           surefire-reports
    generated-sources  maven-archiver          spring_boot-0.0.1-SNAPSHOT  spring_boot-0.0.1-SNAPSHOT.war.original  test-classes

## References:

- `Application Properties` : [spring boot - application properties](https://www.geeksforgeeks.org/spring-boot-application-properties/) 
- `Custom properties` : [javatechonline](https://javatechonline.com/spring-boot-application-properties/)
- `Spring Common Application Properties` : [docs.spring.io](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties.testing)
- `Accessing values from application property` : [javacodegeeks](https://examples.javacodegeeks.com/accessing-values-from-application-properties-in-spring-boot/)
- `Ways of using Command Line Runner` : [javaguides](https://www.javaguides.net/2020/02/spring-boot-commandlinerunner-example.html)
- `Ways to connect to mysql database` : [codejava](https://www.codejava.net/frameworks/spring-boot/connect-to-mysql-database-examples)
- `spring-boot-starter-jdbc` : [maven repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-jdbc)
- `mysql-connector-j | mysql-connector-java` : [maven repository](https://mvnrepository.com/artifact/com.mysql/mysql-connector-java)
- `Mysql select database` : [mysqltutorial](https://www.mysqltutorial.net/mysql-select-database/)
