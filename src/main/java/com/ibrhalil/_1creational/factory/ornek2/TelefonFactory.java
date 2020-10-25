package com.ibrhalil._1creational.factory.ornek2;

public class TelefonFactory
{
    private TelefonFactory()
    {

    }

    public static Telefon telefonOlustur(String marka, String model)
    {
        Telefon telefon = null;
        if(marka.equalsIgnoreCase("apple"))
        {
            telefon = new Apple(marka, model);
        }
        else if(marka.equalsIgnoreCase("samsung"))
        {
            telefon = new Samsung(marka,model);
        }
        else if(marka.equalsIgnoreCase("lg"))
        {
            telefon = new LG(marka,model);
        }
        else
        {
            throw new UnsupportedOperationException(marka + " desteklenmiyor\n");
        }

        return telefon;
    }
}
