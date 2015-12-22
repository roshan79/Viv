package com.vivakti.mytravel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 
import javax.validation.constraints.NotNull;

/**
 * An entity User composed by three fields (id, email, name).
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotNull
    private String email;
  
    // The user's name
    @NotNull
    private String name;
    
    // ------------------------
    // PUBLIC METHODS
    // ------------------------
    
    public User() { }
    
    public User(long id) { 
    this.id = id;
    }
    
    public User(String email, String name) {
    this.email = email;
    this.name = name;
    }
    
    // Getter and setter methods
    
    public long getId() {
    return id;
    }
    
    public void setId(long value) {
    this.id = value;
    }
    
    public String getEmail() {
    return email;
    }
    
    public void setEmail(String value) {
    this.email = value;
    }
    
    public String getName() {
    return name;
    }
    
    public void setName(String value) {
    this.name = value;
    }
    
    
}