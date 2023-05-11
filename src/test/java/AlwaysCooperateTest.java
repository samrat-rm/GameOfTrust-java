import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.*;


public class AlwaysCooperateTest {
    @Test
    public void expectNextMove() {
        AlwaysCooperate player = new AlwaysCooperate();
        Move move = player.nextMove(null);
        Move move2 = player.nextMove(null);
        assertEquals(Move.COOPERATE, move);
        assertEquals(Move.COOPERATE, move2);
    }
}
