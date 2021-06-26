package ghar.javawork.virtual.unit2.part2notes;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This program demonstrates how to draw lines.
 * Lines are drawn from (X1,Y1) to (X2,Y2) with drawLine(X1,Y1,X2,Y2)
 */
class DrawPanel extends JPanel
{

    private void doDrawing(Graphics g) // "g" is the object name of the Graphics class, it can be named anything.
    {
        //Change code only in this method
        g.drawLine(0,0,450,300);
        g.drawLine(0,300,450,0);

        g.drawLine(50,150,400,150);//Horizontal
        g.drawLine(225,50,225,250);//Vertical


        //g.drawLine(50,50,400,50);
        //g.drawLine(50,250,400,250);
        //g.drawLine(400,50,400,250);
        //g.drawLine(50,50,50,250);
    }






////////////////////////DO NOT CHANGE ANY OF THE CODE BELOW THIS LINE////////////////////////////

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

class Lines extends JFrame
{

    public Lines()
    {

        initUI();
    }

    private void initUI()
    {

        DrawPanel drawPanel = new DrawPanel();
        add(drawPanel);

        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

        EventQueue.invokeLater(() -> {

            Lines ex = new Lines();
            ex.setVisible(true);
        });
    }
}