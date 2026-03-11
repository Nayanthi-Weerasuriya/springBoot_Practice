package com.example.demo.models;

import java.util.List;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="projects")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private @Nullable Integer projID;
    private String projname;
    private String gitHubURL;
    private String youtubeURL;

@ManyToMany(mappedBy = "projects") // mappedBy points to the field name in Student
private List<student> students;
}
