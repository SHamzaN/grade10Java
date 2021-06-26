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
class DrawPanel6 extends JPanel
{

    private void doDrawing(Graphics g)
    {
        //Change code only in this method

        Font myFont = new Font("papyrus", Font.BOLD, 18); // Font("font name", style, size)

        g.setColor(Color.red);
        g.drawString("This string will display in red at coordinate (25,50)",25,50);

        g.setColor(Color.blue);
        g.setFont(myFont);
        g.drawString("This string will display in blue at coordinate (10,250)",10,250);
        g.setColor(Color.blue);
    }






////////////////////////DO NOT CHANGE ANY OF THE CODE BELOW THIS LINE////////////////////////////

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

class Words extends JFrame
{

    public Words()
    {

        initUI();
    }

    private void initUI()
    {

        DrawPanel6 drawPanel6 = new DrawPanel6();
        add(drawPanel6);

        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

        EventQueue.invokeLater(() -> {

            Words ex = new Words();
            ex.setVisible(true);
        });
    }
}