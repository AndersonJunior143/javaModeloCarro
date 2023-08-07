package com.mycompany.segurocarros;
import com.mycompany.segurocarros.Cliente;

public class Seguro 
{
    
    private float valor;
    private boolean vigencia;
    private Cliente proprietario;
    private Cliente[] assegurado;
 
    public Seguro(float valor, boolean vigencia, Cliente proprietario)
    {
        this.valor = valor;
        this.vigencia = vigencia;
        this.proprietario = proprietario;
    }
    
    
    
    
    public float getValor()
    {
        return valor;
    }
    
    public void setValor()
    {
        this.valor = valor;
    }
    
    public boolean getVigencia()
    {
        return vigencia;
    }
    
    public void setVigencia()
    {
        this.vigencia = vigencia;
    }   
        
}
