package com.example.designpattern.behavioral.memento;

import com.example.designpattern.behavioral.memento.game.CharacterStatus;
import com.example.designpattern.behavioral.memento.game.Game;
import com.example.designpattern.behavioral.memento.memento.GameManager;

public class MementoClient {
    public static void main(String[] args) {
        Game game = new Game(0, new CharacterStatus());
        GameManager gameManager = new GameManager(game);

        gameManager.printCurrentGame();
        gameManager.gameSave(2);

        gameManager.nextStage();
        gameManager.nextStage();
        gameManager.nextStage();
        gameManager.nextStage();

        gameManager.printCurrentGame();

        gameManager.gameLoad(2);

        gameManager.printCurrentGame();

    }
}
