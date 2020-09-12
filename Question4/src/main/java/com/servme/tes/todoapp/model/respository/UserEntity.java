package com.servme.tes.todoapp.model.respository;

import com.servme.tes.todoapp.model.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EqualsAndHashCode(exclude = "toDos", callSuper = true)
@Table(name = "user")
public class UserEntity extends User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @OneToMany(targetEntity= ToDoEntity.class, mappedBy="todo", fetch=FetchType.EAGER)
    private List<ToDoEntity> toDos;
}
