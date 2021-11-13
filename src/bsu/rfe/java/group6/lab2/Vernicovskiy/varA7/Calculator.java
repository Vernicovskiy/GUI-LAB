package bsu.rfe.java.group6.lab2.Vernicovskiy.varA7;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 320;
private JRadioButton func1 = new JRadioButton ("Функция №1");
    private JRadioButton func2 = new JRadioButton ("Функция №2");
    private  JTextField  mem1 = new JTextField("0", 10);
    private  JTextField  mem2 = new JTextField("0",10);
    private  JTextField  mem3 = new JTextField("0",10);
    private Button resultat = new Button ("Вычислить");
    private JLabel a1 = new JLabel ("aaaa");


    public Calculator()
    {
        super ("Calculator");
        setSize(WIDTH, HEIGHT);
        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation((kit.getScreenSize().width - WIDTH)/2,
        (kit.getScreenSize().height - HEIGHT)/2);


        Container cont = this.getContentPane();
        this.setLayout( new GridLayout(7, 1, 2,2));
       // cont.add(a1);
        ButtonGroup func = new ButtonGroup();
        func.add (func1); func.add (func2);

        JPanel functions = new JPanel();
        func1.setSelected(true);
       // functions.setLayout( new FlowLayout(FlowLayout.CENTER));
        functions.add (func1); functions.add (func2);


        cont.add (functions);
        JPanel memory = new JPanel();
        memory.add(mem1);
        memory.add(mem2);
        memory.add(mem3);
        cont.add (memory);


        JPanel res = new JPanel();
        res.setLayout( new FlowLayout(FlowLayout.CENTER));
        res.add (resultat);
        cont.add (res);
 resultat.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {




     }
 });


    }
}
