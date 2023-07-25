import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
   private static Scanner scanner = new Scanner(System.in);
    private static List<Contato> listaContatos = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Menu();
    }

    public static void Menu() {
        System.out.println("==== Menu ====");
        System.out.println("1. Adicionar um contato");
        System.out.println("2. Remover um contato");
        System.out.println("3. Listar todos os contatos");
        System.out.println("0. Sair");

         
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                CreateContact();
                break;
            case 2:
                RemoveContact();
                break;
            case 3:
                ListContact();
                break;
            case 0:
                System.out.println("Saindo...");
                return;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
        System.out.println();
        Menu();
    }

    public static void CreateContact() {
        Contato novoContato = new Contato();
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        novoContato.setNome(scan.nextLine());

        System.out.print("Telefone: ");
        novoContato.setTelefone(scan.nextLine());
        
        System.out.print("Email: ");
        novoContato.setEmail(scan.nextLine());
       
        listaContatos.add(novoContato);
    }

    public static void RemoveContact() {
        System.out.print("Nome do contato a ser removido: ");
        Scanner scan = new Scanner(System.in);
        String nomeRemover = scan.nextLine();
        
        Contato contatoRemover = null;
        for (Contato c : listaContatos) {
            if (c.getNome().equalsIgnoreCase(nomeRemover)) {
                contatoRemover = c;
                break;
            }
        }
        if (contatoRemover != null) {
            listaContatos.remove(contatoRemover);
        } else {
            System.out.println("Contato não encontrado na lista.");
        }
    }

    public static void ListContact() {
        System.out.println("=== Lista de Contatos ===");
        for (Contato c : listaContatos) {
            System.out.println(c);
            System.out.println("--------------------");
        }
    }
}
