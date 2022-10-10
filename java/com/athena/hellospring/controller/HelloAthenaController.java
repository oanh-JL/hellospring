package com.athena.hellospring.controller;


import com.athena.hellospring.model.entity.Student;
import com.athena.hellospring.model.request.CreateStudentRequest;
import com.athena.hellospring.model.request.UpdatedStudentRequest;
import com.athena.hellospring.model.response.StudentResponse;
import com.athena.hellospring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/athena")
public class HelloAthenaController {

    @Autowired
    private StudentService service;

    @GetMapping("/jb101")
    public String willing() {
        return theEnd();
    }

    @PostMapping("/jb101")
    public String theEnd() {
        return "The End";
    }

    @PostMapping("/student")
    public ResponseEntity<StudentResponse> create(@RequestBody CreateStudentRequest request) {
        StudentResponse response = service.create(request);
        return ResponseEntity.ok(response);
    }
    @PutMapping("/all/{id}")
    public ResponseEntity<StudentResponse> update(@PathVariable(name = "id") int id, @RequestBody UpdatedStudentRequest request) {
        StudentResponse response1 = service.update(id, request);
        return ResponseEntity.ok(response1);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<List<Student>> delete(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(service.delete(id));
    }

    @Service
    public class CityService {

    }
    @Component
    public class CityService1 {

    }
    @Configuration
    public class app {
        //@Bean
        public class Cityservice2 {

        }
    }
}
