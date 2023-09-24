public class Rectangle extends Figura{
    double lao;
    double lao1;
    double a;
    public Rectangle(double l1, double l2){
        this.lao = l1;
        this.lao1 = l2;
    }
    public double area(){
        this.a = lao*lao1;
        return this.a;
    }
}
