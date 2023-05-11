package org.example;

public class AlternateMove extends Character {
    int currentRound = 0 ;

    @Override
    public Move nextMove(Move prevOppMove) {
        if(currentRound%2 == 0){
            this.currentRound++;
            return Move.COOPERATE;
        }
        this.currentRound++;
        return Move.CHEAT;
    }
}
