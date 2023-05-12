package br.com.eteczl.workshopspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {

    @GetMapping("/")
    public ModelAndView acessoHome(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        Aluno aluno = new Aluno(
                 "bruno ",
                "bruno@e"
        );
        modelAndView.addObject("primeiroAluno", aluno);
        return modelAndView;
    }
}
