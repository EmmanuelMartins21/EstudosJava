public abstract class Exame 
{
    private Pessoa paciente;
    private double vlrExame;

    public Exame(Pessoa paciente, double valorExame) 
    {
        this.paciente = paciente;
        this.vlrExame = valorExame;
    }

    public abstract String informarResultado();

    public Pessoa getPaciente() 
    {
        return paciente;
    }

    public double getValorExame() 
    {
        return vlrExame;
    }
}
