/*----------------------------------------------------------------------------------------------------------------------
	 Math sınıfının abs metotları (absolute method)
----------------------------------------------------------------------------------------------------------------------*/package csd;
class App {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("val1?");
        int val1 = Integer.parseInt(kb.nextLine());

        int result = Math.abs(val1);

        //System.out.printf("|%d| = %d%n", val1, result);

        String fmt = "|%d|=%d%n";
        System.out.printf(fmt, val1, result);
    }
}