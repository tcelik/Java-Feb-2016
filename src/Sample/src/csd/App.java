
/*----------------------------------------------------------------------------------------------------------------------
	++ operatörünün prefix kullanımının ürettiği değer (işleme giren değer) artırılmış değerdir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int a = 10;

        int b = ++a;

        System.out.printf("b=%d%n", b);
        System.out.printf("a=%d%n", a);
    }
}
