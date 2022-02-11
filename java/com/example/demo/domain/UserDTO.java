package com.example.demo.domain;

public class UserDTO {
    private final static UserDTO userDTO = new UserDTO();
    public UserDTO(){}
    public static UserDTO getInstance(){return userDTO;}

    public static String WEB = "안녕하십니까";
    private String id;
    private String pw;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }}



