package org.example;

public class CopyCat extends Character {
    Move prevOpponentMove  = Move.COOPERATE;
    // because the first instance has to be cooperate

    public Move nextMove(Move prevOpponentMove){
        Move result = this.prevOpponentMove;
        this.prevOpponentMove = prevOpponentMove;
        return result;
    }
}
