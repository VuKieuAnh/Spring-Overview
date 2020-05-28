package controller;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
//    @GetMapping()
//    public String index(){
//        return "home";
//    }

    @GetMapping()
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("home", "className", "C0220H1");
        modelAndView.addObject("total", "18HV");
        return modelAndView;
    }

//    @GetMapping("/{id}")
//    public ModelAndView showDetail(@PathVariable Long id){
//        ModelAndView modelAndView = new ModelAndView("detail");
//        modelAndView.addObject("student", "HV thu" + id);
//        return modelAndView;
//    }

    @GetMapping("/{id}")
    public String showId(@PathVariable Long id, ModelMap modelMap){
        modelMap.addAttribute("student", "Hoc vien thu" + id);
        return "detail";
    }

    @GetMapping("/name")
    public ModelAndView showName(){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("student", new Student());
        return modelAndView;
    }

    @PostMapping("/name")
    public ModelAndView submit(@ModelAttribute Student student){
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("student", student.getName());
        return modelAndView;
    }



}
