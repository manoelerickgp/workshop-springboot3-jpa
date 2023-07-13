package com.estudoweb.courseSpringBoot.config;

import com.estudoweb.courseSpringBoot.entities.User;
import com.estudoweb.courseSpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User user3 = new User(null, "Bob Brown", "bob@gmail.com", "832984243", "12121212");
        User user4 = new User(null, "Mike Ross", "mike@gmail.com", "82193891", "49092304");
        User user5 = new User(null, "Maria Silva", "maria@gmail.com", "123456789", "senha");
        User user6 = new User(null, "Julie White", "julie@gmail.com", "482394839", "823948239");
        User user7 = new User(null, "Homer Simpson", "homer@gmail.com", "231948293", "234892304");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);
        userRepository.save(user6);
        userRepository.save(user7);
    }
}
