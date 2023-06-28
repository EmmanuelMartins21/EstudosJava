import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.SourceLocator;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrimeiraClass 
{
    public static void main (String [] args) throws Exception
    {
        final String NOME_COMPLETO = "Emmanuel Cosme Martins Bento ";
        int idade = 23;
        int opcao;
        System.out.println("Seja bem-vindo novamento ao Java, \n" + 
        NOME_COMPLETO);

        System.out.println("Digite a opcao desejada");
        Scanner leitor = new Scanner(System.in);
        opcao = leitor.nextInt();

        switch(opcao)
        {
            case 1:
                System.out.println("Digite 2 numeros");
                int n1 = leitor.nextInt();
                int n2 = leitor.nextInt();
                AddTwoNumbers(n1, n2);
                break;
            default:
                System.out.println("Opcao Invalida");
        }

    }
    public static void AddTwoNumbers(int valor1, int valor2)
    {
       System.out.println("A somas dos dois numeros eh: " + valor1 + valor2);
    }
    public static int SubtraiDoisInteiros(int valor1, int valor2)
    {
        return valor1 - valor2;
    }
    public static int MultiplicaDoisInteiros(int valor1, int valor2)
    {
        return valor1 * valor2;
    }
    public static int DivideDoisInteiros(int valor1, int valor2)
    {
        return valor1 / valor2;
    }
    
}
