package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.form.UserRegistrationForm;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.service.UserService;
import ru.kpfu.itis.util.UserRegistrationValidator;

import javax.validation.Valid;

@Controller
public class AuthController {

    @Autowired
    UserService userService;

    @Autowired
    UserRegistrationValidator validator;

    @RequestMapping(value = "/")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String getLoginPage(@RequestParam(value = "error", required = false) Boolean error, Model model) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        return "login";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistrationPage(Model model) {
        model.addAttribute("userform", new UserRegistrationForm());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("userform") @Valid UserRegistrationForm form, BindingResult result) {
        validator.validate(form, result);
        if (result.hasErrors()) {
            return "registration";
        }
        userService.saveNewUser(form);
        return "redirect:/login";
    }

    @RequestMapping(value = "/users/{username}")
    public String showUserPage(@PathVariable("username") String username, Model model) {
        model.addAttribute("currUsername", username);
        model.addAttribute("notAnonymous", SecurityContextHolder.getContext().getAuthentication().isAuthenticated()+"");
        User user = userService.findOneByUsername(username);
        model.addAttribute("firstname", user.getFirstname());
        model.addAttribute("surname", user.getSurname());
        model.addAttribute("lastname", user.getLastname());
        model.addAttribute("city", user.getCity());
        model.addAttribute("bDay", user.getbDay());
        return "user-page";
    }


    @RequestMapping(value = "/users")
    public String users (){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = user.getUsername();
        return "redirect:/users/"+username;
    }

}
