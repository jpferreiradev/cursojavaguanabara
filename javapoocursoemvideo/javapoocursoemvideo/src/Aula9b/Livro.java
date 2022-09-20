package Aula9b;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // Instancia da classed Pessoa;

// Construtores e métodos especiais

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String ti){
        this.titulo = ti;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String au){
        this.autor = au;
    }

    public int getTotPaginas(){
        return this.totPaginas;

    }
    public void setTotPaginas(int toPag){
        this.totPaginas = toPag;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public void setPagAtual(int atuPag ){
        this.pagAtual = atuPag;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public void setAberto(boolean open){
        this.aberto = open;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }
    public void setPessoa(Pessoa lei){
        this.leitor = lei;
    }


    public void detalhes(){

    }

    @Override
    public void abrir() {
        
    }

    @Override
    public void fechar() {

    }

    @Override
    public void folhear() {

    }

    @Override
    public void avançarPag() {

    }

    @Override
    public void voltarPag() {

    }


    // Métodos publicos




}
