package com.github.seungcheul.pictures.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainView (){
        return "index";
    }

    @GetMapping("/album")
    public String albumView() {
        return "album/album/album";
    }
}
