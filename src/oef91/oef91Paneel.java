/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef91;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author teun9
 */
class oef91Paneel extends JPanel{
    private JButton knop0, knop1, knop2, knop3, knop4, knop5, knop6, knop7, knop8, knop9, knopdeel, knopc, knopplus, knopmin, knopkeer, knopis;
    private JTextField tekstvak;
    private JPanel paneelNoord, paneelCentrum;
    
    
    public oef91Paneel() {
        setLayout(new BorderLayout());
        
        paneelNoord = new JPanel();
        paneelCentrum = new JPanel();
        
        paneelNoord.setLayout( new GridLayout(1,1));
        paneelCentrum.setLayout(new GridLayout(4,2));
        
        knop0 = new JButton("0");
        knop1 = new JButton("1");
        knop2 = new JButton("2");
        knop3 = new JButton("3");
        knop4 = new JButton("4");
        knop5 = new JButton("5");
        knop6 = new JButton("6");
        knop7 = new JButton("7");
        knop8 = new JButton("8");
        knop9 = new JButton("9");
        knopdeel = new JButton("/");
        knopc = new JButton("C");
        knopplus = new JButton("+");
        knopmin = new JButton("-");
        knopkeer = new JButton("*");
        knopis = new JButton("=");
        tekstvak = new JTextField("");
        
        paneelNoord.add(tekstvak);
        paneelCentrum.add(knop7);
        paneelCentrum.add(knop8);
        paneelCentrum.add(knop9);
        paneelCentrum.add(knopplus);
        paneelCentrum.add(knop4);
        paneelCentrum.add(knop5);
        paneelCentrum.add(knop6);
        paneelCentrum.add(knopmin);
        paneelCentrum.add(knop1);
        paneelCentrum.add(knop2);
        paneelCentrum.add(knop3);
        paneelCentrum.add(knopkeer);
        paneelCentrum.add(knop0);
        paneelCentrum.add(knopdeel);
        paneelCentrum.add(knopc);
        paneelCentrum.add(knopis);
        
        add(paneelNoord, BorderLayout.NORTH);
        add(paneelCentrum, BorderLayout.CENTER);
        
    }
}
