package com.galaxe.gitconnector.dto;

public class RepoAuthor {
    private String name;
    private String email;
    private String date;

    public RepoAuthor(String name, String email, String date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RepoAuthor{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
