package map_votos;

public class Votos {

    private String candidato;
    private Integer votos;

    public Votos() {
    }

    public Votos(String candidato, Integer votos) {
        this.candidato = candidato;
        this.votos = votos;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Votos [candidato=" + candidato + ", votos=" + votos + "]";
    }
}
