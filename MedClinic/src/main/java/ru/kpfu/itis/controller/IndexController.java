package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.service.MedClinicService;

import java.util.Date;

@Controller
public class IndexController {


    @Autowired
    MedClinicService medClinicService;

    @RequestMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @RequestMapping("/getAvgSalaryInClinic")
    public String showClinicInfo(@RequestParam("name") String name, Model model) {
        model.addAttribute("avgSalary", medClinicService.getAverageSalary(name));
        return "index";
    }

    @RequestMapping("/getStuffInfo")
    public String getStuffInfo(@RequestParam("name") String name, @RequestParam("fio") String fio, Model model) {
        model.addAttribute("salary", medClinicService.getSalaryOfStuff(name, fio));
        Date start = medClinicService.getStartDate(name, fio);
        Date end = medClinicService.getEndDate(name, fio);
        model.addAttribute("startTime", start);
        model.addAttribute("endTime", end);
        return "index";
    }

    @RequestMapping("/getAvgCheckByMedClinic")
    public String getAvgCheck(@RequestParam("name") String name, Model model){
        model.addAttribute("avgMedCheck", medClinicService.getAvgMedCheck(name));
        return "index";
    }

    @RequestMapping("/getAvgCheckByOffice")
    public String getAvgCheckByOffice(@RequestParam("name") String name, @RequestParam("city") String city, @RequestParam("streer") String street, Model model){
        model.addAttribute("avgMedAndOfficeCheck", medClinicService.getAvgMedAndOfficeCheck(name, city, street));
        return "index";
    }

    /*@RequestMapping("/operationSupplier")
    public String operationSupplier (@RequestParam("name") String name, @RequestParam("city") String city, @RequestParam("streer") String street, @RequestParam("providerName") String providerName, Model model){
        model.addAttribute("send", medClinicService.goodSend(name,city,street,providerName));
    }*/

    /*@RequestMapping("/mostProfitable")
    public String getMostProfitable(Model model){
        medClinicService.getProfitableClinic();
        medClinicService.getProfitableOffice();
    }*/

}


