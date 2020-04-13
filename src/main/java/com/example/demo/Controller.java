package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
//    Map<String, Object> userMap = new HashMap<>();
//
//    public Controller() {
//        // init user Map
//        userMap.put("name", "Aibek");
//        userMap.put("surname", "Askarov");
//        userMap.put("gender", "MALE");
//        userMap.put("birthDate", LocalDate.of(1990, 1, 1));
//        userMap.put("graduated", true);
//        userMap.put("gpa", 3.9);
//
//    }
    @GetMapping
    public String root() {return  "index";}

//    @GetMapping("/demo/getUser")
//    public Map<String, Object> getUser() {
//        return this.userMap;
//    }

    @GetMapping("/demo")
    public String demo(Model model) {
        return "demo";
    }

    @PostMapping("/demo/post")
    public String postDemo(@RequestParam("login") String login, @RequestParam("password") String password) {
        System.out.println(login + " - " + password);
        return "redirect:/demo/";
    }
}
