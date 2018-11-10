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
    public static void foo()
    {
        System.out.println("sample.foo");

        csd.Mample.bar();
        //is equivalent, paket ismi gerek olmadı çağıran foo() ile çağrılan bar() aynı paketteler ama farklı sınıftalar.
        Mample.bar();
    }
}


class Mample {
    public static void bar()
    {
        System.out.println("Mample.bar");
    }
}