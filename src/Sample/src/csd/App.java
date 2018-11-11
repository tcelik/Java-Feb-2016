/*----------------------------------------------------------------------------------------------------------------------
	 Math sınıfının abs metotları (absolute method)
----------------------------------------------------------------------------------------------------------------------*/package csd;
class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("val1?");
        double val1 = Double.parseDouble(kb.nextLine());

        double result = Math.sqrt(val1);

        System.out.printf("sqrt(%.2f) = %.2f%n", val1, result);

        String fmt = "sqrt(%.6f) = %.6f";
        System.out.printf(fmt, val1, result);
    }
}