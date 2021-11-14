/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class Triangle implements IShape{
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;
    private double perimeter;

    public Triangle(){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.area = 0;
        this.perimeter = 0;
    }

    public void setSideA(double sideA){
        this.sideA = sideA;
    }
    public void setSideB(double sideB){
        this.sideB = sideB;
    }
    public void setSideC(double sideC){
        this.sideC = sideC;
    }





    @Override
    public double calculateArea() {
        double temp = calculatePerimeter()/2;
        return Math.sqrt(temp*(temp - sideA)*(temp - sideB)*(temp - sideC));
    }

    @Override
    public double calculatePerimeter(){
        return sideA + sideB + sideC;
    }
}
