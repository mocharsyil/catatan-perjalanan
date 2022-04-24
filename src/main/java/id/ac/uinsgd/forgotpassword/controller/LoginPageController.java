package id.ac.uinsgd.forgotpassword.controller;

import id.ac.uinsgd.forgotpassword.entity.User;
import id.ac.uinsgd.forgotpassword.service.framework.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Locale;


@Controller
@RequestMapping("/login")
public class LoginPageController {
    private final UserService userService;
    private final MessageSource messageSource;


    @Autowired
    public LoginPageController(UserService userService, MessageSource messageSource) {
        this.userService = userService;
        this.messageSource = messageSource;
    }



    @PostMapping
    public String saveUser(@Valid @ModelAttribute("user") User user,
                           BindingResult result,
                           Model model,
                           RedirectAttributes attributes) {
        if (result.hasErrors()) {
            return "login";
        }
        if (userService.findByEmail(user.getEmail()) != null) {
            model.addAttribute("error", messageSource.getMessage("EMAIL_EXISTS", new Object[]{}, Locale.ENGLISH));
        }
        user = userService.save(user);
        if (user == null) {
            model.addAttribute("error", messageSource.getMessage("EMAIL_NOT_SAVED", new Object[]{}, Locale.ENGLISH));
            return "login";
        }
        attributes.addFlashAttribute("success", messageSource.getMessage("EMAIL_SAVED", new Object[]{},
                Locale.ENGLISH));
        return "redirect:/login";
    }
    @GetMapping
    public String Login(){
        return "login";
    }

    @ModelAttribute("user")
    public User user() {
        return new User();
    }
}
