package br.com.gabrielcostanovaes.musicAPI.tipoFaixa;

public class Podcast extends Audio{
    private int numeroParticipantes;
    private String participantes;


    @Override
    public void imprimirInfo(){
        System.out.println("Participantes do podcast: " + getParticipantes());
        System.out.println("Número de participantes: " +getNumeroParticipantes());

        super.imprimirInfo();
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }
}
