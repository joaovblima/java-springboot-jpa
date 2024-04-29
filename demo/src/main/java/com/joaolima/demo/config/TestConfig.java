package com.joaolima.demo.config;

import com.joaolima.demo.entities.Category;
import com.joaolima.demo.entities.Order;
import com.joaolima.demo.entities.User;
import com.joaolima.demo.entities.com.joaolima.demo.entities.enums.OrderStatus;
import com.joaolima.demo.repositories.CategoryRepository;
import com.joaolima.demo.repositories.OrderRepository;
import com.joaolima.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        User user1 = new User(null, "Maria Brown", "maria@gmail.com", "98881231", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com", "981231241", "123452");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, user1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, user2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, user1);


        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
