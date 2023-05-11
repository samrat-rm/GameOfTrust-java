package org.example;

public class Grudger extends Character {

    boolean trust = true;

    @Override
    public Move nextMove(Move prevOppMove) {
        if(!trust){
            System.out.println("truest failed");
            return Move.CHEAT;
        }
        if(prevOppMove == Move.CHEAT){
            this.trust = false;
            return Move.COOPERATE;
        }
        return Move.COOPERATE;
    }
}
