/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değeri olmayan metotlarda return tek başına metodu sonlandırmak için kullanılabilir.
	Bu bir zorunluluk değildir
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
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int val = Integer.parseInt(kb.nextLine());

        if (val < 0) {
            System.out.println("Geçersiz değer");
            return; //Metot sonlanır
        }

        System.out.println(val);
    }
}