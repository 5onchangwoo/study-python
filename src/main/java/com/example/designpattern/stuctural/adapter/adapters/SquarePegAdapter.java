package com.example.designpattern.stuctural.adapter.adapters;

import com.example.designpattern.stuctural.adapter.round.RoundPeg;
import com.example.designpattern.stuctural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
