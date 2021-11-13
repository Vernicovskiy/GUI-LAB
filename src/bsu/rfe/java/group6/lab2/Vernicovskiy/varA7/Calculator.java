package bsu.rfe.java.group6.lab2.Vernicovskiy.varA7;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 320;
    public Calculator()
    {
        super ("Калькулятор");
        setSize(WIDTH, HEIGHT);
        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation((kit.getScreenSize().width - WIDTH)/2,
                (kit.getScreenSize().height - HEIGHT)/2);








    }
}
