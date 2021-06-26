//package ghar.javawork.virtual.unit2.majorlab;
//import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Graphics;
//import java.awt.Font;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//
//class DrawPanel extends JPanel {
//
//    private void draw(Graphics g) {
//
//        //Change code only in this method
//        g.drawRect(80, 80, 80, 80); // square
//        g.drawRect(100, 100, 100, 100);
//        g.drawLine(80, 80, 100,100);
//        g.drawLine(160, 160 , 200, 200);
//        g.drawLine(80,160, 100 ,200);
//        g.drawLine(160,80,200,100 );
//
//
//
//
//
//    }
//
//
//    //DONT TOUCH THIS NEITHER!
//    @Override
//    public void paintComponent(Graphics g) {
//
//        super.paintComponent(g);
//        draw(g);
//    }
//}
//
//
//
////DO NOT CHANGE ANYTHING DOWN HERE!
//public class MajorLab1 extends JFrame {
//
//    public MajorLab1() {
//
//        initUI();
//    }
//
//    private void initUI() {
//
//        DrawPanel drawPanel = new DrawPanel();
//        add(drawPanel);
//
//        setSize(350, 350);
//        setTitle("Graphics");
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    public static void main(String[] args) {
//
//        EventQueue.invokeLater(() -> {
//            MajorLab1 ex = new MajorLab1();
//            ex.setVisible(true);
//        });
//    }
//}