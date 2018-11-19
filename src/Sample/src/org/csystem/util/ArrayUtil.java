package org.csystem.util;

public class ArrayUtil {

    //Swap : Dizinin 2 elemanını değiştiriyor
    private static void swap(int [] a, int val1, int val2)
    {
        int temp = a[val1];
        a[val1] = a[val2];
        a[val2] = temp;
    }

    //Get my array
    public static int [] getMyArray()
    {
        return new int[]{4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    }

    //Display array
    public static int [] displayArray(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");

        return a; //kendisini dönüyorum.
    }

    //Diziyi tersten ekrana yazdırıyorum.
    public static int [] displayArrayReverse(int [] a)
    {
        for (int i = a.length - 1; i >= 0; --i)
            System.out.print(a[i] + " ");

        return a; //kendisini dönüyorum.
    }

    //Diziyi ters çeviriyorum.
    public static int [] reverseArray(int [] a)
    {
        for (int i = 0; i < a.length / 2; ++i) {
            swap(a, i, a.length - 1 - i);
        }

        return a; //fluent kalıbı
    }

    //Dizideki çiftleri ekrana yazmak
    public static int [] displayEven(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            if (a[i] % 2 == 0)
                System.out.print(a[i] + " ");

        return a;
    }

    //Dizideki çiftleri ekrana yazmak
    public static int [] displayOdd(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            if (!(a[i] % 2 == 0))
                System.out.print(a[i] + " ");

        return a;
    }

    //Dizide çiftleri öne tekleri arkaya yazalım
    public static int [] displayEvenOdd(int [] a)
    {
        displayEven(a);
        displayOdd(a);

        return a;
    }

    //çiftleri önde tekleri arkada
    public static int [] evenOdd(int [] a)
    {
        int index = 0;
        for (int val : a)
            if (val % 2 == 0)
                a[index++] = val;

        for (int val : a)
            if (!( val % 2 == 0))
                a[index++] = val;

        return a;
    }





}
