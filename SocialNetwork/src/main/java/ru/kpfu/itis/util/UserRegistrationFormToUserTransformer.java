package ru.kpfu.itis.util;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.form.UserRegistrationForm;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.model.enums.UserRole;

public class UserRegistrationFormToUserTransformer {

    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static User transform(UserRegistrationForm form) {
        if (form == null) {
            return null;
        }
        User user = new User();
        user.setUsername(form.getUsername().toLowerCase());
        user.setRole(UserRole.ROLE_USER);
        user.setPassword(encoder.encode(form.getPassword()));
        user.setFirstname(form.getFirstname());
        user.setSurname(form.getSurname());
        user.setLastname(form.getLastname());
        user.setbDay(form.getbDay());
        user.setCity(form.getCity());
        return user;
    }
}
