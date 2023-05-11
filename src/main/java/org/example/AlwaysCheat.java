package org.example;

public class AlwaysCheat extends Character {
    public Move nextMove(Move prevOppMove){
        return Move.CHEAT;
    }
}
