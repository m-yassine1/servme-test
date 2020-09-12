package com.servme.tes.todoapp.model;

import com.servme.tes.todoapp.constant.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
    private String name;
    private String description;
    private String category;
    private Constant.STATUS status;
    private LocalDateTime dueDate;
}
