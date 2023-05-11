import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.*;

public class AlwaysCheatTest {

    @Test
    public void expectNextMove() {
        AlwaysCheat player = new AlwaysCheat();
        Move move = player.nextMove(null);
        Move move2 = player.nextMove(null);
        assertEquals(Move.CHEAT, move);
        assertEquals(Move.CHEAT, move2);
    }

}
