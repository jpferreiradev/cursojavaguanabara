package Aula9b;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // Instancia da classed Pessoa;

    // Aprender o método toString
    public String detalhes() {
        return "Livro{" + "titulo='" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + ", aberto=" + aberto + " \n,leitor=" + leitor.getNome() +
                ",idade=" + leitor.getIdade() + ",sexo=" + leitor.getSexo() + '}';
    }

    // Construtor
    public Livro(String ti, String au, int toPag, Pessoa lei) {
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = toPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = lei;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String ti) {
        this.titulo = ti;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String au) {
        this.autor = au;
    }

    public int getTotPaginas() {
        return this.totPaginas;

    }

    public void setTotPaginas(int toPag) {
        this.totPaginas = toPag;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int atuPag) {
        this.pagAtual = atuPag;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean open) {
        this.aberto = open;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setPessoa(Pessoa lei) {
        this.leitor = lei;
    }
    // Aqui estão os seus métodos publicos

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }
        @Override
        public void avançarPag () {
            this.pagAtual++;
        }

        @Override
        public void voltarPag() {
            this.pagAtual--;
        }
    }



// O usod da agregação - Implementando uma classe dentro da outra
// Quando usar um construtor?