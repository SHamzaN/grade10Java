package ghar.javawork.virtual.unit6.majorlab;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Polygon;



class DrawPanel extends JPanel {

    private void draw(Graphics g)
    {

        //Only one line of code goes here
        // Pumpkin jack = new Pumpkin(g);
        //Face jack = new Face(g);
        JackOlantern jack = new JackOlantern(g);


    }


    //DONT TOUCH THIS NEITHER!
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        draw(g);
    }
}



//DO NOT CHANGE ANYTHING DOWN HERE!
class Runner extends JFrame {

    public Runner() {

        initUI();
    }

    private void initUI() {

        DrawPanel drawPanel = new DrawPanel();
        add(drawPanel);

        setSize(450, 350);
        setTitle("Graphics");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Runner ex = new Runner();
            ex.setVisible(true);
        });
    }
}
////////////////////////////////////////////////////////
class Pumpkin{
    public Pumpkin(Graphics g){
        g.setColor(new Color(232,164,50)); //[0...255]
        g.fillOval(50,50,300,225);
        g.setColor(new Color(50,200,50));
        g.fillRect(190,15,10,40);
    }
}
class Face{
    public Face(Graphics g){
        drawEyes(g);
        drawNose(g);
        drawMouth(g);
    }

    private void drawEyes(Graphics g){
        g.setColor(Color.black);
        g.fillOval(100,100,50,50);
        g.fillOval(250,100,50,50);
    }
    private void drawNose(Graphics g){
        Polygon nose = new Polygon();
        nose.addPoint(175,170);
        nose.addPoint(225,170);
        nose.addPoint(200,135);
        g.fillPolygon(nose);
    }
    private void drawMouth(Graphics g){
        Polygon mouth = new Polygon();
        mouth.addPoint(150,200);
        mouth.addPoint(100,175);
        mouth.addPoint(125,225);
        mouth.addPoint(200,250);
        mouth.addPoint(275,225);
        mouth.addPoint(300,175);
        mouth.addPoint(250,200);
        g.fillPolygon(mouth);
    }


}
class JackOlantern extends Pumpkin{ // inheritance is-a
    Face  f;

    public JackOlantern(Graphics g){
        super(g);
        caption(g);
        f = new Face(g); // composition has-a
    }

    private void caption(Graphics g){
        Font myFont = new Font("ravie", Font.BOLD, 48);
        g.setColor(Color.black);
        g.setFont(myFont);
        g.drawString("{Boo}lean!",50,325);
    }
}