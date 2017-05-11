package com.company;

/**
 * Created by User on 10-5-2017.
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 *
 * @author hugoh
 */
public class ApplicatieBeginscherm extends JFrame{
    /**
     *
     * @author hugoh
     */
    public ApplicatieBeginscherm(){
        setTitle("Begin Scherm Applicatie");
        setSize(1200, 1000);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton AanB = new JButton("Aantal bestellingen");
        AanB.setBounds(20,30,300,60);
        this.add(AanB);

        JButton ActB = new JButton("Actuele bestellingen");
        ActB.setBounds(20,100,300,60);
        this.add(ActB);

        JButton KlantZ = new JButton("Klant zakelijk");
        KlantZ.setBounds(20,170,300,60);
        this.add(KlantZ);
        KlantZ.addActionListener(this);

        JButton KlantP = new JButton("Klant particulier");
        KlantP.setBounds(20,240,300,60);
        this.add(KlantP);


        JLabel Afgeleverd = new JLabel("");
        Afgeleverd.setBounds(800, 100,10 ,10 );
        this.add(Afgeleverd);



        setVisible(true);
    }


    public static void main(String[] args) {
        ApplicatieBeginscherm act = new ApplicatieBeginscherm();
        System.out.println(act);

    }

}
