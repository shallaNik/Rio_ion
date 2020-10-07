package tcs.ion;
import org.junit.Assert;
import org.junit.Test;

public class ScoreTest {
    public void testIncreaseLosses() {
        Score score = new Score();
        score.increaseLosses();
        Assert.assertTrue(score.getLosses()>0);
    }
    public void testIncreaseTies() {
        Score score = new Score();
        score.increaseTies();
        Assert.assertTrue(score.getTies()>0);
    }
    public void testToString() {
        Score score = new Score();
        Assert.assertTrue(score.toString().length()>0);
    }

}