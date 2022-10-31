package maven.onlineLibrary.spring.controller;

import lombok.extern.java.Log;
import maven.onlineLibrary.entity.Author;
import maven.onlineLibrary.spring.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Alima-T 10/9/2022
 */

//@Controller
//@Log
public class RedirectController {
    @Autowired // scanning of the package and searching classes with @Component (creates beans) and find beans
    //You can define beans in other ways: with a <bean> declaration in an XML context configuration, with a @Bean method in a @Configuration class, etc.
    //AuthorRepository has @Repository, which has @Component
    private AuthorRepository authorRepository;

    // when start a project, the first request comes here
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String basicUrlRedirect (HttpServletRequest req, HttpServletResponse resp){
        List<Author> authorList = authorRepository.findAll();
        return "ok";
    }
}
