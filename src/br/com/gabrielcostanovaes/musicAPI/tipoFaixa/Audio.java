package br.com.gabrielcostanovaes.musicAPI.tipoFaixa;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;

    public void imprimirInfo(){

        System.out.println("Título: "+ getTitulo());
        System.out.println("Duração: "+ getDuracao() + " minutos");
        System.out.println("Curtidas: "+ getCurtidas());
        System.out.println("Total de Reproduçoes: "+ getTotalDeReproducoes()+"\n\n\n");

    }

    public void curtir(int quantidade){
        this.curtidas += quantidade;

    }

    public void reproduzir(int quantidade){
        this.totalDeReproducoes += quantidade;
    }

    //getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

}
