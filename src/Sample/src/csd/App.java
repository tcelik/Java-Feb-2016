/*----------------------------------------------------------------------------------------------------------------------
	Geri dönüş değeri olmayan metotlar
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        Sample.add();
    }
}


class Sample {
    public static void add()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        int val1 = Integer.parseInt(kb.nextLine());

        System.out.println("İkinci sayıyı giriniz");
        int val2 = Integer.parseInt(kb.nextLine());

        int result = val1 + val2;

        System.out.println(result);
    }
}
