package id.ac.uinsgd.forgotpassword.service.framework;

import id.ac.uinsgd.forgotpassword.entity.PasswordResetToken;


public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}
