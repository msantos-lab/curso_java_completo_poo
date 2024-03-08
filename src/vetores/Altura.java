package vetores;

public class Altura {

    private String nome;
    private Integer idade;
    private Double altura;

    public Altura() {
    }

    public Altura(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double media(double altura, int n) {
        double media = 0;
        media += altura;
        return media / n;
    }


    public String toString() {
        return "Altura [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
    

}
