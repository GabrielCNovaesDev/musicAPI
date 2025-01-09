import br.com.gabrielcostanovaes.musicAPI.tipoFaixa.Musica;
import br.com.gabrielcostanovaes.musicAPI.tipoFaixa.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        Musica musica = new Musica();

        musica.curtir(200);
        musica.curtir(300);
        musica.reproduzir(2000);
        musica.reproduzir(2500);

        musica.setDuracao(3);
        musica.setTitulo("Ouço o barulho!");
        musica.setAutor("juliane nogueira");
        musica.setAlbum("Rosas");


        podcast.curtir(400);
        podcast.curtir(200);
        podcast.reproduzir(2000);
        podcast.reproduzir(5000);

        podcast.setDuracao(80);
        podcast.setTitulo("Alura Podcast");
        podcast.setParticipantes("Mônica, Marcos, João, Eduardo");
        podcast.setNumeroParticipantes(4); //Futuramente, quando eu aprender a trabalhar com listas, tenho que melhorar esse código


        podcast.imprimirInfo();
        //musica.imprimirInfo();
    }
}
