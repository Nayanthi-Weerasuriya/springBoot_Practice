package com.example.demo.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="students")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private @Nullable Integer id;
    private String name;
    private String email;

    //public student(String name,String email){
    //this.name=name;this.email=email;}
}
