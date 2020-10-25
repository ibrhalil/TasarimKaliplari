package com.ibrhalil._1creational.factory.ornek2;

public class LG implements Telefon
{
    private String marka;
    private String model;

    public LG(String marka, String model)
    {
        this.marka = marka;
        this.model = model;
    }

    public String getMarka()
    {
        return marka;
    }

    public void setMarka(String marka)
    {
        this.marka = marka;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    @Override public String toString()
    {
        return "LG{" + "marka='" + marka + '\'' + ", model='" + model + '\'' + '}';
    }
}
