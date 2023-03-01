package com.example.gestionTest.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<MyObject> myObjects = myService.getMyObjects();
        model.addAttribute("myObjects", myObjects);
        return "home";
    }
}
