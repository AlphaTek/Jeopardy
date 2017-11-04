package com.jeopardy.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Wasif
 */
public class Question implements java.io.Serializable {
    
     
    private String category;
    private String value;
    private String question;
    private String A1;
    private String A2;
    private String A3;
    private String A4;
    private String correct;
    
    public Question(){
        
    }
    public Question (String category, String value, String question, 
            String A1, String A2, String A3, String A4, String correct) {
        
        this.category = category;
        this.value = value;
        this.question = question;
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
        this.A4 = A4;
        this.correct = correct;                
        
    
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getQuestion() {
        return question;
    }
    
    public String getQuestion(int qNum) {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA1() {
        return A1;
    }

    public void setA1(String A1) {
        this.A1 = A1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String A2) {
        this.A2 = A2;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String A3) {
        this.A3 = A3;
    }

    public String getA4() {
        return A4;
    }

    public void setA4(String A4) {
        this.A4 = A4;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }


    
    
            
    
    
}
