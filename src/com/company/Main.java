package com.company;

import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        String question = "How many planets are in the solar system?\n";
        question += "A. four planets\n";
        question += "B. five planets\n";
        question += "C. six planets\n";
        question += "D. seven planets\n";
        question += "E. eight planets\n";

        while (true) {

            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "Correct!");
            break;
            } else if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")) {
                JOptionPane.showMessageDialog(null,"Incorrect. Please try again."); }
            else {JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");}
            }
    }
}