package id.ac.uinsgd.forgotpassword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/login")
public class LoginPageController {

    @GetMapping
    public String Login(){
        return "login";
    }
}
