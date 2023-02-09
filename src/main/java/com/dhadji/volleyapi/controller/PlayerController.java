package com.dhadji.volleyapi.controller;

import com.dhadji.volleyapi.model.Player;

import com.dhadji.volleyapi.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PlayerController {
    private final PlayerService playerService;

    //auto legete autowiring
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers (){
        return playerService.getAllPlayers();
    }

    @GetMapping ("/players/{id}")
    public Player getPlayerById(@PathVariable long id){
        return playerService.getPlayerById(id);
    }
//ena endpoint na dimiourgo paixtes
    // kai ena na diagrafeis paixtes
}
