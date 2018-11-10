/*----------------------------------------------------------------------------------------------------------------------
	Klavyeden int türden bir değer isteme kalıbı


	metotlara nasıl ulaşıyorduk
    paketismi.sınıfismi.metotismi

    sınıflara
    paketismi.sınıfismi ile ulaşacağız.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int val = Integer.parseInt(kb.nextLine());

        System.out.println(val * val);

        kb.close();


    }
}


class Sample {
    public static void foo()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Sayı?");

        //kb.nextLine() enter bekleyecek. tıklanınca girilen sayıyı dönecek.
        int val = Integer.parseInt(kb.nextLine());
        System.out.println(val * val);
        kb.close();
    }
}