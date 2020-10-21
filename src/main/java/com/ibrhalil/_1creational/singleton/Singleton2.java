package com.ibrhalil._1creational.singleton;

//dezavantaj bulunmakta -> nesne hiç kullanılmazsa bile bellekte bir tane instancesı oluşturulmakta....
public class Singleton2
{
    private static Singleton2 singleton2 = new Singleton2();
    //kendi sınıfımız içerisinden nesnemizi oluşturabiliriz.
    //static olmalı

    private Singleton2()
    {
        //dışarıdan nesne oluşturulmasını engelledik
    }

    //sınıfa ait bir metot olmalı ki nesnesini oluşturamadığımız sınıfın metodunu kullanabilelim.
    public static Singleton2 getSingleton2()
    {
        return singleton2;
    }
}
