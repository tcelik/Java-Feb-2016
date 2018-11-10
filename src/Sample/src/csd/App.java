/*----------------------------------------------------------------------------------------------------------------------
    Metot bildiriminin genel biçimi:

    [erişim belirleyici] [static] <geri dönüş türü> <isim> ([parametreler])
    {
        //...
    }

    Erişim belirleyici şunlar olabilir: public, private, protected, no modifier(hiç bir şey yazmama durumu)
----------------------------------------------------------------------------------------------------------------------*/
package csd;

//public erişim belirleyici
public class App {
    public static void main(String[] args)
    {
        System.out.println("Merhaba Java");
    }
}

//no-modifier erişim belirleci
class Sample {

    //public bir metot bildirimi
    public static void foo()
    {
        //...
        System.out.println("foo");
    }


    public static void bar()
    {
        //...
        System.out.println("bar");
    }
}