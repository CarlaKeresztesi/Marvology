package com.example.marvApiJava.Controllers;

import com.example.marvApiJava.Models.Heroes;
import com.example.marvApiJava.Repository.MarvelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/heroes")
public class HeroController {
        private MarvelRepo marvelRepo;

        @Autowired
    public HeroController(MarvelRepo marvelRepo) {
            this.marvelRepo = marvelRepo;
        }
     @GetMapping("/")
    public List<Heroes> getAllHeroes() {
            return marvelRepo.findAll();
     }

     @GetMapping("/{id}")
     public Optional<Heroes> getHeroById(@PathVariable("id") int id){
            return marvelRepo.findById(id);
     }





}//end of HeroController
