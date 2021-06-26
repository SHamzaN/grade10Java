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
//        g.drawOval(150,25,150,150);
//        g.drawOval(150,70,150,50);
//        g.drawOval(150,60,150,80);
//        g.drawOval(150,50,150,100);
//        g.drawOval(190,25,80,150);
//        g.drawOval(180,25,80,150);
//        g.drawOval(170,25,120,150);
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
//public class MajorLab2 extends JFrame {
//
//    public MajorLab2() {
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
//            MajorLab2 ex = new MajorLab2();
//            ex.setVisible(true);
//        });
//    }
//}