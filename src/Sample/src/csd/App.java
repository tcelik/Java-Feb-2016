/*----------------------------------------------------------------------------------------------------------------------
	Java da açılan kapanan küme parantezleri arasında kalan bölgeye blok denir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        { 	//Blok

        }

        {
            {
                //...
            }
        }
    }
}
/*----------------------------------------------------------------------------------------------------------------------
	Bir blok içerisinde bildirilen değişkenlere yerel değişkenler (local variables) denir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        int a;

        //...

        a = 10;
    }
}
