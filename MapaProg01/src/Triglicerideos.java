public class Triglicerideos extends Exame 
{
    private double qtdTriglicerideos;

    public Triglicerideos(Pessoa paciente, double valorExame, double quantidadeTriglicerideos) 
    {
        super(paciente, valorExame);
        this.qtdTriglicerideos = quantidadeTriglicerideos;
    }

    @Override
    public String informarResultado() 
    {
        int idade = getPaciente().getIdade();
        return (idade < 10)
        ? (qtdTriglicerideos < 75) ? "inferior a 75 mg/dL" : "acima de 75 mg/dL"
        : (idade < 20)
            ? (qtdTriglicerideos < 90) ? "inferior a 90 mg/dL" : "acima de 90 mg/dL"
            : (qtdTriglicerideos < 150) ? "inferior a 150 mg/dL" : "acima de 150 mg/dL";
    }

    public double getqtdTriglicerideos() 
    {
        return qtdTriglicerideos;
    }
}
