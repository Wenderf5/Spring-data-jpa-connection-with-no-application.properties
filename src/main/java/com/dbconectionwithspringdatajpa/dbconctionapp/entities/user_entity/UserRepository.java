package com.dbconectionwithspringdatajpa.dbconctionapp.entities.user_entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
