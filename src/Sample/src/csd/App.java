/*----------------------------------------------------------------------------------------------------------------------
	Metotların return deyimindeki ifade geçici değişkene yapılan bir atama işlemidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int a = Sample.foo();
    }
}


class Sample {
    public static int foo()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int val = Integer.parseInt(kb.nextLine());

        //---bu kısmı derleyici yapıyor.
        //int temp = 0; //geçici değişken
        //temp = val * val;
        //return temp;
        return val * val; //return deyimindeki ifade atama işlemidir. registera atıyor aslında
    }
}