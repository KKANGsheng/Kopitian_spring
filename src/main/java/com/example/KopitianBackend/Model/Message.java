package com.example.KopitianBackend.Model;


import javax.persistence.*;

@Entity
@Table(name="Message")
public class Message {

    @Column(name="firstname")
    public String FirstName;
    @Column(name="lastname")
    public String LastName;
    @Column(name="email")
    public String email;
    @Column(name="message")
    public String Message;
    @Id
    @GeneratedValue()
    @Column(name="id")
    private int id;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Message(String firstName, String lastName, String email, String message) {
        FirstName = firstName;
        LastName = lastName;
        this.email = email;
        Message = message;
    }
}
