public enum TipoMensagem {
    AVISO("aviso"), ERRO("erro"), LOG("log");

    private String mensagem;

    TipoMensagem(String mensagem) {
	this.mensagem = mensagem;
    }
}
