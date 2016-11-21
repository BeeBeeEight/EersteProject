/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oef91;

import javax.swing.*;

/**
 *
 * @author teun9
 */
public class Oef91 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new Oef91();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new oef91Paneel());
        frame.setVisible(true);
    }
    
}
