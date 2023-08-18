public class Glicemia extends Exame
{    
    private double qtdGlicose;
    public Glicemia(Pessoa paciente, double valorExame, double qGlicemia) 
    {
        super(paciente, valorExame);
        this.qtdGlicose = qGlicemia;
    }   
    
    @Override
    public String informarResultado() 
    {
        return (qtdGlicose < 100) ? "Normoglicemia" : (qtdGlicose < 126) 
            ? "Pré-diabetes" : "Diabetes estabelecido";
    }

    public double getQtdGlicose() 
    {
        return qtdGlicose;
    }
}
