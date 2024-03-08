package com.example.designpattern.behavioral.memento.memento;

import com.example.designpattern.behavioral.memento.game.CharacterStatus;

public class GameSave {
    private final int stage;
    private final CharacterStatus characterStatus;

    public GameSave(int stage, CharacterStatus characterStatus) {
        this.stage = stage;
        this.characterStatus = characterStatus;
    }

    public int getStage() {
        return stage;
    }

    public CharacterStatus getCharacterStatus() {
        return characterStatus;
    }
}
