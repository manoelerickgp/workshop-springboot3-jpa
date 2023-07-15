package com.estudoweb.courseSpringBoot.config;

import com.estudoweb.courseSpringBoot.entities.Category;
import com.estudoweb.courseSpringBoot.entities.Order;
import com.estudoweb.courseSpringBoot.entities.Product;
import com.estudoweb.courseSpringBoot.entities.User;
import com.estudoweb.courseSpringBoot.entities.enums.OrderStatus;
import com.estudoweb.courseSpringBoot.repositories.CategoryRepository;
import com.estudoweb.courseSpringBoot.repositories.OrderRepository;
import com.estudoweb.courseSpringBoot.repositories.ProductRepository;
import com.estudoweb.courseSpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        //
        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
        //
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        //
<<<<<<< HEAD
<<<<<<< HEAD

        //
        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);
=======
>>>>>>> refs/remotes/origin/main
=======
>>>>>>> f7d09dc9bd64673fd5b3853ffd6358c60d74df85
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        User user3 = new User(null, "Bob Brown", "bob@gmail.com", "832984243", "12121212");
        User user4 = new User(null, "Mike Ross", "mike@gmail.com", "82193891", "49092304");
        User user5 = new User(null, "Maria Silva", "maria@gmail.com", "123456789", "senha");
        User user6 = new User(null, "Julie White", "julie@gmail.com", "482394839", "823948239");
        User user7 = new User(null, "Homer Simpson", "homer@gmail.com", "231948293", "234892304");

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, user1);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, user1);
        Order order4 = new Order(null, Instant.parse("2020-02-11T10:50:33Z"), OrderStatus.DELIVERED, user5);
        Order order5 = new Order(null, Instant.parse("2019-03-14T09:44:22Z"), OrderStatus.SHIPPED, user4);
        Order order6 = new Order(null, Instant.parse("2019-05-18T18:25:11Z"), OrderStatus.CANCELED, user6);
        Order order7 = new Order(null, Instant.parse("2019-09-19T13:19:10Z"), OrderStatus.PAID, user7);
        Order order8 = new Order(null, Instant.parse("2019-03-09T15:58:59Z"), OrderStatus.WAITING_PAYMENT, user3);


        //
        userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7));
        //
        orderRepository.saveAll(Arrays.asList(order1, order2, order3, order4, order5, order6, order7, order8));
        //


    }
}
