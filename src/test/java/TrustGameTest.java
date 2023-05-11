import org.junit.Test;
import static org.junit.Assert.*;
import org.example.*;

public class TrustGameTest {

    @Test
    public void expectConstructorWithNullPlayer1() {
        try {
            TrustGame game = new TrustGame(null, new AlwaysCooperate(), 10);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Both players must be provided and Number of rounds must be greater than zero.", e.getMessage());
        }
    }

    @Test
    public void expectConstructorWithNullPlayer2() {
        try {
            TrustGame game = new TrustGame(new AlwaysCooperate(), null, 10);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Both players must be provided and Number of rounds must be greater than zero.", e.getMessage());
        }
    }

    @Test
    public void expectConstructorWithZeroRounds() {
        try {
            TrustGame game = new TrustGame(new AlwaysCooperate(), new AlwaysCheat(), 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Both players must be provided and Number of rounds must be greater than zero.", e.getMessage());
        }
    }

    @Test
    public void expectStartAlwaysCheatVsAlwaysCooperate() {
        TrustGame game = new TrustGame(new AlwaysCheat(), new AlwaysCooperate(), 10);
        game.start();
        // No assertion needed since the result is printed to console
    }
}
