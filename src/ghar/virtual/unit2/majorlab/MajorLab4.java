package ghar.javawork.virtual.unit2.majorlab;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


class DrawPanel extends JPanel {

    private void draw(Graphics g) {

        //Change code only in this method
        g.setColor(Color.blue);
        g.drawLine(100,70,200,90);
        g.setColor(Color.green);
        g.drawLine(100,200,150,50);
        g.setColor(Color.red);
        g.drawLine(100,30,100,150);
        g.setColor(Color.pink);
        g.drawLine(290,20,60,270);




    }


    //DONT TOUCH THIS NEITHER!
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        draw(g);
    }
}



//DO NOT CHANGE ANYTHING DOWN HERE!
public class MajorLab4 extends JFrame {

    public MajorLab4() {

        initUI();
    }

    private void initUI() {

        DrawPanel drawPanel = new DrawPanel();
        add(drawPanel);

        setSize(350, 350);
        setTitle("Graphics");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MajorLab4 ex = new MajorLab4();
            ex.setVisible(true);
        });
    }
}