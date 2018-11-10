/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki add metodu klavyeden istediği iki tane sayının toplam değerini geri döndürmektedir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int total = Sample.add();

        System.out.println(total);
    }
}


class Sample {
    //henüz parametre öğrenmedik, kalıbı kullanalım, result gine.
    public static int add()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        int val1 = Integer.parseInt(kb.nextLine());

        System.out.println("İkinci sayıyı giriniz");
        int val2 = Integer.parseInt(kb.nextLine());

        int result = val1 + val2;

        return result;
    }
}
