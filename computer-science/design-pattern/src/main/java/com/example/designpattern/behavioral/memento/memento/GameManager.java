package com.example.designpattern.behavioral.memento.memento;

import com.example.designpattern.behavioral.memento.game.Game;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GameManager {
    private Game game;
    private GameSave[] gameSaveList;

    public GameManager(Game game) {
        this.game = game;
        this.gameSaveList = new GameSave[3];
    }

    public void gameSave(int slot) {
        if (slot < 0 || slot > 3) {
            System.out.println("0 ~ 3가능합니다.");
        }
        gameSaveList[slot] = game.backup();
    }

    public void gameLoad(int slot) {
        if (slot < 0 || slot > 3) {
            System.out.println("0 ~ 3가능합니다.");
        }
        game.restore(gameSaveList[slot]);
    }

    public void nextStage() {
        game.setStage(game.getStage() + 1);
        game.setCharacterStatus(game.getCharacterStatus().levelUp());
    }

    public void printCurrentGame() {
        System.out.println(game);
    }


}
