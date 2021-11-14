import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class TrianglePanel extends JPanel {

    public TrianglePanel(){
        Triangle triangle = new Triangle();
        ExceptionChecker checker = new ExceptionChecker();

        setLayout(null);
        JLabel exceptionLabel = new JLabel();
        exceptionLabel.setBounds(200, 10, 200, 20);
        exceptionLabel.setForeground(Color.RED);
        add(exceptionLabel);

        //region Triangle

        JLabel sideA = new JLabel("Side A: ");
        sideA.setBounds(10,40, 80, 20);
        add(sideA);

        JLabel sideB = new JLabel("Side B: ");
        sideB.setBounds(10,70, 80, 20);
        add(sideB);

        JLabel sideC = new JLabel("Side C: ");
        sideC.setBounds(10,100, 80, 20);
        add(sideC);

        JTextField sideAText = new JTextField();
        sideAText.setBounds(75, 40, 80,20);
        add(sideAText);

        JTextField sideBText = new JTextField();
        sideBText.setBounds(75, 70, 80,20);
        add(sideBText);

        JTextField sideCText = new JTextField();
        sideCText.setBounds(75, 100, 80,20);
        add(sideCText);

        JLabel areaTriangle = new JLabel("Area: ");
        areaTriangle.setBounds(300, 40, 80, 20);
        add(areaTriangle);

        JLabel perimeterTriangle = new JLabel("Perimeter: ");
        perimeterTriangle.setBounds(300, 70, 80, 20);
        add(perimeterTriangle);

        JLabel resultAreaTriangle = new JLabel();
        resultAreaTriangle.setBounds(400, 40, 80, 20);
        add(resultAreaTriangle);

        JLabel resultPerimeterTriangle = new JLabel();
        resultPerimeterTriangle.setBounds(400, 70, 80, 20);
        add(resultPerimeterTriangle);

        JButton calculateTriangle = new JButton("Calculate");
        calculateTriangle.setBounds(350,100,100, 20);
        add(calculateTriangle);



        calculateTriangle.addActionListener(e ->{
            if(!((checker.checkNumber(sideAText.getText()))&&
                    (checker.checkNumber(sideBText.getText()))&&
                    (checker.checkNumber(sideCText.getText())))){
                exceptionLabel.setText("Not correct data!");
                throw new NumberFormatException("Please enter the correct number");
            } else if(!checker.checkTriangle(Double.parseDouble(sideAText.getText()),Double.parseDouble(sideBText.getText()), Double.parseDouble(sideCText.getText()))){
                exceptionLabel.setText("Illegal Argument Exception!");
                throw new IllegalArgumentException("Not a triangle!");
            } else {
                exceptionLabel.setText("");
                triangle.setSideA(Double.parseDouble(sideAText.getText()));
                triangle.setSideB(Double.parseDouble(sideBText.getText()));
                triangle.setSideC(Double.parseDouble(sideCText.getText()));

                resultAreaTriangle.setText(String.format("%.2f",triangle.calculateArea()));
                resultPerimeterTriangle.setText(String.format("%.2f",triangle.calculatePerimeter()));
            }
        });

        //endregion





    }



}
