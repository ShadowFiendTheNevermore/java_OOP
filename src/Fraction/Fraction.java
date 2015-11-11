package Fraction;

public class Fraction {

    public int d, n;

    Fraction(){

    }

    public String toString(){

        return n + "/" + d;

    }
    public static boolean equals(Fraction first, Fraction second){

        // Cashing variables

        int numFirst = first.n;
        int numSecond = second.n;


        // Mutual for Fractions

        int mutual = getMutual(first, second);

        int multyplierFirst = getMultyplierForNum(first.d, mutual);
        int multyplierSecond = getMultyplierForNum(second.d, mutual);

        // compare

        return numFirst * multyplierFirst == numSecond * multyplierSecond;


    }

    /*
    *
    * Params: Fractions objects
    * return @object
    *
    * */
    public static Fraction multiply(Fraction first, Fraction second){

        int multipliedDel;
        int multipliedNum;

        multipliedDel = first.n * second.d;
        multipliedNum = first.d * second.n;

        return new Fraction(multipliedNum, multipliedDel);
    }

    /*
    * params delimiters
    *
    * return @int
    *
    * */
    private static int getMutual(Fraction first, Fraction second){
        return first.d * second.d;
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
