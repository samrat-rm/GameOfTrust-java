package org.example;

public class TrustGame {
    Transaction transaction;

    private final int  rounds ;
    private ScoreBoard scoreBoard;
    public TrustGame(Character character1, Character character2, int rounds){
        if (character1 == null || character2 == null || rounds <= 0) {
            throw new IllegalArgumentException("Both players must be provided and Number of rounds must be greater than zero.");
        }

        ScoreBoard scoreBoard = new ScoreBoard(character1, character2);
        this.scoreBoard = scoreBoard;
        this.transaction = new Transaction(character1, character2, scoreBoard);
        this.rounds = rounds;
    }
    public void start() {
        for (int round = 0; round < this.rounds; round++) {
            this.transaction.playOneRound();
        }
    }

//        this.result();


//    private void result(){
//        int score1 = this.scoreBoard.getPlayerScore()
//
//        if (score1 > score2) {
//            System.out.println("\n Player 1 wins!");
//        } else if (score2 > score1) {
//            System.out.println("\n Player 2 wins!");
//        } else {
//            System.out.println("\n It's a draw!");
//        }
//    }
}
