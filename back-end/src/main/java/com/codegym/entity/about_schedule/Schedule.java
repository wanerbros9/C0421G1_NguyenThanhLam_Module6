package com.codegym.entity.about_schedule;

import com.codegym.entity.about_classroom.Classroom;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scheduleId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classroom_id", referencedColumnName = "classroomId")
    private Classroom classroom;

    private boolean deleteFlag;

    @JsonBackReference(value = "schedule_scheduleDetail")
    @OneToMany(mappedBy = "schedule")
    private Set<ScheduleDetail> scheduleDetails;

}
