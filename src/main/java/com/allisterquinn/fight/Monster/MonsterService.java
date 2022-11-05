package com.allisterquinn.fight.Monster;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MonsterService {
    public List<Monster> getMonsters() {
        return List.of(new Monster("Hello"));
    }
}
