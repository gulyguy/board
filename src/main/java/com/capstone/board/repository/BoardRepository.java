package com.capstone.board.repository;


import com.capstone.board.domain.Board;
import com.capstone.board.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findByUser(User user);

}
