
/*----------------------------------------------------------------------------------------------------------------------
	İki tırnak içerisinde ters bölüden sonra escape sequence karakter gelmelidir.
	Aşağıdaki örnekte \\192.168.2.101\testdb.db yazısı ekrana çıkmaktadır
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        System.out.println("\\\\192.168.2.101\\testdb.db");
    }
}