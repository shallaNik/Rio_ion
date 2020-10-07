package tcs.ion;

public class GameService {
    public void play(String clientGesture) {

        String result = "error";
        if (clientGesture.equals("scissors")) {
            result = "lose";
        }
        if (clientGesture.equals("paper")) {
            result = "win";
        }
        if (clientGesture.equals("rock")) {
            result = "tie";
        }
    }
}
