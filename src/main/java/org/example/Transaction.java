package org.example;

public class Transaction {
    private final Character character1;
    private final Character character2;
    private  Move prevOpponentMove1 = null;
    private  Move prevOpponentMove2 = null ;
    private final ScoreBoard scoreBoard;

    public Transaction(Character character1, Character character2, ScoreBoard scoreBoard) {
        this.character1 = character1;
        this.character2 = character2;
        this.scoreBoard = scoreBoard;
    }
    public void playOneRound(){
        Move move1 = this.character1.nextMove(this.prevOpponentMove1);
        Move move2 = this.character2.nextMove(this.prevOpponentMove2);

        this.prevOpponentMove2 = move1;
        this.prevOpponentMove1 = move2;

        scoreBoard.updateScore(move1,move2);
    }

}
