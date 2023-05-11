package org.example;
import java.util.Map;
import java.util.HashMap;
public class ScoreBoard {

    private Map<Character, Integer> scores;
    private int currentRound = 0;
    private Character characterA;
    private Character characterB;
    public ScoreBoard(Character character1, Character character2){
        this.characterA = character1;
        this.characterB = character2;
        scores = new HashMap<>();
        scores.put(characterA, 0);
        scores.put(characterB, 0);
    }

    public void updateScore(Move move1, Move move2){
        if(Move.COOPERATE == move1){
            int prevScore= scores.get(characterA);
            scores.put(characterA, prevScore-1);

            int prevScore2= scores.get(characterB);
            scores.put(characterB,prevScore2+3 );

        }
        if(Move.COOPERATE == move2){
            int prevScore= scores.get(characterA);
            scores.put(characterA, prevScore+3);

            int prevScore2= scores.get(characterB);
            scores.put(characterB,prevScore2-1 );
        }
        this.currentRound++;
        print(scores.get(characterA) , scores.get(characterB));
    }

    public int getPlayerScore(Character character){
        return this.scores.get(character);
    }
        private void print (int score1 , int score2){

        System.out.println("\n After round " + currentRound + ":");
        System.out.println("player1   score: " + score1);
        System.out.println( "player2  score: " + score2);
    }
}
