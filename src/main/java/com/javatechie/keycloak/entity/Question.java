package com.javatechie.keycloak.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idQuestion;
    private String question;
    private String reponse;
    private String theme;
    private String commentaire;

//    public Question(String question, String reponse, String theme, String commentaire) {
//        this.question = question;
//        this.reponse = reponse;
//        this.theme = theme;
//        this.commentaire = commentaire;
//    }
}
