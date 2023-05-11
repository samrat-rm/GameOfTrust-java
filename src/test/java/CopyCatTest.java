import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

public class CopyCatTest {

    @Test
    public void expectNextMove() {
        CopyCat player = new CopyCat();

        // First move should always be cooperate
        Move move1 = player.nextMove(Move.COOPERATE);
        assertEquals(Move.COOPERATE, move1);

        // Subsequent moves should copy the opponent's previous move
        Move move2 = player.nextMove(Move.CHEAT);
        assertEquals(Move.COOPERATE, move2);

        Move move3 = player.nextMove(Move.COOPERATE);
        assertEquals(Move.CHEAT, move3);

        Move move4 = player.nextMove(Move.CHEAT);
        assertEquals(Move.COOPERATE, move4);

        // Verify that the player remembers the opponent's previous move
        Move move5 = player.nextMove(Move.COOPERATE);
        assertEquals(Move.CHEAT, move5);
    }
}
