/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden iki tane int türden sayı isteyen ve bu sayıların toplamını, farkını  ve çarpımını
	ekrana yazdıran programı yazınız
----------------------------------------------------------------------------------------------------------------------*/package csd;
class App {

    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("val1?");
        int val1 = Integer.parseInt(kb.nextLine());

        System.out.println("val2?");
        int val2 = Integer.parseInt(kb.nextLine());

        System.out.printf("%d + %d = %d%n", val1, val2, val1 + val2);
        System.out.printf("%d - %d = %d%n", val1, val2, val1 - val2);
        System.out.printf("%d * %d = %d%n", val1, val2, val1 * val2);
        System.out.printf("%d / %d = %d%n", val1, val2, val1 / val2);

        kb.close();
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyeden iki tane int türden sayı isteyen ve bu sayıların toplamını, farkını  ve çarpımını
	ekrana yazdıran programı yazınız
----------------------------------------------------------------------------------------------------------------------*/

class App1 {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        int val1 = Integer.parseInt(kb.nextLine());

        System.out.println("İkinci sayıyı giriniz");
        int val2 = Integer.parseInt(kb.nextLine());

        //result mantığı ta buradan başlıyor.

        int result = val1 + val2;

        System.out.println(result);

        result = val1 * val2;

        System.out.println(result);

        result = val1 - val2;

        System.out.println(result);


        kb.close();
    }
}


