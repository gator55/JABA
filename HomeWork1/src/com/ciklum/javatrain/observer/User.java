package com.ciklum.javatrain.observer;

/**
 * Created with IntelliJ IDEA.
 * User: olp
 * Date: 8/2/13
 * Time: 4:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private int id;
    private String username;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
