package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Okno extends JFrame implements MouseListener {

    String nazwaOkna;

    ArrayList<Point> srodekOkregu = new ArrayList<>();

    JCheckBox box = new JCheckBox();
    JLabel label = new JLabel("Skroc sprezyne");

    Color refColor = Color.gray;
    static final int limit = -100;
    int Xc, Yc, Rc;


    public Okno(String nazwaOkna){
        super(nazwaOkna);
        setSize(500, 300);
        setResizable(false);
        setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(box);
        panel.add(label);

        box.setFocusable(false);
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(refColor);
        for(Point p:srodekOkregu){
            Xc=(int)p.getX();
            Yc=(int)p.getY();
            g.drawOval(Xc,Yc,Rc,Rc);
        }
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
