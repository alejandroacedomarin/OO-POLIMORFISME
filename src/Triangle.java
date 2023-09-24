public class Triangle extends Figura{
    double base;
    double high;
    double a;
    public Triangle(double b, double h){
        this.base = b;
        this.high = h;
    }
    public double area(){
        this.a = (base*high)/2;
        return this.a;
    }
}
