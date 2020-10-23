package com.ibrhalil._1creational.singleton.test;

import com.ibrhalil._1creational.singleton.*;

public class TestMain
{
    public static void main(String[] args)
    {
        //1. nesne oluşturuldu
        Singleton1 a = new Singleton1();
        System.out.println(a);

        //2. nesne oluşturuldu
        Singleton1 b = new Singleton1();
        System.out.println(b);

       kontrolMek(a,b);

        /*************************************************************/

        //Singleton2 singleton2 = new Singleton2();     //Hata verir

        //1. nesne oluşturuldu
        Singleton2 aa = Singleton2.getSingleton2();
        System.out.println(aa);

        //2. nesne oluşturuldu
        Singleton2 bb = Singleton2.getSingleton2();
        System.out.println(bb);

        kontrolMek(aa,bb);

        /*************************************************************/

        /*
        //1. nesne oluşturuldu
        Singleton3 aaa = Singleton3.getSingleton3();
        System.out.println(aaa);

        //2. nesne oluşturuldu
        Singleton3 bbb = Singleton3.getSingleton3();
        System.out.println(bbb);

        kontrolMek(aaa,bbb);


        //3. nesne oluşturuldu
        Singleton3 aaa1 = Singleton3.getSingleton3Kontrollu();
        System.out.println(aaa1);

        //4. nesne oluşturuldu
        Singleton3 bbb1 = Singleton3.getSingleton3Kontrollu();
        System.out.println(bbb1);

        kontrolMek(aaa1,bbb1);
        */

        //5. nesne oluşturuldu
        Singleton3 aaa2 = Singleton3.getSingleton3KontrolluHizli();
        System.out.println(aaa2);

        //6. nesne oluşturuldu
        Singleton3 bbb2 = Singleton3.getSingleton3KontrolluHizli();
        System.out.println(bbb2);

        kontrolMek(aaa2,bbb2);

        /*************************************************************/

        //1. nesne oluşturuldu
        Singleton2_1 aaaa = Singleton2_1.getSingleton2_1();
        System.out.println(aaaa);

        //2. nesne oluşturuldu
        Singleton2_1 bbbb = Singleton2_1.getSingleton2_1();
        System.out.println(bbbb);

        kontrolMek(aaaa,bbbb);

        /*************************************************************/

        //1. nesne oluşturuldu
        Singleton4 aaaaa = Singleton4.getSingleton4();
        System.out.println(aaaaa);

        //2. nesne oluşturuldu
        Singleton4 bbbbb = Singleton4.getSingleton4();
        System.out.println(bbbbb);

        kontrolMek(aaaaa,bbbbb);

    }

    static void kontrolMek(Object obj1, Object obj2)
    {
        if(obj1==obj2)
        {
            System.out.println("aynı nesneler...");
        }
        else
        {
            System.out.println("farklı nesneler...");
        }
    }
}
