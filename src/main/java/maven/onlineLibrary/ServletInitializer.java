package maven.onlineLibrary;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@ComponentScan(basePackages = {"maven.onlineLibrary"})//Redundant declaration: @SpringBootApplication already implies @ComponentScan in default package
public class ServletInitializer extends SpringBootServletInitializer {


}
