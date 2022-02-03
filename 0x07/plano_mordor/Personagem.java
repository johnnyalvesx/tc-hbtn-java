import comida.*;
import humor.*;

public class Personagem {

    private int pontosDeFelicidade;

    public String obterHumorAtual() {
        if (pontosDeFelicidade > 15) {
            Humor humor = new MuitoFeliz();
            return humor.getClass().getSimpleName();
        } else if (pontosDeFelicidade >= 1 && pontosDeFelicidade <= 15) {
            Humor humor = new Feliz();
            return humor.getClass().getSimpleName();
        } else if (pontosDeFelicidade >= -5 && pontosDeFelicidade <= 0) {
            Humor humor = new Triste();
            return humor.getClass().getSimpleName();
        } else {
            Humor humor = new Irritado();
            return humor.getClass().getSimpleName();
        }
    }

    public void comer(Comida[] comidas) {
        for (Comida pComida : comidas) {
            setPontosDeFelicidade(this.pontosDeFelicidade += pComida.getPontosDeFelicidade());
        }
    }

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    @Override
    public String toString() {
        return getPontosDeFelicidade() + " - " + obterHumorAtual();
    }
}
