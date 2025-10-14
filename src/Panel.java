import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JPanel {


    JLabel label1 = new JLabel("1. rectangle");
    JLabel label2 = new JLabel("2. rectangle");

    JButton button1 = new JButton("Confirm");
    JButton button2 = new JButton("Confirm");

    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JTextField text4 = new JTextField();
    JTextField text5 = new JTextField();
    JTextField text6 = new JTextField();
    JTextField text7 = new JTextField();
    JTextField text8 = new JTextField();

    public int x1_1;
    public int y1_1;
    public int x2_1;
    public int y2_1;
    public int x1_2;
    public int y1_2;
    public int x2_2;
    public int y2_2;

    public boolean isButton1Pressed = false;
    public boolean isButton2Pressed = false;

    GraphicsPanel gpp;

    public void setGraphicsPanel(GraphicsPanel gpp)
    {
        this.gpp = gpp;
    }

    public Panel()
    {
        setBackground(Color.decode("#1A2E4F"));

        //Label settings

        label1.setForeground(Color.decode("#FFC857"));
        label1.setFont(new Font("Inter",Font.BOLD,20));

        label2.setForeground(Color.decode("#5AB9EA"));
        label2.setFont(new Font("Roboto Mono",Font.BOLD,20));

        //Button settings

        button1.setBackground(Color.decode("#2E4C76"));
        button1.setFocusPainted(false);
        button1.setBorderPainted(false);
        button1.setForeground(Color.decode("#D9E6FF"));

        button2.setBackground(Color.decode("#2E4C76"));
        button2.setFocusPainted(false);
        button2.setBorderPainted(false);
        button2.setForeground(Color.decode("#D9E6FF"));

        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                button1.setBackground(Color.decode("#4A6FA8"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button1.setBackground(Color.decode("#2E4C76"));
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    String input1 = text1.getText();
                    x1_1 = Integer.parseInt(input1);

                    String input3 = text3.getText();
                    y1_1 = Integer.parseInt(input3);

                    String input5 = text5.getText();
                    x2_1 = Integer.parseInt(input5);

                    String input7 = text7.getText();
                    y2_1 = Integer.parseInt(input7);

                    isButton1Pressed = true;

                    gpp.repaint();
                }catch(NumberFormatException ee){
                    System.out.println("Please enter a number");
                }

            }
        });

        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                button2.setBackground(Color.decode("#4A6FA8"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button2.setBackground(Color.decode("#2E4C76"));
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    String input2 = text2.getText();
                    x1_2 = Integer.parseInt(input2);

                    String input4 = text4.getText();
                    y1_2 = Integer.parseInt(input4);

                    String input6 = text6.getText();
                    x2_2 = Integer.parseInt(input6);

                    String input8 = text8.getText();
                    y2_2 = Integer.parseInt(input8);

                    isButton2Pressed = true;

                    gpp.repaint();
                }catch(NumberFormatException ee){
                    System.out.println("Please enter a number");
                }
            }
        });

        //Text settings

        text1.setBackground(Color.decode("#223A63"));
        text2.setBackground(Color.decode("#223A63"));
        text3.setBackground(Color.decode("#223A63"));
        text4.setBackground(Color.decode("#223A63"));
        text5.setBackground(Color.decode("#223A63"));
        text6.setBackground(Color.decode("#223A63"));
        text7.setBackground(Color.decode("#223A63"));
        text8.setBackground(Color.decode("#223A63"));

        text1.setCaretColor(Color.white);
        text2.setCaretColor(Color.white);
        text3.setCaretColor(Color.white);
        text4.setCaretColor(Color.white);
        text5.setCaretColor(Color.white);
        text6.setCaretColor(Color.white);
        text7.setCaretColor(Color.white);
        text8.setCaretColor(Color.white);

        text1.setForeground(Color.white);
        text2.setForeground(Color.white);
        text3.setForeground(Color.white);
        text4.setForeground(Color.white);
        text5.setForeground(Color.white);
        text6.setForeground(Color.white);
        text7.setForeground(Color.white);
        text8.setForeground(Color.white);

        /////////////////////////////////////////////////////////////

        setLayout(new GridLayout(6,2,10,10));

        add(label1);
        add(label2);
        add(button1);
        add(button2);
        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(text5);
        add(text6);
        add(text7);
        add(text8);

    }
}
