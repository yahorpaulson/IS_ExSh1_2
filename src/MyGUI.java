import javax.swing.*;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class MyGUI extends JFrame {

    public MyGUI() {
        setTitle("Geometry Genius");
        setSize(500,500);

        EnginePanel panel = new EnginePanel();

        panel.setSize(500,500);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        setVisible(true);
    }



}
