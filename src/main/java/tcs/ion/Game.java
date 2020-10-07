package tcs.ion;

import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        String prompt = "Let's Play!!! rock, paper or scissors?";
        String input = JOptionPane.showInputDialog(prompt);
        System.out.println("You selected: " + input);
    }
}
