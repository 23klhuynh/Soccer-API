package com.soccerstats.soccer_stats.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    public List<Player> getPLayers(){
        return playerRepository.findAll();
    }

    public List<Player> getPlayersByTeam(String teamName){
        return playerRepository
                .findAll()
                .stream()
                .filter(player->teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByName(String searchText){
        return playerRepository
                .findAll()
                .stream()
                .filter(player -> player.getName().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

}
