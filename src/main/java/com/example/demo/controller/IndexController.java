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

public class IndexController {
    @Autowired
    PublicationRepository publicationRepository;
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String root() {return  "index";}

    @PostMapping()
    public String postDemo(@RequestParam("image") String image, @RequestParam("description") String description) {
        System.out.println(image + " - " + description);
        return "redirect:/index/";
    }

    @RequestMapping( method = RequestMethod.POST, consumes=MULTIPART_FORM_DATA)
    public final String addPost(@RequestParam("user") String user_id,
                                @RequestParam("description") String description,
                                @RequestParam("imagine") MultipartFile image) throws IOException {
        File imageFile = new File("src/main/resources/static/images/"+ image.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(imageFile);
        fos.write(image.getBytes());
        fos.close();

        User user = new User("some name", "some pass");
        user.setId(user_id);
        userRepository.save(user);

        Publication p = new Publication(user,image.getOriginalFilename(), description);
        publicationRepository.save(p);

        System.out.println("done");
        return "success";
    }
}
