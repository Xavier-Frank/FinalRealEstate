package com.jeunice.realestate.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Agent {

    @Id
    private Long agentId;

    @NotNull(message = "Phone Number is Mandatory")
    private Long phoneNumber;
    @NotBlank(message = "First Name is Mandatory")
    private String firstName;
    @NotBlank(message = "Last Name is Mandatory")
    private String lastName;
    @Email
    private String email;
    @NotNull(message = "National ID is Mandatory")
    private Long nationalId;

    public Agent(long agentId, long phoneNumber, String firstName, String lastName, String email, long nationalId) {
    }

    //getters and setters

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getNationalId() {
        return nationalId;
    }

    public void setNationalId(Long nationalId) {
        this.nationalId = nationalId;
    }


//    public Agent(long l, long l1, String jeunice, String mwakisha, String s, long l2) {
//
//    }
}
