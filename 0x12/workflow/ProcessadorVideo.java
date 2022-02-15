import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canais = new ArrayList<>();

    public ProcessadorVideo() {
    }

    public ProcessadorVideo(ArrayList<CanalNotificacao> canais) {
	this.canais = canais;
    }

    public void registrarCanal(CanalNotificacao canalNotificacao) {
	canais.add(canalNotificacao);
    }

    public void processar(Video video) {
	for (CanalNotificacao canal : canais) {

	    Mensagem mensagem = new Mensagem();

	    String texto = String.format("%s - %s", video.getArquivo(), video.getFormatoVideo().name());

	    mensagem.setTipoMensagem(TipoMensagem.LOG);
	    mensagem.setTexto(texto);

	    canal.notificar(mensagem);
	}
    }
}
