public class Square extends Rectangle{
    double lado;
    double a;
    public Square(double l){
        super(l,l);
    }

    public double area(){
        this.a = super.area();
        return this.a;
    }
}
