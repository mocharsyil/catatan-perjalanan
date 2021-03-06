package id.ac.uinsgd.forgotpassword.service.implementation;

import id.ac.uinsgd.forgotpassword.entity.Student;
import id.ac.uinsgd.forgotpassword.repository.StudentRepository;
import id.ac.uinsgd.forgotpassword.service.framework.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository =studentRepository;
    }

    @Override
    public Optional<Student> findByEmail(String email) {

        return studentRepository.findByEmail(email);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {

        return studentRepository.findById(id);
    }



    @Override
    public Student save(Student std) {

        return studentRepository.save(std);
    }

    @Override
    public void deleteById(Long id) {

        studentRepository.deleteById(id);
    }
}
