package com.example.marvApiJava.Repository;

import com.example.marvApiJava.Models.Heroes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarvelRepo extends JpaRepository<Heroes, Long> {

}

