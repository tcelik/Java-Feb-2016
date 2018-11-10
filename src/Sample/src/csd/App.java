/*----------------------------------------------------------------------------------------------------------------------
	Yukarıdaki işlem aşağıdaki gibi de yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int result = Sample.bar();

        Sample.foo(result);
    }
}


class Sample {
    public static void foo(int a)
    {
        System.out.println(a);
    }

    public static int bar()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int val = Integer.parseInt(kb.nextLine()); //enter bekliyor cpu

        return val * val;
    }
}

