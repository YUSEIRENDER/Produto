import java.util.Scanner;

class LeitorTeclado
{
    public static void main(String[] args) 
    {

        String f;
        f = "";
        double preco;
        int saldo;
        
        Produto produto[] = new Produto[5];
        
        Scanner entrada = new Scanner(System.in);
        
        while(!f.equals("fim"))
        {
            
            System.out.println("Digite a descrição do seu produto:");
            f = entrada.nextLine();
            
            System.out.println("Digite o preco do produto");
            preco = entrada.nextDouble();
            System.out.println("Digite o seu saldo");
            saldo = entrada.nextInt();
            
            for(Produto p: produto)
            {
                if(preco //empaquei :/)
                {
                    
                    
                    
                }    
                                   
                
            }    
            
        }    

    }
    
}
