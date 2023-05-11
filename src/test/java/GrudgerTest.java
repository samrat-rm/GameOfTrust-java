import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

public class GrudgerTest {

    @Test
    public void testNextMoveWithInitialTrust() {
        Grudger grudger = new Grudger();

        // First move should always be cooperate
        Move move1 = grudger.nextMove(Move.COOPERATE);
        assertEquals(Move.COOPERATE, move1);

        // Subsequent moves should cooperate as long as opponent cooperates
        Move move2 = grudger.nextMove(Move.COOPERATE);
        assertEquals(Move.COOPERATE, move2);


        // If opponent cheats, Grudger stops trusting and retaliates
        Move move4 = grudger.nextMove(Move.CHEAT);
        assertEquals(Move.COOPERATE, move4);

        // Grudger continues to cheat after opponent cheats
        Move move5 = grudger.nextMove(Move.CHEAT);
        assertEquals(Move.CHEAT, move5);

        // Grudger continues to cheat after opponent cheats
        Move move6 = grudger.nextMove(Move.CHEAT);
        assertEquals(Move.CHEAT, move6);
    }

    // Add more test cases as needed

}
