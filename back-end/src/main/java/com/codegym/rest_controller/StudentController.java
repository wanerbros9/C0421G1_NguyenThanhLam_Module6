package com.codegym.rest_controller;

import com.codegym.dto.StudentDto;
import com.codegym.entity.about_classroom.Classroom;
import com.codegym.entity.about_student.Student;
import com.codegym.entity.about_teacher.Teacher;
import com.codegym.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> showAll() {
        List<Student> studentList = studentService.findAll();
        if (studentList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
        this.studentService.saveStudent(student.isDeleteFlag(), student.getStudentAddress(),
                student.getStudentDateOfBirth(), student.getStudentEthnicity(), student.getStudentFatherName(),
                String.valueOf(student.getStudentGender()), student.getStudentMotherName(), student.getStudentName(),
                student.getStudentParentPhone(), student.getStudentReligion());
        return new ResponseEntity<>(student.getStudentId(), HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<?> editStudent(@RequestBody @Validated StudentDto studentDto) {
        studentService.editStudent(studentDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
