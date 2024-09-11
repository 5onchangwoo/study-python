package com.example.designpattern.behavioral.memento.game;


import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class CharacterStatus {
    private final int hp;
    private final int mp;
    private final int atk;
    private final int def;
    private final int sp;

    public CharacterStatus() {
        this.hp = 1000;
        this.mp = 500;
        this.atk = 5;
        this.def = 0;
        this.sp = 10;
    }

    public CharacterStatus(int hp, int mp, int atk, int def, int sp) {
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.def = def;
        this.sp = sp;
    }

    public CharacterStatus levelUp() {
        return new CharacterStatus(this.hp + 100, this.mp + 50, this.atk + 10, this.def + 5, this.sp +5);

    }

}
