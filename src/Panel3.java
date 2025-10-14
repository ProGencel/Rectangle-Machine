import javax.swing.*;
import java.awt.*;

public class Panel3 extends JPanel {

    JLabel label1 = new JLabel("x1");
    JLabel label2 = new JLabel("y1");
    JLabel label3 = new JLabel("x2");
    JLabel label4 = new JLabel("y2");
    Panel2 panel2;

    Font font = new Font("Arial", Font.PLAIN,18);

    public Panel3(Panel2 panel2)
    {
        this.panel2 = panel2;
        setBackground(Color.black);
        setBounds(panel2.screenWidth - panel2.smallPanelWidth - 25,70,
                30, panel2.smallPanelHeight-60);

        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setBackground(Color.decode("#0F355C"));

        label1.setFont(font);
        label1.setForeground(Color.decode("#6C7A92"));
        label2.setFont(font);
        label2.setForeground(Color.decode("#6C7A92"));
        label3.setFont(font);
        label3.setForeground(Color.decode("#6C7A92"));
        label4.setFont(font);
        label4.setForeground(Color.decode("#6C7A92"));

        add(label1);
        add(Box.createVerticalStrut(13));
        add(label2);
        add(Box.createVerticalStrut(13));
        add(label3);
        add(Box.createVerticalStrut(13));
        add(label4);
    }

}
