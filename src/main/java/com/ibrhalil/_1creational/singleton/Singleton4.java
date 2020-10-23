package com.ibrhalil._1creational.singleton;

//iç içe sınıf kullanarak ana sınıfın nesnesini oluşturuyoruz
//ana sınıf oluşturmada nesneyi alt sınıflar vermesi
public class Singleton4
{
    private Singleton4()
    {

    }

    public static Singleton4 getSingleton4()
    {
        return InstanceCreateInnerClass.InstanceSingleton4;
    }

    public static class InstanceCreateInnerClass
    {
        private static Singleton4 InstanceSingleton4 = new Singleton4();
    }
}
//tread safe değildir !!
