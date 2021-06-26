package ghar.javawork.virtual.unit2.part2;
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
class DrawPanel extends JPanel
{

    private void doDrawing(Graphics g)
    {
        //Change code only in this method

        //  g.drawOval(150,85,150,160);
        // g.drawOval(175,105,50,50);
        // g.drawOval(230,105,50,50);
        g.drawRect(195,-5,70,70);
        g.drawRect(150,65,150,25);
        g.fillRect(195,-5,70,70);
        g.drawRect(192,40,74,24);
        g.fillRect(150,65,150,25);
        g.setColor(Color.red);
        g.fillRect(192,40,74,24);

        g.setColor(Color.yellow);
        g.drawOval(150,85,150,160);
        g.fillOval(150,85,150,160);

        //  g.setColor(Color.white);
        //  g.drawOval(175,105,50,50);
        // g.drawOval(230,105,50,50);

        Font myFont = new Font("papyrus", Font.BOLD, 18); // Font("font name", style, size)
        g.setColor(Color.black);
        g.setFont(myFont);
        g.drawString("Have a nice day ",150,250);




        g.setColor( Color.blue );
        g.drawArc( 200, 125, 10, 10, 50, 360);
        g.drawArc( 240, 125, 10, 10, 50, 360);

        g.setColor( Color.red );
        // g.drawLine ( 140, 35, 140, 140 );

        g.setColor( Color.red );
        g.drawArc ( 195, 150, 60, 60, 0, -180 );






    }






////////////////////////DO NOT CHANGE ANY OF THE CODE BELOW THIS LINE////////////////////////////

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

public class Smiley extends JFrame
{

    public Smiley()
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

            Smiley ex = new Smiley();
            ex.setVisible(true);
        });
    }
}