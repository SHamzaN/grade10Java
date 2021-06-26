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
class DrawPanel4 extends JPanel
{

    private void doDrawing(Graphics zack)
    {
        ///Change code only in this method

        //Top Row
        zack.drawArc(20,20,100,100,0,180);
        zack.fillArc(100,20,100,100,0,90);
        zack.drawArc(220,20,80,80,0,360);
        zack.fillArc(320,10,100,100,0,-180);

        //Bottom Row
        zack.drawArc(20,150,80,200,0,180);
        zack.fillArc(150,150,200,100,90,130);

    }






////////////////////////DO NOT CHANGE ANY OF THE CODE BELOW THIS LINE////////////////////////////

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

class Arc extends JFrame
{

    public Arc()
    {

        initUI();
    }

    private void initUI()
    {

        DrawPanel4 drawPanel4 = new DrawPanel4();
        add(drawPanel4);
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

        EventQueue.invokeLater(() -> {

            Arc ex = new Arc();
            ex.setVisible(true);
        });
    }
}