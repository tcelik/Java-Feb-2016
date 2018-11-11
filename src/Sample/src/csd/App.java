/*----------------------------------------------------------------------------------------------------------------------
	 Math sınıfının yuvarlama yapan metotları
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        double val = Double.parseDouble(kb.nextLine());

        System.out.printf("round(%.2f)=%d%n", val, Math.round(val)); //10.5 ve büyükler : 11 e, 10.5'dan küçükler 10'a
        System.out.printf("rint(%.2f)=%f%n", val, Math.rint(val));//10.5 : 10.00 diğerli raund
        System.out.printf("ceil(%.2f)=%f%n", val, Math.ceil(val)); //yukarıya  10.9 : 11'a
        System.out.printf("floor(%.2f)=%f%n", val, Math.floor(val)); //aşağıda 10.9 : 10'a

        kb.close();
    }
}
