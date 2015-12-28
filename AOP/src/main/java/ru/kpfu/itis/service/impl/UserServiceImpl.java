package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.annotation.ExceptionLogging;
import ru.kpfu.itis.form.UserRegistrationForm;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.UserRepository;
import ru.kpfu.itis.service.UserService;
import ru.kpfu.itis.util.UserRegistrationFormToUserTransformer;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @ExceptionLogging
    @Override
    public void saveNewUser(UserRegistrationForm form) {
        User user = UserRegistrationFormToUserTransformer.transform(form);
        userRepository.save(user);
        throw new RuntimeException("ошибкаааааааа");
    }

    @Secured("hasRole('ROLE_ADMIN')")
    @Override
    public void securedMethod() {
        //FIXME
    }


}
