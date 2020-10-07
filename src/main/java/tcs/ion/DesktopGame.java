package tcs.ion;

import javax.swing.*;
import java.util.Random;

public class DesktopGame {
    public enum Gesture {rock,paper,scissors};

    public static void main(String[] args) {

        String prompt = "Will it be rock, paper or scissors?";
        Score score = new Score();
        Random rand =new Random();
        while (true) {
            String result ="error";
            String input = JOptionPane.showInputDialog(prompt);
            if (input.equals(Gesture.scissors.toString())) {
                result = "lose";
                score.increaseLosses();
            }
            if (input.equals(Gesture.paper.toString())) {
                result = "win";
                score.increaseWins();
            }
            if (input.equals(Gesture.rock.toString())) {
                result = "tie";
                score.increaseTies();
            }
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            JOptionPane.showMessageDialog(null, result);
            System.out.println(score);
            }

        }

}
