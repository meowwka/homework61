package com.example.demo.controller;

import com.example.demo.model.Publication;
import com.example.demo.model.User;
import com.example.demo.repo.PublicationRepository;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.apache.tomcat.util.http.fileupload.FileUploadBase.MULTIPART_FORM_DATA;
@RestController
public class ControllerM {
    @Autowired
    PublicationRepository publicationRepository;
    @Autowired
    UserRepository userRepository;


//    @PostMapping("/addPost")
//    public String postDemo(@RequestParam("image") String image, @RequestParam("description") String description) {
//        System.out.println(image + " - " + description);
//        return "redirect:/index/";
//    }

    @GetMapping("/users")
    @ResponseBody
    public Iterable<User> getUsers(){return userRepository.findAll();}

    @GetMapping("/publications")
    @ResponseBody
    public  Iterable<Publication> getPublications(){return publicationRepository.findAll();}
}
