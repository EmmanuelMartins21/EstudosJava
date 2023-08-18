public class Colesterol extends Exame 
{
    private double qtdLDL;
    private double qtdHDL;
    private char riscoPaciente;

    public Colesterol(Pessoa paciente, double valorExame, double quantidadeLDL, double quantidadeHDL, char riscoPaciente) 
    {
        super(paciente, valorExame);
        this.qtdLDL = quantidadeLDL;
        this.qtdHDL = quantidadeHDL;
        this.riscoPaciente = riscoPaciente;
    }

    @Override
    public String informarResultado() 
    {
        String classificacaoLDL = (riscoPaciente == 'B')
            ? "Risco baixo: LDL abaixo de 100 mg/dL"
            : (riscoPaciente == 'M')
                ? "Risco médio: LDL abaixo de 70 mg/dL"
                : "Risco alto: LDL abaixo de 50 mg/dL";
        
        boolean hdl = (getPaciente().getIdade() <= 19) 
                        ? (qtdHDL>45):(qtdHDL>40);
        
        String nivelHDL = hdl ? "BOM" : "BAIXO";

        return "HDL - " + nivelHDL + " | " + classificacaoLDL;
    }

    public double getQuantidadeLDL() 
    {
        return qtdLDL;
    }

    public double getQuantidadeHDL() 
    {
        return  qtdHDL;
    }

    public char getRiscoPaciente() 
    {
        return riscoPaciente;
    }
}
