package org.example.chapter2;

import javax.swing.*;

public class ListPanel extends JPanel {
    public ListPanel() {
        var timesOfWeather = new String[]{"Wiosna", "Lato", "Jesień", "Zima"};
        var colors = new String[]{"Czarny", "Biały", "Różowy", "Czerwony", "Pomarańczowy", "Brązowy", "Żółty", "Szary", "Zielony", "Błękitny", "Fioletowy"};

        var pora = new JList<String>(timesOfWeather);
        pora.setSelectedIndex(2);
        pora.setBounds(10, 10, 80, 80);

        var koloryDane = new DefaultListModel<String>();
        for (var nazwa : colors) koloryDane.addElement(nazwa);
        var kolor = new JList<String>(koloryDane);
        kolor.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        kolor.setLayoutOrientation(JList.VERTICAL_WRAP);
        kolor.setVisibleRowCount(-1);
        var panelColor = new JScrollPane(kolor);

        panelColor.setBounds(100, 10, 240, 80);
        add(pora);
        add(panelColor);
        setLayout(null);
    }
}
