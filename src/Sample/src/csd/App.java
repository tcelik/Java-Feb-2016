/*----------------------------------------------------------------------------------------------------------------------
	++ ve -- operatörlerinin karışık kullanımları
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int a = 10;
        int b = a++ + --a;

        System.out.printf("a=%d%n", a); // a=10
        System.out.printf("b=%d%n", b); // b=20
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	++ ve -- operatörlerinin karışık kullanımları
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int a = 10;
        int b = a++ + --a + a++;

        System.out.printf("a=%d%n", a); // a=11
        System.out.printf("b=%d%n", b); // b=30
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	++ ve -- operatörlerinin karışık kullanımları
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int a = 10;
        int b = a++ + --a + ++a;

        System.out.printf("a=%d%n", a); // a=11
        System.out.printf("b=%d%n", b); // b=31
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte derleyici anlamlı en uzun atomu alarak işlem yaptığı için ayırma
	a++ + b
	biçimindedir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        int c = a+++b; //a++ + b

        System.out.printf("a=%d%n", a); // a=11
        System.out.printf("b=%d%n", b); // b=20
        System.out.printf("c=%d%n", c); // b=30
    }
}