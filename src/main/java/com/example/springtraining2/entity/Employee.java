package com.example.springtraining2.entity;



import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
public class Employee {

    @Id
    @GenericGenerator(name="employee_id_seq",strategy = "increment")
    @GeneratedValue(generator = "employee_id_seq",strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String code;

    @ManyToOne(cascade =CascadeType.ALL)
    @JsonBackReference
    private Department department;


}
