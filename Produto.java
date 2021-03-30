public class Produto
{
    
    public String descricao;
    public double preco;
    public int saldo;
    
    public Produto()
    {
        
        
        
    }
    
    Produto(String descricao,double preco,int saldo)
    {
        
        this.descricao = descricao;
        this.preco =  preco;
        this.saldo = saldo;
        
    }
    
    public String getDescricao()
    {
        
        return descricao;
        
    }        
    
    public void setDescricao(String descricao)
    {
        
        this.descricao = descricao;
        
    }
    
    public double getPreco()
    {
        
        return preco;
        
    }
    
    public void setPreco(double preco)
    {
        
        this.preco =  preco;
        
    }
    
    public int getSaldo()
    {
        
        return saldo;
        
    }
    
    public void setSaldo(int saldo)
    {
        
        this.saldo = saldo;
        
    }
    
    public String toString()
    {
        
        String str = "A";
        
        str += "|Descricao: "+descricao+ "|";
        str += "|Preco: "+Double.toString(preco)+ "|";
        str +="|Saldo: "+Integer.toString(saldo)+ "|";
        return str;
        
    }        
}
