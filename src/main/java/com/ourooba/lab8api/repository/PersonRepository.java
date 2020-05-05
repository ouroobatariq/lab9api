package com.ourooba.lab8api.repository;

import com.ourooba.lab8api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonRepository extends JpaRepository<Person,Integer> {
}

