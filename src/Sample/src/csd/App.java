/*----------------------------------------------------------------------------------------------------------------------
	Java da aynı faaliyet alanı içerisinde aynı isimde birden fazla değişken bildirimi yapılamaz
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


        //...
        double a;



    }
    //...
}

/*----------------------------------------------------------------------------------------------------------------------
	Java da kapsayan blokta bildirilmiş bir değişken ismi kapsanan bloklarda yeni bir değişken
	bildirimi olarak kullanılamaz
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


        //...
        {
            double a; //error

            //...
        }



    }
    //...
}

/*----------------------------------------------------------------------------------------------------------------------
	Ayrık bloklar içerisinde aynı isimde yerel değişkenler olabilir
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

        {
            int a;

        }


        //...
        {
            int a;

            //...
        }



    }
    //...
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki bildirimler geçerlidir. İç bloğun içerisindeki değişkenin faaliyet alanı bittikten sonra
	aynı isimde diğer değişken bildirilmiştir
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

        //...
        {
            int a = 34;

            //...

            System.out.println(a);
        }


        int a = 67;

        System.out.println(a);

    }
    //...
}
