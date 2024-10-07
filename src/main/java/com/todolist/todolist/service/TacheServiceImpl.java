package com.todolist.todolist.service;

import com.todolist.todolist.entity.Tache;
import com.todolist.todolist.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;


@Repository
public class TacheServiceImpl implements TacheService{

    @Autowired
    public TacheRepository tacheRepository;

    @Override
    public Tache addTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    @Override
    public List<Tache> findTaches() {
        return tacheRepository.findAll();
    }

    @Override
    public void removeTache(Long tacheId) {
        tacheRepository.deleteById(tacheId);
    }

    @Override
    public Tache updateTache(Long tacheId,Tache tache) {
        Tache tacheToUpdate = tacheRepository.findById(tacheId).get();
        if(Objects.nonNull(tacheToUpdate) &&
        !"".equalsIgnoreCase(tacheToUpdate.getTacheName())){
            tacheToUpdate.setTacheName(tache.getTacheName());
        }
        return tacheRepository.save(tacheToUpdate);



    }
}
