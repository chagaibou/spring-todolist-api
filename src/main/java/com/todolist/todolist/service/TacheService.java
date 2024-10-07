package com.todolist.todolist.service;

import com.todolist.todolist.entity.Tache;

import java.util.List;

public interface TacheService {
    public Tache addTache(Tache tache);

    public List<Tache> findTaches();

    public void removeTache(Long tacheId);

    public Tache updateTache(Long tacheId,Tache tache);
}
