package maven.onlineLibrary;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // implements WebApplicationInitializer and makes our project - web_project

//@SpringBootApplication is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes: [...]/ where the @ComponentScan javadoc states
//If specific packages are not defined, scanning will occur from the package of the class that declares this annotation. That is, only the types that are in the same package as your ReadingListApplication will be scanned.
//If you want a custom configuration, provide your own @Configuration, @EnableAutoConfiguration, and @ComponentScan, as appropriate.
//@ComponentScan(basePackages = {"maven.onlineLibrary"})// - Redundant declaration: @SpringBootApplication already implies @ComponentScan in default package

@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

}
