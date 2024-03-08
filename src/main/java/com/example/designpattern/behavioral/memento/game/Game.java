package com.example.designpattern.behavioral.memento.game;

import com.example.designpattern.behavioral.memento.memento.GameSave;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Game {
    private int stage;
    private CharacterStatus characterStatus;

    public GameSave backup() {
        return new GameSave(this.stage, characterStatus);
    }

    public void restore(GameSave gameSave) {
        this.stage = gameSave.getStage();
        this.characterStatus = gameSave.getCharacterStatus();
    }
}
