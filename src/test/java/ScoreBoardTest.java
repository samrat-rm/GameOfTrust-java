import org.example.Character;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.example.*;

public class ScoreBoardTest {

    private Character characterA;
    private Character characterB;
    private ScoreBoard scoreBoard;

    @Before
    public void setup() {
        characterA = new AlwaysCooperate();
        characterB = new AlwaysCheat();
        scoreBoard = new ScoreBoard(characterA, characterB);
    }

    @Test
    public void expectUpdateScoreBothCooperate() {
        scoreBoard.updateScore(Move.COOPERATE, Move.COOPERATE);
        assertEquals(2, scoreBoard.getPlayerScore(characterA));
        assertEquals(2, scoreBoard.getPlayerScore(characterB));
    }

    @Test
    public void expectUpdateScorePlayerAAlwaysCooperatePlayerBAlwaysCheat() {
        scoreBoard.updateScore(Move.COOPERATE, Move.CHEAT);
        assertEquals(-1, scoreBoard.getPlayerScore(characterA));
        assertEquals(3, scoreBoard.getPlayerScore(characterB));
    }

    @Test
    public void expectUpdateScorePlayerAAlwaysCheatPlayerBAlwaysCooperate() {
        scoreBoard.updateScore(Move.CHEAT, Move.COOPERATE);
        assertEquals(3, scoreBoard.getPlayerScore(characterA));
        assertEquals(-1, scoreBoard.getPlayerScore(characterB));
    }
}
