/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden Long, Double türden bir değer isteme kalıbı
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        long val = Long.parseLong(kb.nextLine());

        System.out.println(val * val);

        kb.close();
    }
}


class Sample {
    public static void foo()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("sayi?");
        double val = Double.parseDouble(kb.nextLine());
        System.out.println(val * val);
        kb.close();
    }

}

class Mample {
    public static void foo()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("sayi?");
        long val = Long.parseLong(kb.nextLine());
        System.out.println(val * val);
        kb.close();
    }

}