package AP_1.Recursion.Labs;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
public class Gasket extends Canvas implements Runnable
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    public Gasket()
    {
        setBackground(Color.WHITE);
    }
    public void paint( Graphics window )
    {
        window.setColor(Color.BLUE);
        window.setFont(new Font("ARIAL",Font.BOLD,24));
        window.drawString("Sierpinski's Gasket", 25, 50);
        gasket(window, (WIDTH-10)/2, 20, WIDTH-40, HEIGHT-20, 40,
                HEIGHT-20);
    }
    public void gasket(Graphics window, int x1, int y1, int x2, int y2, int x3,
                       int y3)
    {
//base case goes here
//        if(x1 == x2 || x2 == x3)
//        {
//          return;
//        }

//make a random color here

        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        Color randomColor = new Color(r, g, b);
        window.setColor(randomColor);
        int midpointx1 = (x1 + x2) / 2;
        int midpointy1 = (y1 + y2) / 2;
        int midpointx3 = (x1 + x3) / 2;
        int midpointy3 = (y1 + y3) / 2;
        int midpointx2  = (x2 + x3) / 2;
        int midpointy2 = (y2 + y3) / 2;
//draw lines to make a triangle or use fillPolygon
//        window.drawLine(x1, y1, x2, y2);
//        window.drawLine(x1, y1, x3, y3);
//        window.drawLine(x3, y3, x2, y2);
        window.drawLine(x1, y1, x2, y2);
        window.drawLine(x2, y2, x3, y3);
        window.drawLine(x3, y3, x1, y1);

//make some recursive calls
        if(x1 == x2 || x1 == x3)
        {
            return;
        }

        gasket(window,x1,y1, midpointx1, midpointy1,midpointx3,midpointy3);
        gasket(window, midpointx1, midpointy1, x2,y2, midpointx2, midpointy2);
        gasket(window, midpointx3, midpointy3, midpointx2, midpointy2, x3,y3);

    }
    public void run()
    {
        try{
            Thread.currentThread().sleep(3);
        }
        catch(Exception e)
        {
        }
    }
}
