package com.prueba.daniel.juliao.pruebaDaniel.controllers;

import com.prueba.daniel.juliao.pruebaDaniel.Models.JugadorModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class RondaControllers {

    @GetMapping("/ronda")
    public String iniciarJuego(Model model){
      model.addAttribute("score","0" );
      model.addAttribute("judador", new JugadorModel());
        return "inicio";
    }

    @PostMapping("/inicio")
    public ModelAndView configurarJuego(){

        ModelAndView mav = new ModelAndView("startRonda.html");

        return mav;
    }



}
