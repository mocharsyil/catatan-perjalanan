package id.ac.uinsgd.forgotpassword.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "First name is required")
    @Column(nullable = false, name = "firstName")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @Column(nullable = false, name = "lastName")
    private String lastName;


    @Column(name ="email", unique = true)
    private String email;


    @Column(name ="phone_number", unique = true)
    private String phoneNumber;

    @NotNull(message = "please enter your birthdate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate tanggal1;

    @NotNull(message = "please enter your birthdate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate tanggal2;

    @NotEmpty(message = "Kota Asal is required")
    @Column(nullable = false, unique = true)
    private String kota1;

    @NotEmpty(message = "Kota Tujuan is required")
    @Column(nullable = false, unique = true)
    private String kota2;
}
