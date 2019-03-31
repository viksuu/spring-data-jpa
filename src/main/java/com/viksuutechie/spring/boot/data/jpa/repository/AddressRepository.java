package com.viksuutechie.spring.boot.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viksuutechie.spring.boot.data.jpa.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
