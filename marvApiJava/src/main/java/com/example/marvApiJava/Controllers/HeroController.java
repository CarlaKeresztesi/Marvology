package com.example.marvApiJava.Controllers;

import com.example.marvApiJava.Models.Heroes;
import com.example.marvApiJava.Repository.MarvelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/heroes")
@CrossOrigin(origins = "http://localhost:5173")
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
    @PostMapping("/addHero")
    public Heroes addHero(@RequestBody Heroes hero){
            Heroes newHero = marvelRepo.save(hero);
            return newHero;
    }

    @DeleteMapping("/{id}")
    public void deleteHeroById(@PathVariable("id") int id){
        marvelRepo.deleteById(id);
    }





}//end of HeroController
