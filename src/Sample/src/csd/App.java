

/*----------------------------------------------------------------------------------------------------------------------
	Bitsel and ve bitsel or operatörleri boolean türü ile kullanıldıklarında kısa devre özelliği olmayan
	and ve or operatörleridir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        boolean result = Sample.bar() & Sample.foo() | Sample.tar();

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

    public static boolean tar()
    {
        System.out.println("tar");

        return true;
    }
}