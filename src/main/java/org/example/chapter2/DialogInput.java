package org.example.chapter2;

import javax.swing.*;

public class DialogInput {
    public static void main(String[] args) {
        String question = "Czy zapisać zmiany na dysku?";
        String title = "Zapisywanie dokumentu";

        String odp = JOptionPane.showInputDialog(null, question, title, JOptionPane.QUESTION_MESSAGE);
        System.out.println("nazwa pliku: " + odp);
    }
}
