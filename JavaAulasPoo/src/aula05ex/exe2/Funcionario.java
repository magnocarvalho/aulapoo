/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05ex.exe2;

/**
 *
 * @author magno
 */
public class Funcionario extends Pessoa{
    
    private double base;
    private String empresa;
    private int vendas;
    
    public Funcionario(String nome, Data data, String cpf, double base, int vendas, String empresa) 
    {
        super(nome, data, cpf);
        this.base = base;
        this.empresa = empresa;
        this.vendas = vendas;
    }
        
    public double salarioFinal()
    {
        double retorno = 0;
        
        
        
        return retorno;
    }
    

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the vendas
     */
    public int getVendas() {
        return vendas;
    }

    /**
     * @param vendas the vendas to set
     */
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    
    
    
    
}
