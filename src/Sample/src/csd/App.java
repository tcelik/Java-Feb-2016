
/*----------------------------------------------------------------------------------------------------------------------
	Bir değişkene bildirimi noktasında atanan değere ilkdeğer verme (initilization) denir.
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
    public static void main(String [] args)
    {
        csd.Sample.foo();
    }
}

class Sample {
    public static void foo()
    {
        int a = 45; //initialization (ilk değer verme)


        a = 34; //atama


        a = a * 2;


        System.out.println(a);
    }
    //...
}
