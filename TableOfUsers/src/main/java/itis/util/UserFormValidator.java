package itis.util;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import itis.model.User;

import java.text.SimpleDateFormat;

public class UserFormValidator implements Validator {

    static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy") {{
        setLenient(false);
    }};

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        if (user.getName() == null || user.getName().isEmpty()) {
            errors.rejectValue("name", "", "Mustn't be empty");
        }

        if (user.getSurname() == null || user.getSurname().isEmpty()) {
            errors.rejectValue("surname", "", "Mustn't be empty");
        }

        if (user.getPatronymic() == null || user.getPatronymic().isEmpty()) {
            errors.rejectValue("patronymic", "", "Mustn't be empty");
        }

        if (!user.getDate().isEmpty() && !dateIsCorrect(user.getDate())) {
            errors.rejectValue("date", "", "Incorrect (dd.MM.yyyy)");
        }

        if (!user.getGender().isEmpty() && !(user.getGender().toLowerCase().equals("male") || user.getGender().toLowerCase().equals("female"))) {
            errors.rejectValue("gender", "", "Incorrect");
        }

    }

    private boolean dateIsCorrect(String date) {
        try {
            sdf.parse(date);
            return true;

        } catch (Exception e) {
        }

        return false;
    }
}