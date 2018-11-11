/*----------------------------------------------------------------------------------------------------------------------
	Mantıksal operatörlerin kısa devre (short circuit) davranışı
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        boolean result = Sample.foo() || Sample.bar();

        System.out.printf("result=%b%n", result);
    }
}

class Sample {
    public static boolean foo()
    {
        System.out.println("foo");

        return true;
    }

    public static boolean bar()
    {
        System.out.println("bar");

        return false;
    }
}
