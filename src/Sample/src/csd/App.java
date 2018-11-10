/*----------------------------------------------------------------------------------------------------------------------
	scope (faaliyet alanı): Bir ismin derleyici tarafından görülebildiği kod aralığı
----------------------------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------------------------
	Yerel değişkenlerin faaliyet alanı bildirildikleri yerden bildirildikleri bloğun sonuna kadar her yerdir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        Sample.foo();
    }
}

class Sample {
    public static void foo()
    {
        int a;


        a = 10;

        {
            System.out.println(a);
        }
    }

    public static void bar()
    {
        int a;

        a = 34;

        System.out.println(a);
    }
}

