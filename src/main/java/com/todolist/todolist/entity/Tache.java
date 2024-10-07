package com.todolist.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tacheId;
    private String tacheName;

    public Long getTacheId() {
        return tacheId;
    }

    public String getTacheName() {
        return tacheName;
    }

    public void setTacheId(Long tacheId) {
        this.tacheId = tacheId;
    }

    public void setTacheName(String tacheName) {
        this.tacheName = tacheName;
    }
}
