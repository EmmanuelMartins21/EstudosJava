public class App 
{
    public static void main(String[] args) throws Exception 
    {
        /*         
            Fonte desenvolvido usando JAVA está no meu GITHUB:


        */
        //Criação dos objetos de Pessoa
        Pessoa p1 = new Pessoa("Emmanuel", "O+", 1999);
        Pessoa p2 = new Pessoa("Manuelly", "O-", 2002);
        Pessoa p3 = new Pessoa("Jose", "AB+", 1965);
        Pessoa p4 = new Pessoa("Maria", "B-", 1972);

        // Criação de objetos de Exame
        Exame e1 = new Glicemia(p1, 95, 110);
        Exame e2 = new Triglicerideos(p1, 80, 80);
        Exame e3 = new Colesterol(p1, 180, 90, 50, 'M');

        Exame e4 = new Colesterol(p2, 180, 90, 50, 'M');
        Exame e5 = new Triglicerideos(p3, 120, 80);
        Exame e6 = new Glicemia(p4, 80, 80);

        //Criação do objeto Laboratorio e cadastro de exames
        Laboratorio lab = new Laboratorio();
        lab.cadastrarExame(e1);
        lab.mostrarResultado(e1);

        lab.cadastrarExame(e2);
        lab.mostrarResultado(e2);

        lab.cadastrarExame(e3);
        lab.mostrarResultado(e3);

        lab.cadastrarExame(e4);
        lab.mostrarResultado(e4);

        lab.cadastrarExame(e5);
        lab.mostrarResultado(e5);

        lab.cadastrarExame(e6);
        lab.mostrarResultado(e6);

        System.out.println("Muito obrigado por usarem o sistema de Saude M&M");
        System.out.println("Nos sigam na nossa rede social GITHUB: EmmanuelMartins21");
        System.out.println("https://github.com/EmmanuelMartins21");

    }
}
