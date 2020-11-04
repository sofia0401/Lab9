package Task1;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    Oval ov;
    Rectangle rect;
    Arc a;
    public Main(){

        setResizable(false);
        setSize(1200,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        JButton btn = new JButton("Press here");
        btn.setBounds(1050,10,100,50);
        add(btn);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                for (int i=0;i<20;i++) {
                    switch ((int) (Math.random() * 3)) {
                        case 0: {
                            ov = new Oval();
                            add(ov);
                            setVisible(true);
                            break;
                        }

                        case 1: {
                            rect = new Rectangle();
                            add(rect);
                            setVisible(true);
                            break;
                        }
                        case 2: {
                            a = new Arc();
                            add(a);
                            setVisible(true);
                            break;
                        }
                    }
                }
            }
        });
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main m=new Main();
    }
}

