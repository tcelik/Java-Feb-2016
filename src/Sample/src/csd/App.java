/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda %c char türü için kullanılır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        char ch = 65; //ch = 'A'; demek ile aynı, int char türüne atanabilir implicit olarak kendi yapar, char ch = (char) 65

        System.out.printf("ch=%c%n", ch); //%c karakterini ver demek
    }
}