package com.audioOnline.entity;

import java.util.Date;
import java.util.List;

public class User {
    int id;
    String photoUrl;
    int gender;
    String username;
    String password;
    String salt;
    String email;
    Date signupDate;
    // follower 和 followee使用redis存储，因为不需要使用mongoDB实现复杂的查询，且redis内存访问读写更快。
    List<Playlist> collections;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    public List<Playlist> getCollections() {
        return collections;
    }

    public void setCollections(List<Playlist> collections) {
        this.collections = collections;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", photoUrl='" + photoUrl + '\'' +
                ", gender=" + gender +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", email='" + email + '\'' +
                ", signupDate=" + signupDate +
                ", collections=" + collections +
                '}';
    }
}
