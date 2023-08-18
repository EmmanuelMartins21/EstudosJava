
public class PessoaNegocio {
    public boolean aprovado;

    void aprovarPessoa(Pessoa pessoa){
        aprovado =  pessoa.idade >10;
    }
}
