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

        Fraction a = new Fraction();
        Fraction b = new Fraction();

        a.n = 4; a.d = 2;
        b.n = 4; b.d = 2;

        System.out.println(Fraction.equals(a, b));
    }

}
