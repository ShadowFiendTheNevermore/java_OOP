package Fraction;

public class Fraction {

    public int d, n;


    public String toString(){

        return n + "/" + d;

    }
    public static boolean equals(Fraction first, Fraction second){

        /*
        *
        * Cashing variables
        *
        * */
        int delFirst = first.d;
        int delSecond = second.d;
        int numFirst = first.n;
        int numSecond = second.n;

        /*
        *
        * Mutual for Fractions
        *
        * */
        int mutual = delFirst * delSecond;

        int multyplierFirst = getMultyplierForNum(delFirst, mutual);
        int multyplierSecond = getMultyplierForNum(delSecond, mutual);

        /*
        *
        * Compare do there
        *
        * */

        return numFirst * multyplierFirst == numSecond * multyplierSecond;


    }

    /*
    *
    * Multyplier getter for Numerable
    *
    * */
    private static int getMultyplierForNum(int delimeter, int mutual){

        return mutual / delimeter;

    }

}
