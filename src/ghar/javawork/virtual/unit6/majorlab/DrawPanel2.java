package ghar.javawork.virtual.unit6.majorlab;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


class DrawPanel2 extends JPanel {

    private void draw(Graphics g) {

        //Only 1 line of code goes here. Instantiate an object of your subclass.
        Finish2 jack = new Finish2(g);
    }


    //DONT TOUCH THIS NEITHER!
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        draw(g);
    }
}


//DO NOT CHANGE ANYTHING DOWN HERE!
class MajorLab2 extends JFrame {

    public MajorLab2() {

        initUI();
    }

    private void initUI() {

        DrawPanel2 drawPanel2 = new DrawPanel2();
        add(drawPanel2);

        setSize(450, 350);
        setTitle("Graphics");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MajorLab2 ex = new MajorLab2();
            ex.setVisible(true);
        });
    }
}

/////////////////////// ADD CLASSES BELOW THIS LINE ///////////////////////////////////////////////////
class GodzillaKing {
    public GodzillaKing(Graphics g) {
        //  g.setColor(new Color(232,164,100)); //[0...255]
        g.fillRect(0, 0, 450, 350);
        g.setColor(new Color(43, 46, 54));
        g.fillRect(0, 250, 450, 350);
    }
}

class Lizard {
    public Lizard(Graphics g) {
        drawEyes(g);
        drawBody(g);
        drawArms(g);
        drawTail(g);
    }

    private void drawEyes(Graphics g) {

        g.setColor(new Color(52, 219, 235));
        g.drawOval(270, 35, 15, 7);
        g.fillOval(275, 35, 7, 7);

    }

    private void drawBody(Graphics g) {
        // back
        g.setColor(Color.black);
        g.drawLine(240, 125, 230, 175);
        g.drawLine(245, 100, 239, 130);
        g.drawLine(250, 75, 246, 99);
        g.drawLine(254, 45, 246, 99);
        //  g.drawLine(254,50);
        g.drawArc(255, 30, 40, 30, 0, 180);
        // front
        g.drawArc(235, 70, 65, 120, 25, 70);
        g.drawLine(298, 105, 270, 205);

//        g.drawLine();
        //mouth
        g.drawLine(295, 45, 270, 45);
        g.drawLine(270, 70, 270, 45);
        g.drawLine(295, 70, 270, 70);
        g.setColor(new Color(93, 175, 194));
        g.fillArc(115, 47, 330, 20, 270, 180);
    }

    private void drawArms(Graphics g) {
        g.setColor(new Color(62, 64, 64));
        g.fillRect(290, 135, 35, 15);
        g.fillRect(285, 155, 35, 15);
        g.fillArc(300, 135, 50, 3, 270, 180);
        g.fillArc(300, 140, 50, 3, 270, 180);
        g.fillArc(300, 145, 50, 3, 270, 180);
        g.fillArc(290, 155, 50, 3, 270, 180);
        g.fillArc(290, 160, 50, 3, 270, 180);
        g.fillArc(290, 165, 50, 3, 270, 180);
    }

    private void drawTail(Graphics g) {
        // tail
        g.setColor(Color.black);
        g.drawLine(223, 230, 11, 230);
        g.drawLine(180, 200, 10, 230);
        g.drawArc(140, 130, 140, 100, 280, 50);
        g.drawArc(98, 101, 140, 100, 280, 50);

        // spikes
        g.setColor(new Color(93, 175, 194));
        g.drawLine(30, 210, 10, 230);
        g.drawLine(30, 210, 50, 224);
        g.drawLine(61, 206, 50, 224);
        g.drawLine(61, 206, 75, 220);
        g.drawLine(92, 202, 76, 220);
        g.drawLine(92, 202, 106, 215);
        g.drawLine(120, 197, 106, 215);
        g.drawLine(120, 196, 135, 210);
        g.drawLine(145, 195, 135, 210);
        g.drawLine(145, 194, 160, 204);
        g.drawLine(165, 190, 160, 204);
        g.drawLine(165, 190, 180, 200);
        g.drawLine(190, 185, 180, 200);
        g.drawLine(190, 185, 200, 195);
        g.drawLine(200, 180, 200, 195);
        g.drawLine(200, 180, 210, 190);
        g.drawLine(215, 175, 210, 190);
        g.drawLine(215, 175, 225, 180);
        g.drawLine(215, 165, 225, 180);
        g.drawLine(230, 165, 215, 165);
        g.drawLine(230, 165, 210, 145);
        g.drawLine(235, 140, 210, 145);
        g.drawLine(235, 140, 210, 125);
        g.drawLine(240, 120, 210, 125);
        g.drawLine(240, 118, 210, 100);
        g.drawLine(247, 80, 210, 100);

        // leg
        g.setColor(Color.black);
        g.drawLine(205, 250, 230, 230);
        g.drawLine(275, 250, 250, 220);
//       g.drawArc(150,250,120, 120,25,70);
//       g.drawLine(225,250,260,215);
        //   g.drawArc(144,105,140,100,280,50);
    }
}

class Finish2 extends GodzillaKing {
    Lizard f;

    public Finish2(Graphics g) {
        super(g);
        f = new Lizard(g);
    }
}