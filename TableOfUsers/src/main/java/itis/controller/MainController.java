package itis.controller;

import itis.model.User;
import itis.service.UserService;
import itis.util.UserFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/")
public class MainController {

    @Autowired
    UserService userService;

    UserFormValidator validator = new UserFormValidator();

    @RequestMapping(value = "/")
    public String getIndexPage(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping(value = "/all")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "all-users";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user, BindingResult result) {
        validator.validate(user, result);
        if (result.hasErrors()) {
            return "index";
        } else {
            userService.addUser(user);
            return "redirect:/all";
        }

    }


}