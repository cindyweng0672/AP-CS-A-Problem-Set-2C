
/**
 * AP CS A Problem Set 2C - OrderedPair class
 *
 * @Cindy Weng
 * @Sept. 21, 2023
 */
public class OrderedPair
{
    double X;
    double Y;

    public OrderedPair(){
        X=0.0;
        Y=0.0;
    }

    public OrderedPair(double xValue, double yValue){
        X=xValue;
        Y=yValue;
    }

    public String toString(){
        return "("+X+", "+Y+")";
    }

    public double getX(){
        return X;
    }

    public double getY(){
        return Y;
    }
}
