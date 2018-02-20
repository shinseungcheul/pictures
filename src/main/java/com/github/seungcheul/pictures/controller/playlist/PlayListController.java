package com.github.seungcheul.pictures.controller.playlist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayListController {

    @GetMapping("/playlist/list")
    public String getPlayList(ModelMap model){
        System.out.println("playlist");
        model.addAttribute("playlist","playlist");
        return "dashboard/playlist/list";
    }
}
