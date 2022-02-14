package io.jaeyeon.todo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoEntity {

    @Id @GeneratedValue
    private String id;
    private String userId;
    private String title;
    private boolean done;
}
