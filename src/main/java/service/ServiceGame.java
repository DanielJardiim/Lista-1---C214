package service;

import model.Game;
import model.Platform;
import model.Publisher;

import java.util.ArrayList;
import java.util.List;

public class ServiceGame {

    public static List<Game> getListByPlatform(List<Game> games, Platform platform){
        List<Game> gamesByPlatform = new ArrayList<>();

        games.stream().filter((game ->
                game.getClass().equals(platform.name()))).
                forEach(game -> gamesByPlatform.add(game));

        return gamesByPlatform;

    }


    public static List<Game> getByPuBlisher(List<Game> games ,
                                            Publisher publisher){
        List<Game> gamesByPublisher = new ArrayList<>();

        games.stream().filter((game ->
                        game.getClass().equals(publisher.name()))).
                forEach(game -> gamesByPublisher.add(game));

        return gamesByPublisher;
    }

}