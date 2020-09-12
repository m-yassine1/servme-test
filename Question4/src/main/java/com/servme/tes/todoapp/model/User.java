package com.servme.tes.todoapp.model;

import com.servme.tes.todoapp.constant.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Column(name = "first_name")
    @NotBlank(message = "First name is required")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Last name is required")
    private String lastName;

    @Column
    @Email(message = "Email should be a valid email")
    private String email;

    @Column
    @NotBlank(message = "Mobile number is required")
    private String mobileNumber;

    @Column
    private String Password;

    @Enumerated(EnumType.STRING)
    @Column
    private Constant.GENDER gender;

    @Column
    @PastOrPresent(message = "Birthday should be be in the past or now.")
    private LocalDate birthDay;
}
