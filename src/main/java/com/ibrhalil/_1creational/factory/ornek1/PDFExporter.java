package com.ibrhalil._1creational.factory.ornek1;

public class PDFExporter implements FileExporter
{

    public String dosyaCikti(String icerik)
    {
        return "PDF cıktısı "+icerik;
    }
}
