/*----------------------------------------------------------------------------------------------------------------------
	Bir metoda argüman olarak bir  metodun geri dönüş değeri geçilebilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int x = 4;

        //önce hesaplanır.
        Sample.foo(Sample.bar(Sample.tar(x * x)));
    }
}


class Sample {
    //ekrana bas
    public static void foo(int a)
    {
        System.out.println(a);
    }

    //ver bana bir sayı, kullanıcdan aldığım değerle çarpim dönim.
    public static int bar(int a)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int val = Integer.parseInt(kb.nextLine());

        return val * a;
    }

    //ver bana bi sayı 2 ile çarpim
    public static int tar(int a)
    {
        return a * 2;
    }
}
