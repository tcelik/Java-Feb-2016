/*----------------------------------------------------------------------------------------------------------------------
	printf metodu ile ekrana formatlı yazdırma yapılabilir. Formatlı yazdırma için yer tutucu (placeholder)
	veya format karakteri denilen özel karakterler % karakteri ile kullanılır.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Hava bugün kaç derece");
        int degree = Integer.parseInt(kb.nextLine());

        System.out.printf("Bugün hava %d derece", degree);
    }
}