package com.ibrhalil._1creational.factory.test;

import com.ibrhalil._1creational.factory.ornek1.FileFactoryExporter;
import com.ibrhalil._1creational.factory.ornek2.Telefon;
import com.ibrhalil._1creational.factory.ornek2.TelefonFactory;

public class TestMain
{
    public static void main(String[] args)
    {
        //örnek1
        FileFactoryExporter fabrika1 = new FileFactoryExporter(FileFactoryExporter.FileType.PDF,"merhaba dünya");
        System.out.println(fabrika1.ciktiAl());

        FileFactoryExporter fabrika2 = new FileFactoryExporter(FileFactoryExporter.FileType.EXCEL,"merhaba dünya");
        System.out.println(fabrika2.ciktiAl());

        /**************************************************/

        //örnek2
        Telefon telefon1 = TelefonFactory.telefonOlustur("Samsung","note 8");
        System.out.println(telefon1);

        Telefon telefon2 = TelefonFactory.telefonOlustur("apple","iphone 7");
        System.out.println(telefon2);

        Telefon telefon3 = TelefonFactory.telefonOlustur("lg","g5 ");
        System.out.println(telefon3);

        Telefon telefon4 = TelefonFactory.telefonOlustur("nokia","3310 ");  //hata verir
        System.out.println(telefon4);
    }
}
