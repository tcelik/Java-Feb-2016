/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte gerçek sayılarla işlem yapıldığından b nin sıfır olması durumunda da işlem geçerlidir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        double a = Double.parseDouble(kb.nextLine());

        System.out.println("İkinci sayıyı giriniz");
        double b = Double.parseDouble(kb.nextLine());

        System.out.println(a / b);

        kb.close();
    }
}
