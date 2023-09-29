
/**
 * AP CS A Problem Set 2C
 *
 * @Cindy Weng
 * @Sept. 21, 2023
 */

import java.util.*;

public class MySolution
{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        //findQuadraticRoots
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c: ");
        System.out.print("a: ");
        double a=sc.nextDouble();
        System.out.print("b: ");
        double b=sc.nextDouble();
        System.out.print("c: ");
        double c=sc.nextDouble();

        OrderedPair quadraticRoots=findQuadraticRoots(a, b, c);
        System.out.println("The solutions for "+(int)a+"x^2 + "+(int)b+" + "+(int)c+" are "+quadraticRoots);

        //findSlope
        System.out.println("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1s=sc.nextDouble();
        System.out.print("y1: ");
        double y1s=sc.nextDouble();
        System.out.print("x2: ");
        double x2s=sc.nextDouble();
        System.out.print("y2: ");
        double y2s=sc.nextDouble();
        OrderedPair coordinate1s=new OrderedPair(x1s, y1s);
        OrderedPair coordinate2s=new OrderedPair(x2s, y2s);
        System.out.println("A line between "+coordinate1s+" and "+coordinate2s+" has a slope of "+findSlope(coordinate1s, coordinate2s)+".");

        //find midpoint
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1m=sc.nextDouble();
        System.out.print("y1: ");
        double y1m=sc.nextDouble();
        System.out.print("x2: ");
        double x2m=sc.nextDouble();
        System.out.print("y2: ");
        double y2m=sc.nextDouble();
        OrderedPair coordinate1m=new OrderedPair(x1m, y1m);
        OrderedPair coordinate2m=new OrderedPair(x2m, y2m);
        System.out.println("The midpoint between "+coordinate1m+" and "+coordinate2m+" is "+findMidpoint(coordinate1m, coordinate2m)+"."); 

        //find arithmetic sum
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int numTA=sc.nextInt();
        System.out.print("Starts with: ");
        double term1A=sc.nextDouble();
        System.out.print("Increases by: ");
        double d=sc.nextDouble();

        System.out.println("The sum of the first "+numTA+" terms of an arithmetic series that starts with "+term1A+" and increases by "+d+" is "+findArithmeticSeriesSum(term1A, d, numTA)+".");


        //find geometric sum
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        int numTG=sc.nextInt();
        System.out.print("Starts with: ");
        double term1G=sc.nextDouble();
        System.out.print("Rate of growth: ");
        double rg=sc.nextDouble();
        System.out.println("The sum of the first "+numTG+" terms of a finite geometric series that starts with "+term1G+" and increases by a rate of "+rg+" is "+findGeometricSeriesSum(term1G, rg, numTG)+".");

        //roll a dice
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int n=sc.nextInt();
        
        System.out.print("Rolling a "+n+"-sided die... you got a "+rollDie(n)+"!");

    }
    public static OrderedPair findQuadraticRoots (double a, double b, double c){
        //ax^2 + bx + c
        double root1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2/a;
        double root2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2/a;

        OrderedPair output=new OrderedPair(root1, root2);
        return output;
    }

    public static double findSlope (OrderedPair A, OrderedPair B){
        double x1=A.getX();
        double x2=B.getX();
        double y1=A.getY();
        double y2=B.getY();

        double slope=(y2-y1)/(x2-x1);
        return slope;
    }

    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double x1=A.getX();
        double x2=B.getX();
        double y1=A.getY();
        double y2=B.getY();

        double x=(x1+x2)/2;
        double y=(y1+y2)/2;

        OrderedPair output=new OrderedPair(x, y);
        return output;
    }

    public static double findArithmeticSeriesSum (double a, double d, int k){
        double sum=(a+a+d*(k-1))*k/2;
        return sum;
    }

    public static double findGeometricSeriesSum (double a, double r, int k){
        double sum=a*((1-Math.pow(r, k))/(1-r));
        return sum;
    }

    public static int rollDie (int sides){
        int randNum=(int) (Math.random()*sides) + 1;
        return randNum;
    }
}
