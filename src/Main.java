import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
        JFrame window = new JFrame("Rectangle Machine");
        Panel2 panel2 = new Panel2();

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setSize(new Dimension(panel2.screenWidth,panel2.screenHeight));
        window.setLocationRelativeTo(null);

        window.setLayout(new BorderLayout());
        window.add(panel2,BorderLayout.CENTER);//Main panel

        window.setVisible(true);
    }
}