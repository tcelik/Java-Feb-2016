/*----------------------------------------------------------------------------------------------------------------------
	printf ile % karakteri %% ile yazdırılabilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Havadaki nem oranını giriniz");
        int ratio = Integer.parseInt(kb.nextLine()); //3 girdi, sen %3 demek istiyorsun

        System.out.printf("Havada %%%d nem var%n", ratio);  //                 %%(tek yüzde için) - %d (3 için)

    }
}
