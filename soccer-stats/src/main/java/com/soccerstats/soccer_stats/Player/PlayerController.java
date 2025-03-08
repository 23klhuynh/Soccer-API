package com.soccerstats.soccer_stats.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) String nation) {

        if (team != null && position != null){
            return playerService.getPLayerByTeamAndPosition(team, position);
        } else if (team != null) {
            return playerService.getPlayersByTeam(team);
        }
        else if (name != null) {
            return playerService.getPlayerByName(name);
        }
        else if (position != null) {
            return playerService.getPlayerByPosition(position);
        }
        else if (nation != null) {
            return playerService.getPLayerByNation(nation);
        }else{
            return playerService.getPLayers();
        }
    }

    @PostMapping
    public ResponseEntity<Player> addPLayer(@RequestBody Player player){
        Player createPlayer = playerService.addPlayer(player);
        return new ResponseEntity<>(createPlayer, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
        Player resultPlayer = playerService.updatePlayer(player);
        if (resultPlayer != null) {
            return new ResponseEntity<>(resultPlayer, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{playerName}")
    public ResponseEntity<String> deletePlayer(@PathVariable String playerName){
        playerService.deletePlayer(playerName);
        return new ResponseEntity<>("Player deleted successfully!", HttpStatus.OK);
    }
}
