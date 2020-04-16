package com.example.demo.Util;

import com.example.demo.model.Publication;
import com.example.demo.model.User;
import com.example.demo.repo.PublicationRepository;
import com.example.demo.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Configuration
public class DatabasePreloader {
    private static final Random r = new Random();

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, PublicationRepository publicationRepository) {
            userRepository.deleteAll();
            publicationRepository.deleteAll();

            return(args) -> save(userRepository, publicationRepository);
    }

    private void save(UserRepository userRepository, PublicationRepository publicationRepository){
        List<User> users = Arrays.asList(users());
        userRepository.saveAll(users);

        int publicationAmount = r.nextInt(20) + 10;

        for(int i = 0; i < publicationAmount; i++){
            String username = users.get(r.nextInt(users.size())).getUsername();

            User user = userRepository.findByUsername(username).get();

            Publication p = new Publication(user, Generator.makeName()+".img",Generator.makeDescription());
            publicationRepository.save(p);
        }
    }

    private User[] users() {
        return new User[]{
                new User("Anne", "password1"),
                new User("Marie", "password2"),
                new User("Cris", "password3"),
                new User("Drake", "password4"),
        };
    }
}
