/*----------------------------------------------------------------------------------------------------------------------
        Mantıksal operatörler klasik öncelik kurallarına uymazlar. Aşağıdaki ifadede önce sol taraftaki operand
        çalıştırılır. Mantıksal operatörler doğru sonuca yani önceliğe uyulursa elde edilecek sonuca
        en kısa yoldan ulaşırlar
        ----------------------------------------------------------------------------------------------------------------------*/
        package csd;

class App {
    public static void main(String [] args)
    {
        boolean result = Sample.foo() || Sample.bar() && Sample.tar();

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