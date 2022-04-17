package id.ac.uinsgd.forgotpassword.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;


@Data
@Entity
public class PasswordResetToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, unique = true)
    private String token;
    @OneToOne(targetEntity = id.ac.uinsgd.forgotpassword.entity.User.class, fetch = FetchType.EAGER)
    private id.ac.uinsgd.forgotpassword.entity.User user;
    @Column(nullable = false)
    private LocalDateTime expirationDate;
}
