package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepostory extends JpaRepository<Employee, Long> {

}