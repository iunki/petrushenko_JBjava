package ru.kpfu.itis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.kpfu.itis.form.UserRegistrationForm;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.UserRepository;

@Component
public class UserRegistrationValidator implements Validator {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(User.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        UserRegistrationForm form = (UserRegistrationForm)o;
        if (userRepository.findByUsername(form.getUsername().toLowerCase()) != null) {
            errors.rejectValue("username", "", "This username is not avaliable");
        }
    }
}
