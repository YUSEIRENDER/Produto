import java.util.Scanner;

class LeitorTeclado
{
    Produto[] vetProduto;
    int pos;
    String f;

    Scanner entrada = new Scanner(System.in);
    
    public LeitorTeclado(int tam)
    {
        
        vetProduto = new Produto[tam];
        pos = 0;
    }        
    
    public void adicionarProduto(Produto p)
    {   
        
        vetProduto[pos] = p;
        pos += 1;
    }
    
    public String mostrarProduto()
    {
        String str = "";
        
        f = "f";
        
        while(!f.equals("fim"))
        {
            
            System.out.println("Digite a descrição do seu produto:");
            f = entrada.nextLine();
            
            for(int i = 0; i < pos; i++)
            {
                
                str += vetProduto[i].toString();
                
            }    
            
        }
        
        return str;
        
    }        
}
