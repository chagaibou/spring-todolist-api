package com.todolist.todolist.controller;

import com.todolist.todolist.entity.Tache;
import com.todolist.todolist.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TacheController {

    @Autowired
    public TacheService tacheService;

    //Ajout d'une tache
    @PostMapping("/taches")
    public Tache addTache(@RequestBody Tache tache){
        return tacheService.addTache(tache);

    }

    @GetMapping("/taches")
    public List<Tache> findTache(){
        return tacheService.findTaches();
    }

    @DeleteMapping("/taches/{id}")
    public String deleteTache(@PathVariable("id") Long tacheId){
        tacheService.removeTache(tacheId);
        return "tache supprimée";
    }

    @PutMapping("taches/{id}")
    public Tache updateTache(@PathVariable("id") Long tacheId,@RequestBody Tache tache){
        return tacheService.updateTache(tacheId,tache);
    }



}
