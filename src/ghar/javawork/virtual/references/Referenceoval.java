package ghar.javawork.virtual.references;

import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

    /**
     *A rectangle is drawn from the top-left vertex (X,Y) coordinate followed by
     * width and height using drawRect(X,Y,Width,Height).
     * fillRect() shades the inside pixels of the rectangle
     */
    class DrawPanel extends JPanel
    {

        private void doDrawing(Graphics mya) // The graphics object name does not have to be "g"
        {
            ///Change code only in this method

            //Top Row
            mya.drawOval(20,20,100,100);
            mya.drawOval(150,25,150,150);
            mya.drawOval(150,20,100,50);


            //Bottom Row
            mya.fillOval(20,150,100,100);

        }






////////////////////////DO NOT CHANGE ANY OF THE CODE BELOW THIS LINE////////////////////////////

        @Override
        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            doDrawing(g);
        }
    }

    public class Referenceoval extends JFrame
    {

        public Referenceoval()
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

                Referenceoval ex = new Referenceoval();
                ex.setVisible(true);
            });
        }
    }
