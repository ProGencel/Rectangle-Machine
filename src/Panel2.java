import javax.swing.*;
import java.awt.*;

public class Panel2 extends JPanel {

    int screenWidth = 1280;
    int screenHeight = 720;
    int smallPanelHeight = 200;
    int smallPanelWidth = 300;

    public Panel2()
    {
        Panel panel = new Panel();
        GraphicsPanel gpp = new GraphicsPanel(this,panel);
        panel.setGraphicsPanel(gpp);
        Panel3 panel3 = new Panel3();


        setBackground(Color.decode("#0F355C"));
        setLayout(null);

        panel.setBounds(screenWidth-smallPanelWidth,0,smallPanelWidth,smallPanelHeight);
        add(panel);
        add(gpp);
        add(panel3);
    }
}
