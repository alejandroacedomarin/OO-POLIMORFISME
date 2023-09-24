public class Circle extends Figura{
    double rad;

    public Circle(double r){
        this.rad = r;
    }
    public double area(){
        return Math.PI * rad*rad;

    }
}
