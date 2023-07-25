package ae01_prog1;

import java.util.Scanner;

/**
 *
 * @author emmanuel_Martins
 */
public class Rota {
    private int qtdRotas = 0;
    private double kmTotal = 0.0;
    private final double consumoMedio = 2.5;
    private double vlrTotal = 0.0;
    private double qtdCombustivel = 0.0;

    public void planejarDia() {
        /*
         * Desenvolvido por Emmanuel Cosme Martins Bento.
         * A atividade se encontra hospedado no GitHub
         * GitHub: https://github.com/EmmanuelMartins21/EstudosJava/tree/master/AE01_Prog1
         */
        double vlrLitroDiesel;
        Scanner scn = new Scanner(System.in);

        System.out.print("Qual a quantidade de rotas do dia: ");
        qtdRotas = scn.nextInt();

        for (int r = 1; r <= qtdRotas; r++) {
            System.out.print("Qual a quantidade de km da rota " + r + ": ");
            kmTotal += scn.nextDouble();
        }        

        qtdCombustivel = kmTotal / consumoMedio;

        System.out.print("Qual o valor do litro do óleo diesel: ");
        vlrLitroDiesel = scn.nextDouble();

        vlrTotal = qtdCombustivel * vlrLitroDiesel;

        System.out.println("\nResultado:");
        System.out.println("Total de km a serem percorridos: " + kmTotal +"km");
        System.out.println("Quantidade de combustível necessário em litros: " + qtdCombustivel + " l");
        //Usando o printf para poder manipular a quantidade de casas decimais  apresentadas
        System.out.printf("Valor a ser desembolsado pela empresa: R$ %.2f %n", (vlrTotal));

        scn.close();
    }
}
