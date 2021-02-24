package com.example.springtraining2.entity;



import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Data
public class Department{

    @javax.persistence.Id
    @Id
    @GenericGenerator(name="department_id_seq",strategy = "increment")
    @GeneratedValue(generator = "department_id_seq",strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
