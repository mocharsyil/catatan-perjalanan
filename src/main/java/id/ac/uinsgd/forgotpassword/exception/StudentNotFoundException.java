package id.ac.uinsgd.forgotpassword.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1l;
    private String message;

    public StudentNotFoundException(String message){
        this.message= message;
    }
}
