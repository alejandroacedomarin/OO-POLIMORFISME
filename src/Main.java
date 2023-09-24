import java.util.Arrays;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static double suma(Figura[] v)
    {
        double res=0;
        for(Figura f : v)
        {
            res+=f.area();
        }
        return res;
    }
public static void sort(Figura[] v)
{
    Arrays.sort(v, Comparator.comparing(Figura::area));
}

public static void main(String[] args){
    Figura[] v = new Figura[4];
    v[0]=new Rectangle(5,3);
    v[1]=new Circle(5);
    v[2]=new Square(5);
    v[3]=new Triangle(3,5);
    double res = suma(v);
    System.out.println("suma:"+res);
    sort(v);

}
}