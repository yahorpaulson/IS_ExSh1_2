import javax.swing.*;
import java.awt.*;

/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class EnginePanel extends JPanel {

    public EnginePanel(){
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        ExceptionChecker checker = new ExceptionChecker();

        setLayout(null);

        JLabel exceptionLabel = new JLabel();
        exceptionLabel.setBounds(200, 400, 200, 20);
        exceptionLabel.setForeground(Color.RED);
        add(exceptionLabel);

        //region Circle

        JLabel radius = new JLabel("Radius: ");
        radius.setBounds(10,10,80,20);
        add(radius);

        JTextField radiusText = new JTextField("",10);
        radiusText.setBounds(75,10, 80, 20);
        add(radiusText);

        JLabel areaC = new JLabel("Area: ");
        areaC.setBounds(300,10, 80,20);
        add(areaC);

        JLabel perimeterC = new JLabel("Perimeter: ");
        perimeterC.setBounds(300,40, 80,20);
        add(perimeterC);

        JLabel resultArea = new JLabel();
        resultArea.setBounds(400,10, 80, 20);
        add(resultArea);

        JLabel resultPerimeter = new JLabel();
        resultPerimeter.setBounds(400,40,80,20);
        add(resultPerimeter);


        JButton calculateC = new JButton("Calculate");
        calculateC.setBounds(350,70,100,20);

        add(calculateC);

        calculateC.addActionListener(e ->{
            if (!checker.checkNumber(radiusText.getText())){
                exceptionLabel.setText("Not correct data!");
            } else {
                exceptionLabel.setText("");
                circle.setRadius(Double.parseDouble(radiusText.getText()));
                resultArea.setText(String.format("%.2f", circle.calculateArea()));
                resultPerimeter.setText(String.format("%.2f", circle.calculatePerimeter()));
            }

        });
        //endregion



        //region Rectangle

        JLabel length = new JLabel("Length: ");
        length.setBounds(10, 130, 80,20);
        add(length);

        JTextField lengthText = new JTextField();
        lengthText.setBounds(75, 130, 80,20);
        add(lengthText);

        JLabel width = new JLabel("Width: ");
        width.setBounds(10, 170, 80,20);
        add(width);

        JTextField widthText = new JTextField();
        widthText.setBounds(75, 170, 80,20);
        add(widthText);

        JLabel areaRectangle = new JLabel("Area: ");
        areaRectangle.setBounds(300,130, 80,20);
        add(areaRectangle);

        JLabel perimeterRectangle = new JLabel("Perimeter: ");
        perimeterRectangle.setBounds(300,170, 80,20);
        add(perimeterRectangle);

        JLabel resultAreaRectangle = new JLabel();
        resultAreaRectangle.setBounds(400,130, 80, 20);
        add(resultAreaRectangle);

        JLabel resultPerimeterRectangle = new JLabel();
        resultPerimeterRectangle.setBounds(400,170,80,20);
        add(resultPerimeterRectangle);

        JButton calculateRectangle = new JButton("Calculate");
        calculateRectangle.setBounds(350,200, 100,20);
        add(calculateRectangle);

        calculateRectangle.addActionListener(e ->{
            if(!((checker.checkNumber(widthText.getText())&&(checker.checkNumber(lengthText.getText()))))){
                exceptionLabel.setText("Not correct data!");
            } else {
                exceptionLabel.setText("");
                rectangle.setLength(Double.parseDouble(lengthText.getText()));
                rectangle.setWidth(Double.parseDouble(widthText.getText()));
                resultAreaRectangle.setText(String.format("%.2f",rectangle.calculateArea()));
                resultPerimeterRectangle.setText(String.format("%.2f",rectangle.calculatePerimeter()));
            }


        });

        //endregion


        //region Triangle

        JLabel sideA = new JLabel("Side A: ");
        sideA.setBounds(10,260, 80, 20);
        add(sideA);

        JLabel sideB = new JLabel("Side B: ");
        sideB.setBounds(10,300, 80, 20);
        add(sideB);

        JLabel sideC = new JLabel("Side C: ");
        sideC.setBounds(10,340, 80, 20);
        add(sideC);

        JTextField sideAText = new JTextField();
        sideAText.setBounds(75, 260, 80,20);
        add(sideAText);

        JTextField sideBText = new JTextField();
        sideBText.setBounds(75, 300, 80,20);
        add(sideBText);

        JTextField sideCText = new JTextField();
        sideCText.setBounds(75, 340, 80,20);
        add(sideCText);

        JLabel areaTriangle = new JLabel("Area: ");
        areaTriangle.setBounds(300, 260, 80, 20);
        add(areaTriangle);

        JLabel perimeterTriangle = new JLabel("Perimeter: ");
        perimeterTriangle.setBounds(300, 300, 80, 20);
        add(perimeterTriangle);

        JLabel resultAreaTriangle = new JLabel();
        resultAreaTriangle.setBounds(400, 260, 80, 20);
        add(resultAreaTriangle);

        JLabel resultPerimeterTriangle = new JLabel();
        resultPerimeterTriangle.setBounds(400, 300, 80, 20);
        add(resultPerimeterTriangle);

        JButton calculateTriangle = new JButton("Calculate");
        calculateTriangle.setBounds(350,340,100, 20);
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
