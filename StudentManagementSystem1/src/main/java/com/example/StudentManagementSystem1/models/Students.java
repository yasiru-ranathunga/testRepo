package com.example.StudentManagementSystem1.models;

import javax.persistence.*;

@Entity
@Table(name ="student_test")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "first_name",nullable = false)
    private String firstname;
    
    @Column(name = "last_name",nullable = false)
    private String lastname;
    
//    @Column(name="e_mail",nullable = false)
//    private String email;

    public Students() {}

    public Students(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
//        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
//    public String getemail() {
//		return email;
//	}
//
//    public void setemail(String email) {
//		this.email = email;
//	}
}
