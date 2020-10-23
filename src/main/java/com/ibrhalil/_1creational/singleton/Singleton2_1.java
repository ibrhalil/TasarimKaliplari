package com.ibrhalil._1creational.singleton;

//static block kullanarak
//Nesne ilk oluşturulduğunda çalışacak ilk yer static bloklardır.
public class Singleton2_1
{
    private static Singleton2_1 singleton2_1;

    //static block sınıf ilk oluşturulduğunda çalışır
    static {
        singleton2_1 = new Singleton2_1();
    }

    private Singleton2_1 ()
    {

    }

    public static Singleton2_1 getSingleton2_1()
    {
        return singleton2_1;
    }
}
//dezavantaj -> sınıf hiç kullanılmazsa bile bellekte instance oluşturulmuş şekilde tutulur
