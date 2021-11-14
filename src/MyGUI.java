import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class MyGUI extends JFrame {

    public MyGUI() {
        setTitle("Geometry Genius");
        setSize(500,550);


        setLayout(null);



        CirclePanel circlePanel = new CirclePanel();
        circlePanel.setBounds(0,0,500,150);
        TitledBorder circleBorder = BorderFactory.createTitledBorder("Circle");
        circlePanel.setBorder(circleBorder);


        RectanglePanel rectanglePanel = new RectanglePanel();
        rectanglePanel.setBounds(0,155,500,160);
        TitledBorder rectangleBorder = BorderFactory.createTitledBorder("Rectangle");
        rectanglePanel.setBorder(rectangleBorder);


        TrianglePanel trianglePanel = new TrianglePanel();
        trianglePanel.setBounds(0,315,500,170);
        TitledBorder triangleBorder = BorderFactory.createTitledBorder("Triangle");
        trianglePanel.setBorder(triangleBorder);


        add(circlePanel);
        add(rectanglePanel);
        add(trianglePanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        setVisible(true);
    }



}
