import java.time.LocalDate;

public class Pessoa
{
    private String nome;
    private String tipoSanguineo;
    private int anoNascimento;

    public Pessoa(String nome, String tipoSanguineo, int anoNascimento) 
    {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getTipoSanguineo() 
    {
        return tipoSanguineo;
    }

    public int getAnoNascimento() 
    {
        return anoNascimento;
    }

    public int getIdade() 
    {
        return LocalDate.now().getYear() - anoNascimento < 0 
            ? 0:LocalDate.now().getYear() - anoNascimento;
    }
    
}