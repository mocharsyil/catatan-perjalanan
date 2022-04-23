package id.ac.uinsgd.forgotpassword.repository;

import id.ac.uinsgd.forgotpassword.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);
}
