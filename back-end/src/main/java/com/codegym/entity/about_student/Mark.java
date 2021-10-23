package com.codegym.entity.about_student;

import com.codegym.entity.about_schedule.Subject;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer markId;

    @ManyToOne(targetEntity = Student.class)
    @JoinColumn(name = "student_id",referencedColumnName = "studentId")
    private Student student;

    @ManyToOne(targetEntity = Subject.class)
    @JoinColumn(name = "subject_id",referencedColumnName = "subjectId")
    private Subject subject;

    private Double markPointNumber1;
    private Double markPointNumber2;
    private Double markPointNumber3;

}
