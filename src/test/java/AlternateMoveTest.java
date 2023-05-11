import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.*;

public class AlternateMoveTest {

    @Test
    public void expectFirstMoveCooperate() {
        AlternateMove player = new AlternateMove();
        Move move = player.nextMove(null);
        assertEquals(Move.COOPERATE, move);
    }

    @Test
    public void expectSecondMoveCheat() {
        AlternateMove player = new AlternateMove();
        player.nextMove(null); // First move
        Move move = player.nextMove(null); // Second move
        assertEquals(Move.CHEAT, move);
    }

    @Test
    public void expectThirdMoveCooperate() {
        AlternateMove player = new AlternateMove();
        player.nextMove(null); // First move
        player.nextMove(null); // Second move
        Move move = player.nextMove(null); // Third move
        assertEquals(Move.COOPERATE, move);
    }


}
