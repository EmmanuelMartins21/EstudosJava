public class Laboratorio 
{
    public void cadastrarExame(Exame exame) 
    {
        System.out.println("Exame cadastrado para: " + exame.getPaciente().getNome());
    }

    public void mostrarResultado(Exame exame) 
    {
        System.out.println("Resultados do exame do paciente: " + exame.getPaciente().getNome());
        System.out.println("Valor do exame: " + exame.getValorExame());
        System.out.println("Resultado: " + exame.informarResultado());
    }
}
