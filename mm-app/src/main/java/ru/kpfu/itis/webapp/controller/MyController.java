package ru.kpfu.itis.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.itis.MyService;
import ru.kpfu.itis.MyServiceImpl;

@Controller
public class MyController {

    MyService myService = new MyServiceImpl();

    @RequestMapping("/")
    public String getIndexPage(Model model) {
        model.addAttribute("text", myService.getMyModelValue());
        return "index";
    }

}
