/*----------------------------------------------------------------------------------------------------------------------
	12.04.2018
	Aşağıdaki örnekte klavyeden girilen b sayısı için sıfır değeri exception oluşmasına yol açar
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

        System.out.println(a / b);
        System.out.println("akış buraya gelmez");

        kb.close();
    }
}
