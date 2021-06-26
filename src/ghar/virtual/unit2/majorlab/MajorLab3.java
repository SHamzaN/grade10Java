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
//        g.drawLine(200,100,50,100);
//        g.drawLine(200,100,120,50);
//        g.drawLine(50,100,120,50);
//        g.drawLine(120,100,120,50);
//        g.drawLine(50,100,120,80);
//        g.drawLine(200,100,120,80);
//        g.drawLine(90,70,120,80);
//        g.drawLine(150,70,120,80);
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
//public class MajorLab3 extends JFrame {
//
//    public MajorLab3() {
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
//            MajorLab3 ex = new MajorLab3();
//            ex.setVisible(true);
//        });
//    }
//}