
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Menu extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new Menu("Shubhamjain12368@gmail.com");
    }

    JLabel label;
    String emaill;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    Cursor cur = new Cursor(Cursor.HAND_CURSOR);

    Menu(String email) {
        emaill = email;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
        this.setLayout(null);

        // labels
        JLabel l1 = new JLabel();
        l1.setBounds(50, 60, 400, 400);

        // background
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/menu1.png"));
        label = new JLabel(i1);
        label.setBounds(-8, -20, 800, 550);

        Cursor cur = new Cursor(Cursor.HAND_CURSOR);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("image/mbut.jpg"));
        // btn1.setIcon(i2);
        btn1 = new JButton("Record");
        btn1.setBounds(70, 70, 120, 70);
        btn1.setFocusable(false);
        // btn1.setOpaque(false);
        btn1.setFocusPainted(true);
        btn1.setBackground(Color.lightGray);
        btn1.setForeground(Color.black);
        btn1.setCursor(cur);
        btn1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        btn1.setContentAreaFilled(true);
        btn1.addActionListener(this);
        btn1.setCursor(cur);
        // btn1.setBackground(Color.CYAN);

        btn2 = new JButton("Show Record");
        btn2.setBounds(250, 70, 120, 70);
        btn2.setBackground(Color.lightGray);
        btn2.setForeground(Color.black);
        btn2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        btn2.setFocusable(false);
        btn2.setCursor(cur);
        btn2.setOpaque(true);
        btn2.addActionListener(this);
        btn2.setCursor(cur);

        btn3 = new JButton("Delete Record");
        btn3.setBounds(70, 200, 120, 70);
        btn3.setBackground(Color.lightGray);
        btn3.setForeground(Color.black);
        btn3.setCursor(cur);
        btn3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        btn3.setFocusable(false);
        btn3.setCursor(cur);

        btn4 = new JButton("Calorie");
        btn4.setBounds(250, 200, 120, 70);
        btn4.setFocusable(false);
        btn4.setBackground(Color.lightGray);
        btn4.setForeground(Color.black);
        btn4.setCursor(cur);
        btn4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        btn4.addActionListener(this);
        btn4.setCursor(cur);

        btn5 = new JButton("BMI");
        btn5.setBounds(70, 330, 120, 70);
        btn5.setFocusable(false);
        btn5.setBackground(Color.lightGray);
        btn5.setForeground(Color.black);
        btn5.setCursor(cur);
        btn5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        btn5.setCursor(cur);
        btn5.addActionListener(this);

        btn6 = new JButton("Exercise");
        btn6.setBounds(250, 330, 120, 70);
        btn6.setFocusable(false);
        btn6.setBackground(Color.lightGray);
        btn6.setForeground(Color.black);
        btn6.setCursor(cur);
        btn6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        btn6.setCursor(cur);
        btn6.addActionListener(this);

        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(0, 0, 800, 550);
        layer.add(btn1, Integer.valueOf(2));
        layer.add(btn2, Integer.valueOf(2));
        layer.add(btn3, Integer.valueOf(2));
        layer.add(btn4, Integer.valueOf(2));
        layer.add(btn5, Integer.valueOf(2));
        layer.add(btn6, Integer.valueOf(2));
        layer.add(l1, Integer.valueOf(3));
        layer.add(label, Integer.valueOf(0));
        this.add(layer);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn5) {
            this.dispose();
            new BMI(emaill);
        } else if (e.getSource() == btn4) {
            this.dispose();
            new Calorie(emaill);
        } else if (e.getSource() == btn1) {
            this.dispose();
            new CreateRec(0, emaill);
        } else if (e.getSource() == btn2) {
            this.dispose();
            new ShowRec(emaill);

        } else if (e.getSource() == btn6) {
            this.dispose();
            new exercise();
        }
    }
}
