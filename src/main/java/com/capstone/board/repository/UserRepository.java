package com.capstone.board.repository;


import com.capstone.board.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}