package edu.escuelaing.ieti.lab2.entities;

import edu.escuelaing.ieti.lab2.dto.UserDto;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String id;

    private String name;

    @Indexed( unique = true )
    private String email;

    private String lastName;

    private Date createdAt;

    public User(UserDto userDto, String id, Date createdAt){
        this.id = id;
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.lastName = userDto.getLastName();
        this.createdAt = createdAt;
    }

    public User(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
