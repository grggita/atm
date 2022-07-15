import javax.swing.*;
import java.awt.*;

public class ATM {
    public static void main(String[] args) {
        JFrame f = new JFrame("ATM");

        JLabel l = new JLabel("Please Select You Transaction...");
        l.setBounds(70, 30, 400, 50);
        l.setFont(new Font("Serif", Font.BOLD, 20));

        JButton b = new JButton("Deposit");
        b.setBounds(50, 100, 150, 40);
        b.setBackground(Color.green);

        JButton c = new JButton("Fast Cash");
        c.setBounds(50, 150, 150, 40);
        c.setBackground(Color.magenta);

        JButton d = new JButton("Pin Change");
        d.setBounds(50, 200, 150, 40);
        d.setBackground(Color.yellow);

        JButton e = new JButton("Cash Withdrawl");
        e.setBounds(220, 150, 150, 40);
        e.setBackground(Color.magenta);

        JButton g = new JButton("Mini Statement");
        g.setBounds(220, 200, 150, 40);
        g.setBackground(Color.yellow);

        JButton h = new JButton("Balance Enquiry");
        h.setBounds(220, 100, 150, 40);
        h.setBackground(Color.green);

        JButton i = new JButton("Exit");
        i.setBounds(120, 250, 150, 40);
        i.setBackground(Color.red);

        f.add(l);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);
        f.add(g);
        f.add(h);
        f.add(i);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}