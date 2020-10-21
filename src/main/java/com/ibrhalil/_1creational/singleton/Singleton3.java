package com.ibrhalil._1creational.singleton;

public class Singleton3
{
    //Singleton2 de bahsettiğimiz dezavantaj çözmek için nesneyi metod içerisinde oluştururuz
    //private static Singleton3 singleton3 = new Singleton3();
    private static Singleton3 singleton3 = null;

    private Singleton3()
    {
        //java bizim yerimize yapıcı oluşturmasın !!
    }

    //büyük bir problem var !!!
    //threadler ile çalıştığımızda nesne bir kaç kez oluşturulabilme ihtimali var!!!
    public static Singleton3 getSingleton3()
    {
        if(singleton3==null)
        {
            singleton3 = new Singleton3();
        }

        return singleton3;
    }

    //threadlerler çalışma sorununu çözdük ama ciddi bir şekilde programımız YAVAŞ çalışacaktır.
    public static Singleton3 getSingleton3Kontrollu()
    {
        synchronized(Singleton3.class)
        {
            if(singleton3==null)
            {
                singleton3 = new Singleton3();
            }
        }

        return singleton3;
    }

    //threadler çalışma kontrolleri nesne boş iken kontrol edersek sadece yavaşlık problemini çözmüş oluruz.
    public static Singleton3 getSingleton3KontrolluHizli()
    {
        if(singleton3 == null)
        {
            synchronized(Singleton3.class)
            {
                if(singleton3==null)
                {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }

}
