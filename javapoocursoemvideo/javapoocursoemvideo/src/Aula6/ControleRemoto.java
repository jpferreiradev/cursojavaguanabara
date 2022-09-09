package Aula6;

    public class ControleRemoto {


        // Atributos
        private int volume;
        private boolean ligado;
        private boolean tocando;

        // Métodos especiais
        public ControleRemoto(){
            volume = 50;
            ligado = false;
            tocando = false;
        }

        private int getVolume() {
            return volume;
        }

        private void setVolume(int v) {
            this.volume = v;
        }

        private boolean getLigado(){
            return ligado;
        }

        private void setLigado(boolean l) {
            this.ligado = l;
        }

        private boolean getTocando(){
            return tocando;
        }

        private void setTocando(boolean t) {
            this.tocando = t;
        }
    }
