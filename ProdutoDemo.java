import java.util.Scanner;

public class ProdutoDemo 
{
    
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        //declaração
        
        LeitorTeclado vet = new LeitorTeclado(5);
        
        //declaração de variaveis da classe produto
        String descricao;
        double preco;
        int saldo;
        
        for(int i = 0; i < 5; i++)
        {
            
            //declaração de variavel temporaria
            Produto p;
            
            System.out.println("Digite a descrição do produto:");
            descricao = entrada.next();
            System.out.println("Digite o preço do produto:");
            preco = entrada.nextDouble();
            System.out.println("Digite o valor do saldo:");
            saldo = entrada.nextInt();   
            
            p = new Produto(descricao, preco, saldo);
            
            vet.adicionarProduto(p);
            
        }
        
        System.out.println(vet.mostrarProduto());
           
    }
    
                           
}

