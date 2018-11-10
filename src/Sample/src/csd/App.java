/*----------------------------------------------------------------------------------------------------------------------
	printf metodunda gerçek sayılar ekrana yazdırılırken % ve f arasına konulan nokta ve bu noktadan sonra
	yazılacak sayı ekrana basılırken noktadan sonraki basamak sayısını temsil eder. Sayı yuvarlanarak
	ekrana basılır. Yuvarlama bilimsel yuvarlamadır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        double val = 3.456234;

        System.out.printf("val=%.3f%n", val);

        System.out.printf("val=%.4f", val);
    }
}