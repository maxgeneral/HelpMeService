package ru.vyatsu.helpmeservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.vyatsu.helpmeservice.auth.AuthenticationService;
import ru.vyatsu.helpmeservice.auth.RegisterRequest;

import static ru.vyatsu.helpmeservice.user.Role.ADMIN;
import static ru.vyatsu.helpmeservice.user.Role.USER;

@SpringBootApplication
public class HelpMeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelpMeServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner createDbdata(
            AuthenticationService service
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getAccessToken());

            var user = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("user@mail.com")
                    .password("password")
                    .role(USER)
                    .build();
            System.out.println("Manager token: " + service.register(user).getAccessToken());
        };
    }

}
