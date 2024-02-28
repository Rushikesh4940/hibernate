package com.example.hibernatepractice.Tables;

import jakarta.persistence.*;

@Entity
@Table(name = "userinfo")
public class UserInfo {
    public int getId() {
        return id;
    }
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String email;
    @Column
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public UserInfo(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
