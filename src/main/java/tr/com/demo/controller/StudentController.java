package tr.com.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tr.com.demo.dto.StudentDto;
import tr.com.demo.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/getStudents")
    public List<StudentDto> getStudents() {
        return studentService.getAll();
    }

    @PostMapping("/save")
    public void saveStudent(@RequestBody StudentDto studentDto) {
        studentService.save(studentDto);
    }
}