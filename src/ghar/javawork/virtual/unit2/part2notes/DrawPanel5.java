package ghar.javawork.virtual.unit2.part2notes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This program demonstrates the drawString method.
 * With drawString("String Literal",X,Y), the string Hello World
 * will be displayed starting at the (X,Y) pixel coordinate.
 */
class DrawPanel5 extends JPanel
{

    private void doDrawing(Graphics g)
    {
        //Change code only in this method


        g.fillOval(10,10,80,80);


        g.fillOval(120,10,80,80);


        g.fillOval(230,10,80,80);


        g.fillOval(340,10,80,80);


        g.fillOval(10,110,80,80);


        g.fillOval(120,110,80,80);








        g.fillOval(10,210,80,80);









    }






////////////////////////DO NOT CHANGE ANY OF THE CODE BELOW THIS LINE////////////////////////////

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

class PrettyColors extends JFrame
{

    public PrettyColors()
    {

        initUI();
    }

    private void initUI()
    {

        DrawPanel5 drawPanel5 = new DrawPanel5();
        add(drawPanel5);

        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

        EventQueue.invokeLater(() -> {

            PrettyColors ex = new PrettyColors();
            ex.setVisible(true);
        });
    }
}