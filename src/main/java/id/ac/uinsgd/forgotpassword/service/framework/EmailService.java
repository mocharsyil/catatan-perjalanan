package id.ac.uinsgd.forgotpassword.service.framework;

import id.ac.uinsgd.forgotpassword.entity.Mail;


public interface EmailService {
    void send(Mail mail);
}
