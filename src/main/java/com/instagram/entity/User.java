package com.instagram.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String userId;
    @NotNull
    @Length(min = 3, max = 50)
    private String username;
    @NotNull
    @Length(min = 3, max = 50)
    private String firstName;
    @NotNull
    @Length(min = 3, max = 50)
    private String lastName;
    @NotNull
    @Length(min = 5, max = 100)
    private String password;
    private String profileImageUrl;
    @NotNull
    @Email
    private String email;

    private Boolean enabled;

    private String role; // ROLE_USER { read, edit }, ROLE_ADMIN { delete }
    private String[] authorities;
    private boolean isActive;
    private boolean isNotLocked;


}
