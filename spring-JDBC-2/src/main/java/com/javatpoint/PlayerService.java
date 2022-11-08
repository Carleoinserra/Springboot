package com.javatpoint;
import java.util.List;
public interface PlayerService {

    public List<Player> getAllPlayers();

    public Player getPlayer(Long id);

    public void addPlayer(Player player);

    public void updatePlayer(Long id, Player player);

    public void deletePlayer(Long id);

}