package com.servme.tes.todoapp.model.request;

import com.servme.tes.todoapp.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest extends User {
    @NotBlank(message = "Password is required")
    private String Password;
}
