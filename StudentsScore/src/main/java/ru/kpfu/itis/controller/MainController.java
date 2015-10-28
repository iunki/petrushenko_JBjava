package ru.kpfu.itis.controller;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;
        import ru.kpfu.itis.model.Score;
        import ru.kpfu.itis.model.Student;
        import ru.kpfu.itis.model.enums.Subject;
        import ru.kpfu.itis.repository.StudentRepository;
        import ru.kpfu.itis.service.ScoreService;

@Controller
public class MainController {

    @Autowired
    ScoreService scoreService;


    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping(value = "/average", method = RequestMethod.POST)
    public String getAveragePage(@RequestParam(value = "firstname") String firstname,@RequestParam(value = "surname") String surname, @RequestParam(value = "lastname") String lastname, Model model){
        Student student = studentRepository.getByName(firstname,surname,lastname);
        model.addAttribute("average", scoreService.getAvg(student));
        return "average";
    }

    @RequestMapping(value = "/sum", method = RequestMethod.POST)
    public String getSummPage(@RequestParam(value = "firstname") String firstname,@RequestParam(value = "surname") String surname, @RequestParam(value = "lastname") String lastname,  Model model){
        Student student = studentRepository.getByName(firstname,surname,lastname);
        model.addAttribute("sum", scoreService.getSum(student));
        return "sum";
    }

    @RequestMapping(value = "/score", method = RequestMethod.POST)
    public String getScorePage(@RequestParam(value = "firstname") String firstname,@RequestParam(value = "surname") String surname, @RequestParam(value = "lastname") String lastname,@RequestParam(value = "subject") Integer subject, Model model){
        Student student = studentRepository.getByName(firstname,surname,lastname);
        model.addAttribute("score", scoreService.getScore(student, subject));
        return "score";
    }

    /*@RequestMapping(value = "/add_to_db")  //заполнение БД
    public String addForDB(){
        for (int i = 0; i<11; i++){
            Student student = new Student();
            student.setFirstname("Yulia"+i);
            student.setSurname("Petrushenko"+i);
            student.setLastname("Aleksandrovna"+i);
            student.setStudgroup("11-406");
            Score score = new Score();
            score.setStudent(student);
            score.setSubject_type(Subject.DATABASES);
            score.setScore(100);
            scoreService.addScore(score);
        }
        return "redirect:/";
    }*/
}
