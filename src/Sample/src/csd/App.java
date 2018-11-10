/*----------------------------------------------------------------------------------------------------------------------
	Metot çağrısında argüman olarak verilen ifadeler önce hesaplanır. İfadelerden elde edilen değerler ile
	metot çağrılır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int x = 10;
        double y = 3.4;

        Sample.foo(x + 2,  y * 3); // int a = x + 2	double b = y * 3
    }
}


class Sample {
    public static void foo(int a, double b)
    {
        System.out.println(a);
        System.out.println(b);
    }
}