package org.example.chapter2;

import javax.swing.*;
import java.awt.*;

public class CheckboxPanel extends JPanel {
    public CheckboxPanel() {
        var colors = new String[]{"Czerwony", "Niebieski", "Żółty"};
        var timesOfWeather = new String[]{"Wiosna", "Lato", "Jesień", "Zima"};

        var opcjeKolor = new JCheckBox[colors.length];
        for (int k = 0; k < colors.length; k++) {
            opcjeKolor[k] = new JCheckBox(colors[k]);
        }

        var opt = new JCheckBox[timesOfWeather.length];
        for (int k = 0; k < timesOfWeather.length; k++) {
            opt[k] = new JCheckBox(timesOfWeather[k]);
        }

        var panelcolors = new JPanel(new GridLayout(3, 1));
        panelcolors.setBounds(10, 10, 110, 80);
        panelcolors.setBorder(BorderFactory.createRaisedBevelBorder());
        for (var opcja : opcjeKolor) panelcolors.add(opcja);

        var panelPora = new JPanel(new GridLayout(4, 1));
        panelPora.setBounds(150,10, 110, 100);
        panelPora.setBorder(BorderFactory.createRaisedBevelBorder());
        for (var opcja : opt) panelPora.add(opcja);

        opcjeKolor[1].setSelected(true);
        opcjeKolor[2].setSelected(true);

        opt[2].setSelected(true);
        opt[3].setSelected(true);

        add(panelcolors);
        add(panelPora);

        setLayout(null);

    }
}
