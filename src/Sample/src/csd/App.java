/*----------------------------------------------------------------------------------------------------------------------
	Metot çağrısında argüman olarak verilen ifadeler önce hesaplanır. İfadelerden elde edilen değerler ile
	metot çağrılır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        Sample.foo(Sample.bar());
    }
}


class Sample {

    //argümanı ekrana basıyor.
    public static void foo(int a)
    {
        System.out.println(a);
    }

    //kullanıcıdan sayı alıp karesinin alıyormuş
    public static int bar()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("val1?");
        int val1 = Integer.parseInt(kb.nextLine());

        int result = val1 * val1;

        kb.close();
        return result;
    }
}