package ghar.javawork.virtual.unit2.part2notes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *A rectangle is drawn from the top-left vertex (X,Y) coordinate followed by
 * width and height using drawRect(X,Y,Width,Height).
 * fillRect() shades the inside pixels of the rectangle
 */
class DrawPanel2 extends JPanel
{

    private void doDrawing(Graphics g)
    {
        //Change code only in this method

        //Top Row
        g.drawRect(20,20,100,100);
        g.drawRect(150,20,100,50);
        g.drawRect(300,20,30,100);
        //g.drawRect(310,30,20,90);


        //Bottom Row
        g.fillRect(20,150,100,100);
        g.fillRect(150,150,30,130);
        g.fillRect(300,150,80,40);

    }






////////////////////////DO NOT CHANGE ANY OF THE CODE BELOW THIS LINE////////////////////////////

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

class Rectangle extends JFrame
{

    public Rectangle()
    {

        initUI();
    }

    private void initUI()
    {

        DrawPanel2 drawPanel2 = new DrawPanel2();
        add(drawPanel2);

        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

        EventQueue.invokeLater(() -> {

            Rectangle ex = new Rectangle();
            ex.setVisible(true);
        });
    }
}