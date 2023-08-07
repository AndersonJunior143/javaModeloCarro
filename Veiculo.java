package com.mycompany.segurocarros;
import com.mycompany.segurocarros.Modelo;

public class Veiculo 
{
    private int ano;
    private String marca;
    private String cor;
    private String placa;
    private Modelo modelo;
    
    public Veiculo(int ano, String marca, String cor, String placa, Modelo modelo)
    {
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
    }
    
    public int getAno()
    {
        return ano;
    }
    
    public void setAno()
    {
        this.ano = ano;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public void setMarca()
    {
        this.marca = marca;
    }
    public String getCor()
    {
        return cor;
    }
    
    public void setCor()
    {
        this.cor = cor;
    }
    
    public String getPlaca()
    {
        return placa;
    }
    
    public void setPlaca()
    {
        this.placa = placa;
    }
    
    
    
    
    
}

