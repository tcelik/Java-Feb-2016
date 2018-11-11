/*----------------------------------------------------------------------------------------------------------------------
	Aritmetik dört işlem operatörleri
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        int a = Integer.parseInt(kb.nextLine());

        System.out.println("İkinci sayıyı giriniz");
        int b = Integer.parseInt(kb.nextLine());

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d %% %d = %d%n", a, b, a % b);
    }
}
