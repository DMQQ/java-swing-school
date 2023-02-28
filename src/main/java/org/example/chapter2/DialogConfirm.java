package org.example.chapter2;

import javax.swing.*;

public class DialogConfirm {
    public static void main(String[] args) {
        String[] options = {"Tak, zapisz", "Raczej nie", "Anuluj"};
        String question = "Czy zapisać zmiany na dysku?";
        String title = "Zapisywanie dokumentu";
        String info = "";

        int odp = JOptionPane.showOptionDialog(null, question, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        switch (odp) {
            case JOptionPane.YES_OPTION:
                info = "TAK";
                break;
            case JOptionPane.NO_OPTION:
                info = "NIE";
                break;
            case JOptionPane.CANCEL_OPTION:
                info = "ANULUJ";
                break;
            default:
                info = "???";
                break;
        }
        System.out.println("Odpowiedź: " + info);
    }
}
