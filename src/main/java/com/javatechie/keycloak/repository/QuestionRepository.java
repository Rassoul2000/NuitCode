package com.javatechie.keycloak.repository;

import com.javatechie.keycloak.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findQuestionByThemeContains(String theme);

//    List<Question> findQuestionsBySousThemeContains(String sousTheme);
}
