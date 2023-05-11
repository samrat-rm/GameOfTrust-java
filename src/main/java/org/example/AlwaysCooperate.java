package org.example;

public class AlwaysCooperate extends Character {
    public Move nextMove(Move prevOppMove){
        return Move.COOPERATE;
    }
}
