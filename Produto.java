public class Produto
{
    
    //declaração de variaveis
    public String descricao;
    public double preco;
    public int saldo;
    
    Produto(String descricao, double preco, int saldo)
    {
        this.descricao = descricao;
        this.preco = preco;
        this.saldo = saldo; 
    }        

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    void lerTeclado()
    {

        System.out.println("|Preço do produto: " + preco+ "|Saldo do produto: " + saldo);        
        
    }        
}
