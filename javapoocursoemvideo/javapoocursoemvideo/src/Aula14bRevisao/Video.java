package Aula14bRevisao;

public class Video implements AcoesVideo{

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Lembre-se de criar o seu construtor
    public Video(String ti){
        this.titulo = ti;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;

    }


    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String ti){
        this.titulo = ti;
    }

    public int getAvaliacao(){
        return this.avaliacao;
    }
    public void setAvaliacao(int avali){
        this.avaliacao = avali;
    }

    public int getViews(){
        return this.views;
    }
    public void setViews(int vi){
        this.views = vi;
    }

    public int getCurtidas(){
        return this.curtidas;
    }
    public void setCurtidas(int curti){
        this.curtidas = curti;
    }
    public boolean getReproduzindo(){
        return this.reproduzindo;
    }
    public void setReproduzindo(boolean repro){
        this.reproduzindo = repro;
    }



    // Métodos implementados da inteface AcoesVideo
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override // Sobreposição, eu estou sobrepondo um método, isso se chama Polimofirmo de sobreposição
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}


// Só faltou a classe que liga gafanhotos e video