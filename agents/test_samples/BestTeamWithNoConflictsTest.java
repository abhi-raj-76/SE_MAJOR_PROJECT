import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BestTeamWithNoConflictsTest {
    @Test
    void testBestTeam() {
        assertEquals(0, BestTeamWithNoConflicts.bestTeamScore(new int[]{}, new int[]{}));
    }
}