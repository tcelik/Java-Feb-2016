/*----------------------------------------------------------------------------------------------------------------------
	03.04.2018
	Değişken isimleri rakam karakterleri ile başlayamaz
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int 1number; //error
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Değişken isimleri başlayabileceği herhangi bir karakter ile başlayıp istediği kadar rakam karakteri
	içerebilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int a1234;

        a1234 = 23;

        System.out.println(a1234);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Değişken isimleri alttire (underscore) karakterini içerebilir hatta başlatılabilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int _1234;

        _1234 = 23;

        System.out.println(_1234);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Değişken isimleri boşluk karakteri (whitespace) içeremez
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int number of students; //error


    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Alttire nin tek başına değişken ismi olması Java 9 ile birlikte geçersizdir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int _ = 10; //error: Since Java 9

        System.out.println(_);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	$ karakteri değişken isimlendirmede kullanılabilir. Fakat programcılar
	tarafından tercih edilmez
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int numberOf$s = 10;

        System.out.println(numberOf$s);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Değişken isimleri UNICODE karakterler içerebilir. Yani Türkçe karakterler
	değişken isimlendirmede kullanılabilmektedir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int sayı = 10;

        System.out.println(sayı);
    }
}