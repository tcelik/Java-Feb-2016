
/*----------------------------------------------------------------------------------------------------------------------
	Mantıksal not operatörü flag değişkenlerin içeriğinin değişiminde kullanılabilir
----------------------------------------------------------------------------------------------------------------------*/
package csd;

import java.util.ArrayList;

class App {

    public static void main(String[] args)
    {
        int i = 1;
        int a [] = new int[10];
        a[i] = 1;


        Fighter f1 = new Fighter();
        f1.setAbilities(100, 200, 300, 400);
        System.out.println(f1.sum());
        System.out.println(f1.average());
        System.out.println(f1.max());
        f1.setStrenght(200);
        System.out.println(f1.sum());


    }
}


class Fighter {
    /*
        strenght : 0
        agility : 1
        speed : 2
        intelligence : 3 indexte
    */
    public final int STRENGHT = 0;
    public final int AGILITY = 1;
    public final int SPEED = 2;
    public final int INTELLIGENCE= 3;



    enum Özellikler {
        STRENGHT, AGILITY, SPEED, INTELLİGENCE;
    }
    //private int m_strenght, m_agility, m_speed, m_intelligence;

    private int [] m_array = new int[Özellikler.values().length];

    public Fighter()
    {

    }

    public void setStrenght(int s)
    {
        m_array[0] = s;
        m_array[STRENGHT] = s;
        m_array[Özellikler.STRENGHT.ordinal()] = s;
    }
    public void setINTELLIGENCE(int i)
    {
        m_array[INTELLIGENCE] = i;

        m_array[Özellikler.STRENGHT.ordinal()] = i;
    }

    public void setAbilities(int strenght, int agility ,int speed, int intelligence)
    {
        m_array[Özellikler.STRENGHT.ordinal()] = strenght;
        m_array[Özellikler.AGILITY.ordinal()] = agility;
        m_array[Özellikler.SPEED.ordinal()] = speed;
        m_array[Özellikler.INTELLİGENCE.ordinal()] = intelligence;

    }

    public int sum()
    {
        int result = 0;

        for (int val : m_array)
            result += val;

        return result;
    }

    public double average()
    {
        return sum() / (double) Özellikler.values().length;
    }

    public String max()
    {
        int max = m_array[0];
        int position = 0;

        for (int i = 1; i < m_array.length; ++i)
            if (m_array[i] >  max) {
                max = m_array[i];
                position = i;
            }

            String name = "";

            switch (position){
                case 0: name = "strenght"; break;
                case 1: name = "agility"; break;
                case 2: name = "speed"; break;
                case 3: name = "intelligence"; break;
            }

        return String.format("%s:%d", name, max);
    }
}
