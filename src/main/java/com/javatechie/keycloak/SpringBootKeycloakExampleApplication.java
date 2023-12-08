package com.javatechie.keycloak;

import com.javatechie.keycloak.entity.Employee;
import com.javatechie.keycloak.entity.Question;
import com.javatechie.keycloak.repository.QuestionRepository;
import com.javatechie.keycloak.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/employees")
public class SpringBootKeycloakExampleApplication {

//    @Autowired
//    private EmployeeService service;
//
//    //this method can be accessed by user whose role is user
//    @GetMapping("/{employeeId}")
//    @RolesAllowed("user")
//    public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {
//        return ResponseEntity.ok(service.getEmployee(employeeId));
//    }
//
//    //this method can be accessed by user whose role is admin
//    @GetMapping
//    @RolesAllowed("admin")
//    public ResponseEntity<List<Employee>> findALlEmployees() {
//        return ResponseEntity.ok(service.getAllEmployees());
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKeycloakExampleApplication.class, args);
    }
    private QuestionRepository questionRepository;


//    @Bean
//    CommandLineRunner commandLineRunner (){
//        return args -> {
//            questionRepository.save(new Question(null, "questtion1", "reponsej", "theme1", "comment"));
//            questionRepository.save(new Question(null, "questtion2", "reponsej", "theme1", "comment"));
//            questionRepository.save(new Question(null, "questtion3", "reponsej", "theme1", "comment"));
//            questionRepository.save(new Question(null, "questtion4", "reponsej", "theme1", "comment"));
//
//            questionRepository.save(new Question(null, "questtion1", "reponsej", "theme2", "comment"));
//            questionRepository.save(new Question(null, "questtion2", "reponsej", "theme2", "comment"));
//            questionRepository.save(new Question(null, "questtion3", "reponsej", "theme2", "comment"));
//            questionRepository.save(new Question(null, "questtion4", "reponsej", "theme2", "comment"));
//
//            questionRepository.save(new Question(null, "questtion1", "reponsej", "theme3", "comment"));
//            questionRepository.save(new Question(null, "questtion2", "reponsej", "theme3", "comment"));
//            questionRepository.save(new Question(null, "questtion3", "reponsej", "theme3", "comment"));
//            questionRepository.save(new Question(null, "questtion4", "reponsej", "theme3", "comment"));
//        };
//    }

}
