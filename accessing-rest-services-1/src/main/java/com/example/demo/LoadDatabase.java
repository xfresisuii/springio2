package com.example.demo;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {
	  Logger log = LoggerFactory.getLogger(AccessingRestServices1Application.class);
  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
    return args -> {
      log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar", "burglar")));
      log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief", "burglar")));
      log.info("Preloading " + repository.save(new Employee("Fro Bs", "tef", "burglar")));

    };
    
  }
}