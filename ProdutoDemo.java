import java.util.Scanner;

public class ProdutoDemo 
{
    
    public static void main(String[] args) 
    {
        
        Produto produto[] = new Produto[5];
        LeitorTeclado leitor = new LeitorTeclado();
        
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < produto.length; i++)
        {
            String descricao;
            double preco;
            int saldo;
            
            System.out.println("Digite a descrição do produto:");
            descricao = entrada.nextLine();
            System.out.println("Digite o preço do produto:");
            preco = entrada.nextDouble();
            System.out.println("Digite o seu saldo:");
            saldo =  entrada.nextInt();
            
            produto[i] = new Produto(descricao, preco, saldo);
            
            produto[i].lerTeclado();
            
        }    
           
    }
                               
}
