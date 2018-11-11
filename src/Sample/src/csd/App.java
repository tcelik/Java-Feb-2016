/*----------------------------------------------------------------------------------------------------------------------
	 Sınıf Çalışması: Parametresi ile aldığı (x1, y1) ve (x2, y2) nokatalarına ilişkin iki nokta arasındaki
	 uzaklığı döndüren distance isimli metodu yazınız ve kalvyeden alınan değerler ile çağırarak
	 test ediniz. Distance metodunu Util isimli bir sınıf içerisinde yazınız
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("x1?");
        double x1 = Double.parseDouble(kb.nextLine());

        System.out.print("y1?");
        double y1 = Double.parseDouble(kb.nextLine());

        System.out.print("x2?");
        double x2 = Double.parseDouble(kb.nextLine());

        System.out.print("y2?");
        double y2 = Double.parseDouble(kb.nextLine());

        double dist = Util.distance(x1, y1, x2, y2);

        System.out.printf("dist[(%.2f, %.2f), (%.2f, %.2f)] = %.3f%n", x1, y1, x2, y2, dist);
        kb.close();

    }
}

class Util {
    //sqrt öğrenmiştik.
    public static double distance(double x1, double y1, double x2, double y2)
    {
        //return Math.sqrt(Math.abs(x2 - x1) * Math.abs(x2 - x1) + Math.abs(y2 - y1) * Math.abs(y2 - y1));
        return Math.sqrt((x2 - x1) * (x2 - x2) + (y2 - y1) * (y2 - y1));
    }
}