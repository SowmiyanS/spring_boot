# Week 8

1. Add Created Date, Created By, Modified Date, Modified By in Employee Table. 

2. Set the Created date column in Employee Add API and set the Modified Date column in Employee update API. 

3. Employee List API - Pass the count variable in the request. Send employee list of response based on the count value.  

# 1. Add Created Date, Created By, Modified Date, Modified By in Employee Table
- Added these fields in the employee entity.

# 2. Set the Created Date column in Employee Add API and set the Modified Date Column in Employee Update API
- 

## Spring security

- After adding spring security to the pom.xml the spring framework enables the default security configuration.
- This will cause spring to show a `login` page with the username = "user" and random password that will be logged to the console everytime we start the application.
- The log of the password looks like this:

      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::                (v3.2.3)
    
    2024-04-14T12:00:21.449+05:30  INFO 3692 --- [           main] techno_kryon.spring_boot.Application     : Starting Application using Java 20.0.2 with PID 3692 (/home/sowmiyan/Projects/TechnoKryon/spring_boot/target/classes started by sowmiyan in /home/sowmiyan/Projects/TechnoKryon/spring_boot)
    2024-04-14T12:00:21.454+05:30  INFO 3692 --- [           main] techno_kryon.spring_boot.Application     : The following 1 profile is active: "dev"
    2024-04-14T12:00:22.729+05:30  INFO 3692 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
    2024-04-14T12:00:22.813+05:30  INFO 3692 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 72 ms. Found 2 JPA repository interfaces.
    2024-04-14T12:00:23.849+05:30  INFO 3692 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
    2024-04-14T12:00:23.874+05:30  INFO 3692 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
    2024-04-14T12:00:23.875+05:30  INFO 3692 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.19]
    2024-04-14T12:00:23.951+05:30  INFO 3692 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2024-04-14T12:00:23.953+05:30  INFO 3692 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2386 ms
    2024-04-14T12:00:24.219+05:30  INFO 3692 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
    2024-04-14T12:00:24.310+05:30  INFO 3692 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.4.4.Final
    2024-04-14T12:00:24.360+05:30  INFO 3692 --- [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
    2024-04-14T12:00:24.696+05:30  INFO 3692 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
    2024-04-14T12:00:24.748+05:30  INFO 3692 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
    2024-04-14T12:00:25.529+05:30  INFO 3692 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@6ba6557e
    2024-04-14T12:00:25.532+05:30  INFO 3692 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
    2024-04-14T12:00:27.066+05:30  INFO 3692 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
    2024-04-14T12:00:39.497+05:30  INFO 3692 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
    2024-04-14T12:00:39.902+05:30  INFO 3692 --- [           main] t.spring_boot.ImportExcelData            : Successfully Opened Excel File
    2024-04-14T12:00:43.076+05:30  INFO 3692 --- [           main] t.spring_boot.ImportExcelData            : Completed reading Excel file and stored results to the database
    2024-04-14T12:00:43.191+05:30  WARN 3692 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
    2024-04-14T12:00:43.741+05:30  WARN 3692 --- [           main] .s.s.UserDetailsServiceAutoConfiguration :
    
    Using generated security password: 78410ee3-370f-40e1-80f1-139899d3d102
    
    This generated password is for development use only. Your security configuration must be updated before running your application in production.
    
    2024-04-14T12:00:44.043+05:30  INFO 3692 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.session.DisableEncodeUrlFilter@32aa27a7, org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@5c7c22ce, org.springframework.security.web.context.SecurityContextHolderFilter@38447073, org.springframework.security.web.header.HeaderWriterFilter@318beab4, org.springframework.web.filter.CorsFilter@738ed8d3, org.springframework.security.web.csrf.CsrfFilter@67544105, org.springframework.security.web.authentication.logout.LogoutFilter@7d619bcb, org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter@98c4a8b, org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter@3fbf66e7, org.springframework.security.web.authentication.ui.DefaultLogoutPageGeneratingFilter@328b2c2a, org.springframework.security.web.authentication.www.BasicAuthenticationFilter@6e200307, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@6b9b9cb9, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@18f1631c, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@517fb2c3, org.springframework.security.web.access.ExceptionTranslationFilter@498cf1dc, org.springframework.security.web.access.intercept.AuthorizationFilter@b67b359]
    2024-04-14T12:00:44.135+05:30  INFO 3692 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
    2024-04-14T12:00:44.152+05:30  INFO 3692 --- [           main] techno_kryon.spring_boot.Application     : Started Application in 23.422 seconds (process running for 24.095)
    2024-04-14T12:00:44.158+05:30  INFO 3692 --- [           main] t.spring_boot.MyCommandLineRunner        : This is my commandline runner!
    2024-04-14T12:00:44.158+05:30  INFO 3692 --- [           main] t.spring_boot.MyCommandLineRunner        : WELCOME TO SPRING BOOT APPLICATION
    2024-04-14T12:00:44.207+05:30  INFO 3692 --- [           main] t.spring_boot.MyCommandLineRunner        : Successfully Connected to Database!

