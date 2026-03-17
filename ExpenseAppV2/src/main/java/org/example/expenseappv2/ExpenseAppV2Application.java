package org.example.expenseappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ExpenseAppV2Application {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseAppV2Application.class, args);
    }

}
