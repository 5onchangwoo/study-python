package com.example.designpattern.stuctural.adapter;

import com.example.designpattern.stuctural.adapter.adapters.SquarePegAdapter;
import com.example.designpattern.stuctural.adapter.round.RoundHole;
import com.example.designpattern.stuctural.adapter.round.RoundPeg;
import com.example.designpattern.stuctural.adapter.square.SquarePeg;

public class AdapterMain {
    public static void main(String[] args) {
        /* 둥근 못 -> 둥근 홀 */
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            System.out.println("잘 맞는다 ~~");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        // boolean fits = roundHole.fits(smallSquarePeg); // 오류 발생 둥근 못만 넣을 수 있다.

        /* 어댑터를 이용해서 사각 못 -> 둥근 홀 */
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        if (roundHole.fits(smallSquarePegAdapter)) {
            System.out.println("작은 사각못은 둥근 홀에 박을 수 있다.");
        }
        if (!roundHole.fits(largeSquarePegAdapter)) {
            System.out.println("큰 사각못은 둥근 홀에 박을 수 없다.");
        }

    }
}
