package com.viksuutechie.spring.boot.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viksuutechie.spring.boot.data.jpa.model.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
