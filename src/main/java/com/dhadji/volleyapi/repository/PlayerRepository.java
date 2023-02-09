package com.dhadji.volleyapi.repository;

import com.dhadji.volleyapi.model.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository {
    private List<Player> players = new ArrayList<>( List.of(new Player("Damianos","Hadjida","Male","hadji@gmail.com",1),
            new Player("sideris", "panagiotis","male","sideris@gmail.com",2)));

    public List<Player> findAll(){
        return players;
    }
    public Player findById(long id){
        for(Player p :players){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }
}
