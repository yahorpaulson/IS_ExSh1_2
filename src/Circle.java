/**
 * Name> Yahor Siarheyeu
 * M.Nr.> 11930943
 */
public class Circle implements IShape{
    private double area;
    private double perimeter;
    private double radius;

    public Circle(){
        this.radius = radius;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;

    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

}
