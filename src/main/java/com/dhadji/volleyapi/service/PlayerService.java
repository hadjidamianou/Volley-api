package com.dhadji.volleyapi.service;

import com.dhadji.volleyapi.model.Player;
import com.dhadji.volleyapi.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Player getPlayerById(long id){
        return playerRepository.findById(id);
    }
}
