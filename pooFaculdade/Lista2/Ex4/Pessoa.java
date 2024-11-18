package Ex4;

public class Pessoa {

    private String nome;
    private String sexo;
    private Data dataNascimento;
    private Endereco endereco;
    private Dado dadoDe6Faces;
    private Dado dadoDe8Faces;

    public Pessoa(String nome, String sexo, Data dataNascimento, Endereco endereco) {
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.dadoDe6Faces = new Dado(6);
        this.dadoDe8Faces = new Dado(8);
    }

    public int jogarDadoDe6Faces() {
        return dadoDe6Faces.jogar();
    }

    public int jogarDadoDe8Faces() {
        return dadoDe8Faces.jogar();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Dado getDadoDe6Faces() {
        return dadoDe6Faces;
    }

    public Dado getDadoDe8Faces() {
        return dadoDe8Faces;
    }
}