- After disabling the SecurityAutoConfiguration the application starts normally:
      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::                (v3.2.3)
    
    2024-04-14T11:51:28.779+05:30  INFO 3556 --- [           main] techno_kryon.spring_boot.Application     : Starting Application using Java 20.0.2 with PID 3556 (/home/sowmiyan/Projects/TechnoKryon/spring_boot/target/classes started by sowmiyan in /home/sowmiyan/Projects/TechnoKryon/spring_boot)
    2024-04-14T11:51:28.785+05:30  INFO 3556 --- [           main] techno_kryon.spring_boot.Application     : The following 1 profile is active: "dev"
    2024-04-14T11:51:31.684+05:30  INFO 3556 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
    2024-04-14T11:51:31.854+05:30  INFO 3556 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 147 ms. Found 2 JPA repository interfaces.
    2024-04-14T11:51:34.084+05:30  INFO 3556 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
    2024-04-14T11:51:34.131+05:30  INFO 3556 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
    2024-04-14T11:51:34.132+05:30  INFO 3556 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.19]
    2024-04-14T11:51:34.356+05:30  INFO 3556 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2024-04-14T11:51:34.360+05:30  INFO 3556 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 5340 ms
    2024-04-14T11:51:35.612+05:30  INFO 3556 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
    2024-04-14T11:51:35.924+05:30  INFO 3556 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.4.4.Final
    2024-04-14T11:51:36.103+05:30  INFO 3556 --- [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
    2024-04-14T11:51:37.304+05:30  INFO 3556 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
    2024-04-14T11:51:38.084+05:30  INFO 3556 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
    2024-04-14T11:51:42.548+05:30  INFO 3556 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@11c7a0b4
    2024-04-14T11:51:42.552+05:30  INFO 3556 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
    2024-04-14T11:51:47.515+05:30  INFO 3556 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
    2024-04-14T11:52:07.053+05:30  INFO 3556 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
    2024-04-14T11:52:07.780+05:30  INFO 3556 --- [           main] t.spring_boot.ImportExcelData            : Successfully Opened Excel File
    2024-04-14T11:52:22.042+05:30  INFO 3556 --- [           main] t.spring_boot.ImportExcelData            : Completed reading Excel file and stored results to the database
    2024-04-14T11:52:22.323+05:30  WARN 3556 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
    2024-04-14T11:52:23.442+05:30  INFO 3556 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''
    2024-04-14T11:52:23.463+05:30  INFO 3556 --- [           main] techno_kryon.spring_boot.Application     : Started Application in 56.896 seconds (process running for 58.101)
    2024-04-14T11:52:23.470+05:30  INFO 3556 --- [           main] t.spring_boot.MyCommandLineRunner        : This is my commandline runner!
    2024-04-14T11:52:23.470+05:30  INFO 3556 --- [           main] t.spring_boot.MyCommandLineRunner        : WELCOME TO SPRING BOOT APPLICATION
    2024-04-14T11:52:24.000+05:30  INFO 3556 --- [           main] t.spring_boot.MyCommandLineRunner        : Successfully Connected to Database!
    2024-04-14T11:52:33.978+05:30  INFO 3556 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
    2024-04-14T11:52:33.979+05:30  INFO 3556 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
    2024-04-14T11:52:33.982+05:30  INFO 3556 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms

## References:
- [spring boot security](https://howtodoinjava.com/spring-security/enablewebsecurity-annotation/)
- [how disable login page after adding secuity](https://stackoverflow.com/a/55913967)
- [how disable login page after adding secuity 2](https://stackoverflow.com/a/23648756)
- [Java Timestamp and how to use it](https://www.javatpoint.com/java-timestamp)
- [Request Params vs Path Variable and much more](https://howtodoinjava.com/spring-mvc/spring-pathvariable-and-requestparam/)
