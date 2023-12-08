package com.javatechie.keycloak.service;

import com.javatechie.keycloak.entity.Employee;
import com.javatechie.keycloak.entity.Question;
import com.javatechie.keycloak.repository.QuestionRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
@CrossOrigin
@AllArgsConstructor
public class QuestionService {

    QuestionRepository questionRepository;

    @GetMapping("/quizz")
    @RolesAllowed("admin")
    List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @GetMapping("{theme}")
    @RolesAllowed("user")
    List<Question> getQuestionsByTheme(@PathVariable("theme") String theme) {
        return questionRepository.findQuestionByThemeContains(theme);
    }

    @PostMapping("/add")
    @RolesAllowed("admin")
    public Question addQuestions(@RequestBody Question question) {
        return questionRepository.save(question);
    }

    @PostMapping("/delete/{id}")
    @RolesAllowed("admin")
    void deleteQuestionsById(@PathVariable("id") Long id) {
        questionRepository.deleteById(id);
    }


//    @PostConstruct
//    public void initializeEmployeeTable() {
//        questionRepository.saveAll(
//                Stream.of(
//                        new Question(null, "questtion1", "reponsej", "theme1", "comment"),
//                        new Question(null, "questtion2", "reponsej", "theme1", "comment"),
//                        new Question(null, "questtion3", "reponsej", "theme1", "comment"),
//                        new Question(null, "questtion4", "reponsej", "theme1", "comment"),
//                        new Question(null, "questtion1", "reponsej", "theme2", "comment"),
//                        new Question(null, "questtion2", "reponsej", "theme2", "comment"),
//                        new Question(null, "questtion3", "reponsej", "theme2", "comment"),
//                        new Question(null, "questtion4", "reponsej", "theme2", "comment"),
//                        new Question(null, "questtion1", "reponsej", "theme3", "comment"),
//                        new Question(null, "questtion2", "reponsej", "theme3", "comment"),
//                        new Question(null, "questtion3", "reponsej", "theme3", "comment"),
//                        new Question(null, "questtion4", "reponsej", "theme3", "comment"),
//                        new Question(null, "questtion1", "reponsej", "theme4", "comment"),
//                        new Question(null, "questtion2", "reponsej", "theme4", "comment"),
//                        new Question(null, "questtion3", "reponsej", "theme4", "comment"),
//                        new Question(null, "questtion4", "reponsej", "theme4", "comment")
//                ).collect(Collectors.toList()));
//    }


//    @PostMapping("/ajouter")
//    public String addQuestions(Question question){
//        questionRepository.save(question);
//        return "test";
//    }

}