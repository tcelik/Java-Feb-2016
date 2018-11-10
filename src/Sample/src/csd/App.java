/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Operation isimli sınıf içerisinde paremetresi ile aldığı iki tane int türden sayıyı toplayan
	add, çarpan mul ve çıkartan sub isimli metotları yazınız. Bu metotları klavyeden istene iki sayı için
	çağırarak formatlı biçimde ekrana yazdıran programı yazınız.
	Örnek girişler 10 ve 20 ise çıktı:

	10 + 20 = 30
	10 * 20 = 200
	10 - 20 = -10

	biçiminde olacaktır
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

        System.out.printf("%d + %d = %d%n", a, b, Operation.add(a, b));
        System.out.printf("%d * %d = %d%n", a, b, Operation.mul(a, b));
        System.out.printf("%d - %d = %d%n", a, b, Operation.sub(a, b));

        kb.close();
    }
}


class Operation {
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int mul(int a, int b)
    {
        return a * b;
    }

    public static int sub(int a, int b)
    {
        return a - b;
    }
}