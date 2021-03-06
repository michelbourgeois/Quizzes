package com.example.michel.quizzes20;


import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String email;
    private String username;
    private String password;
    private ArrayList<Quiz> quizList;

    public User(String email, String username, String password, ArrayList<Quiz> quizList) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.quizList = quizList;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(ArrayList<Quiz> quizList) {
        this.quizList = quizList;
    }

}
