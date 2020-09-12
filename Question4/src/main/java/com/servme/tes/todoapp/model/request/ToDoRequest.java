package com.servme.tes.todoapp.model.request;

import com.servme.tes.todoapp.constant.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoRequest {
    @NotBlank(message = "name is required")
    private String name;

    private String description;

    private String category;

    @Enumerated(EnumType.STRING)
    private Constant.STATUS status;

    @NotBlank(message = "due date is required")
    public LocalDateTime dueDate;
}
