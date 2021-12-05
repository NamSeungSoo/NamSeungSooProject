package com.nam.join.controller;

import com.nam.join.model.dto.UserDTO;
import com.nam.join.model.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/join/*")
public class JoinController {

    private final JoinService joinService;

    @Autowired
    public JoinController(JoinService joinService){
        this.joinService = joinService;
    }


    @PostMapping("/signup")
    public ModelAndView joinUser(ModelAndView mv, @ModelAttribute UserDTO parameters){

        int result = joinService.joinUser(parameters);

        if (result > 0){


        }

        return mv;
    }

}
