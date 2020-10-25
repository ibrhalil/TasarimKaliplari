package com.ibrhalil._1creational.factory.ornek1;

public class ExcelEcporter implements FileExporter
{

    public String dosyaCikti(String icerik)
    {
        return "Excel cıktısı "+icerik;
    }
}
