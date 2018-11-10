/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun onu çağıran metoda bittiği zaman ilettiği değere geri dönüş değeri denir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App1 {
    public static void main(String [] args)
    {
        int a = 10;
        int b = a * Sample1.foo();


    }
}


class Sample1 {
    public static int foo()
    {
        return 10;
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri varsa akışın her noktasında bir değer döndürüyor olması gerekir
----------------------------------------------------------------------------------------------------------------------*/


class App2 {
    public static void main(String [] args)
    {
        int a = 10;
        int b = a * Sample2.foo();

        System.out.println(b);

    }
}


class Sample2 {
    public static int foo()
    {
        int a = 10;

        //...

        return a * 2;
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Bir metodun geri dönüş değeri varsa akışın her noktasında bir değer döndürüyor olması gerekir
----------------------------------------------------------------------------------------------------------------------*/


class App3 {
    public static void main(String [] args)
    {
        int a = 10;
        int b = a * Sample3.foo();

        System.out.println(b);
    }
}


class Sample3 {
    public static int foo() //error
    {
        int a = 10;

        if (a > 0)
            return 20;

        //ya akış buraya gelirse ne dönücek diye düşünüyor a tamam 0 dan büyük onunla ilgilenmiyor.



    } //missing return statement hatası
}
