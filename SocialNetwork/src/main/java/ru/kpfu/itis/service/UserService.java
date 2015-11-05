package ru.kpfu.itis.service;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.form.UserRegistrationForm;
import ru.kpfu.itis.model.User;

@Service
public interface UserService {

    void saveNewUser(UserRegistrationForm form);

    User findOneByUsername(String username);

    void securedMethod();

    User getCurrentUser();

}
