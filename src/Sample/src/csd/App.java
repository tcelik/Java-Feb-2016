/*----------------------------------------------------------------------------------------------------------------------
	Metot çağrılırken parametrelere aktarılan değerlere argüman denir. Metot kaç parametreli ise
	o kadar sayıda argümanla çağrılmalıdır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int x = 10;
        double y = 3.4;

        Sample.foo(x,  y);
    }
}


class Sample {
    public static void foo(int a, double b)
    {
        System.out.println(a);
        System.out.println(b);
    }
}