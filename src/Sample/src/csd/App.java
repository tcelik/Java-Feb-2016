/*----------------------------------------------------------------------------------------------------------------------
   Çağıran metodun(foo), ait olduğu sınıf(Sample) ile çağrılan(bar) aynı sınıfta ise çağırma sırasında paket ismş
   yazılmayabilir size kalmış. Hatta sınıf ismi bile yazmasan olur aynı sınıftlar.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

//public erişim belirleyici
public class App {
    public static void main(String[] args)
    {

    }
}


class Sample {


    public static void foo() //metot bildirimi
    {

        System.out.println("foo");

        //burada aşağıdaki bar çağıralım neydi sentax paketismi.sınıf ismi...
        csd.Sample.bar();

        bar(); //diyerek de çağırabilirim is equal csd.Sample.bar()
    }


    public static void bar()
    {

        System.out.println("bar");
    }
}