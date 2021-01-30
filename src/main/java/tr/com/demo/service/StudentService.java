package tr.com.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.demo.dto.StudentDto;
import tr.com.demo.repository.StudentRepository;
import tr.com.demo.mapper.StudentMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public void save(StudentDto studentDto) {
        studentRepository.save(studentMapper.studentDto2Student(studentDto));
    }

    public List<StudentDto> getAll() {
        return studentMapper.listStudent2StudentDto(studentRepository.findByDeleted(Boolean.FALSE));
    }
}