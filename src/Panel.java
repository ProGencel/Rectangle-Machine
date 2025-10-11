import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    GraphicsPanel gpp;

    public void setGraphicsPanel(GraphicsPanel gpp)
    {
        this.gpp = gpp;
    }

    public Panel()
    {
        setBackground(Color.darkGray);

        //Label settings

        label1.setBackground(Color.white);
        label1.setForeground(Color.GRAY);
        label1.setFont(new Font("Papyrus",Font.BOLD,20));

        label2.setBackground(Color.white);
        label2.setForeground(Color.GRAY);
        label2.setFont(new Font("Papyrus",Font.BOLD,20));

        //Button settings

        button1.setBackground(Color.gray);
        button2.setBackground(Color.gray);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input1 = text1.getText();
                x1_1 = Integer.parseInt(input1);

                String input3 = text3.getText();
                y1_1 = Integer.parseInt(input3);

                String input5 = text5.getText();
                x2_1 = Integer.parseInt(input5);

                String input7 = text7.getText();
                y2_1 = Integer.parseInt(input7);

                gpp.repaint();

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input2 = text2.getText();
                x1_2 = Integer.parseInt(input2);

                String input4 = text4.getText();
                y1_2 = Integer.parseInt(input4);

                String input6 = text6.getText();
                x2_2 = Integer.parseInt(input6);

                String input8 = text8.getText();
                y2_2 = Integer.parseInt(input8);
                System.out.println(x1_1+""+y1_2);

                gpp.repaint();
            }
        });

        //Text settings

        text1.setBackground(Color.lightGray);
        text2.setBackground(Color.lightGray);
        text3.setBackground(Color.lightGray);
        text4.setBackground(Color.lightGray);
        text5.setBackground(Color.lightGray);
        text6.setBackground(Color.lightGray);
        text7.setBackground(Color.lightGray);
        text8.setBackground(Color.lightGray);

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
