package tcs.ion;

import static org.junit.Assert.fail;
import org.junit.Assert;
import org.testng.annotations.Test;

public class GameSummaryTest {
    public void testGetClientGesture() {
        GameSummary gameSummary = new GameSummary("rock", "scissors", "win");
        Assert.assertTrue(gameSummary.getClientGesture().equals("rock"));
        Assert.assertNotEquals(gameSummary.getClientGesture(), "scissors");
    }
    public void testGetServerGesture() {
        GameSummary gameSummary = new GameSummary("rock", "scissors", "win");
        Assert.assertTrue(gameSummary.getServerGesture().equals("scissors"));
    }
    public void testGetResult() {
        GameSummary gameSummary = new GameSummary("rock", "scissors", "win");
        Assert.assertEquals(gameSummary.getResult(), "win");
    }
    public void testGetDate() {
        GameSummary gameSummary = new GameSummary("rock", "scissors", "win");
        Assert.assertNotNull(gameSummary.getDate());
    }

}
