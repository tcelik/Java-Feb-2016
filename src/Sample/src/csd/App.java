/*----------------------------------------------------------------------------------------------------------------------
    Sınıf bildirdik.
    Metot bildirdik
    Metodlarımızı nasıl çağırıyoruz.

    [paket ismi].[sınıf ismi].<metot ismi>([argümanlar])

    Metotları paket isminden başlarak çağırıyoruz aslında.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

//public erişim belirleyici
public class App {
    public static void main(String[] args)
    {
        System.out.println("Merhaba Java");

        //Aşağıda yazılan foo'yu çağırmak istiyorum neydi genel biçim
        csd.Sample.foo();
        csd.Sample.bar();

    }
}


class Sample {


    public static void foo()
    {

        System.out.println("foo");
    }


    public static void bar()
    {

        System.out.println("bar");
    }
}