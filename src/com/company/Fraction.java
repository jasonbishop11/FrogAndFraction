package com.company;

public class Fraction {
    private int numerator;		//attributes
    private int denominator;

    // constructor
    public Fraction(int n, int d)	// constructor
    {
        numerator = n;
        denominator = d;
    }

    public Fraction(){
        numerator = 1;
        denominator = 2;
    }

    public int getNum()
    {
        return numerator;
    }
    public int getDenom()
    {
        return denominator;
    }
    public Fraction add(Fraction other)
    {
        int n = this.numerator*other.denominator + this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    public Fraction subtract(Fraction f){
        int n = this.numerator*f.denominator - this.denominator*f.numerator;
        int d = this.denominator * f.getDenom();

        Fraction result = new Fraction(n,d);
        return result;
    }

    public Fraction multiply(Fraction f){
        int n = this.numerator*f.numerator;
        int d = this.denominator * f.denominator;

        Fraction result = new Fraction(n,d);
        return result;
    }

    public String toString(){
        String s = "The Fraction is " + numerator + "/" + denominator;
        return s;
    }


    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);	// create an instance of fraction
        Fraction f2 = new Fraction(4,5);

        Fraction f3 = f1.add(f2);			// add 2 fractions
        System.out.println("3/4 + 4/5 = " + f3);	// print the answer


		Fraction f4 = f1.subtract(f2);
		System.out.println("3/4 - 4/5 = " + f4);

		//Add code to call multiply f1 and f2 here
        Fraction f5 = f1.multiply(f2);
        System.out.println("3/4 * 4/5 = " + f5);
		//create 2 new fractions and add them here.
        Fraction f6 = new Fraction();
        Fraction f7 = new Fraction(7, 9);
        Fraction f8 = f6.add(f7);
        System.out.println("1/2 + 7/9 = " + f8);
    }

}

/* Output

3/4 + 4/5 = The Fraction is 31/20
3/4 - 4/5 = The Fraction is -1/20
3/4 * 4/5 = The Fraction is 12/20
1/2 + 7/9 = The Fraction is 23/18

 */