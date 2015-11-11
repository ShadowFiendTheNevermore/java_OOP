package Render;
import Fraction.Fraction;

/**
 *
 * Created by https://github.com/ShadowFiendTheNevermore
 * 28.10.2015
 *
 */
public class Main {

    public static void main(String[] args){

        Fraction a = new Fraction(4, 2);
        Fraction b = new Fraction(4, 2);


        System.out.println(Fraction.equals(a, b));
        System.out.println(Fraction.division(a, b));
        System.out.println(Fraction.multiply(a, b));
    }

}
