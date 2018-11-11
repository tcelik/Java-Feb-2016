/*----------------------------------------------------------------------------------------------------------------------
	 Sınıf Çalışması: Util sınıfı içerisinde bir üçgenin üç kenarını parametre olarak alıp alanını döndüren
	 getTriangleArea ve çevresini döndüren getTriangleCircumference metotlarını yazınız ve metotları
	 klavyeden girilen değerler ile çağırarak test ediniz.
	 Not: Kenarların üçgen koşullarını sağlayıp sağlamadığı test edilmeyecektir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("a? b? c?");
        double a = Double.parseDouble(kb.next());
        double b = Double.parseDouble(kb.next());
        double c = Double.parseDouble(kb.next());

        System.out.println(Util.getTriangleArea(a, b, c));

        kb.close();
    }
}

class Util {
    public static double getTriangleArea(double a, double b, double c)
    {
        //...
        double u = getTriangleCircumference(a, b, c) / 2;

        return Math.sqrt(u * (u - a) * (u - b) * (u - c));
    }

    public static double getTriangleCircumference(double a, double b, double c)
    {
        //...
        return a + b + c;
    }
}
