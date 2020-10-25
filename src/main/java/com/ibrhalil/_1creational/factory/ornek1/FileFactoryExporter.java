package com.ibrhalil._1creational.factory.ornek1;

public class FileFactoryExporter
{
    FileExporter exporter;
    String icerik;

    public enum FileType
    {
        PDF,
        EXCEL;
    }

    public FileFactoryExporter(FileType dosyaTip, String icerik)
    {
        this.icerik=icerik;
        switch(dosyaTip)
        {
            case PDF:
                exporter = new PDFExporter();
                return;

            case EXCEL:
                exporter = new ExcelEcporter();
                return;

            default:
                throw new UnsupportedOperationException();
        }
    }

    public String ciktiAl()
    {
        return exporter.dosyaCikti(icerik);
    }
}
