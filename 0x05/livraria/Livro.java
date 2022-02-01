import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {

	// atributos
	private String titulo;
	private String autor;
	private double preco;

	// construtores
	public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
		setTitulo(titulo);
		setAutor(autor);
		setPreco(preco);
	}

	// getters
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}

	// setters
	public void setTitulo(String titulo) throws LivroInvalidoException {
		if (titulo.length() < 3) {
			throw new LivroInvalidoException("Titulo de livro invalido");
		} else {
			this.titulo = titulo;
		}
	}

	public void setAutor(String autor) throws AutorInvalidoException {
		if (autor.contains(" ")) {
			this.autor = autor;
		} else {
			throw new AutorInvalidoException("Nome de autor invalido");
		}
	}

	public void setPreco(double preco) throws LivroInvalidoException {
		if (preco > 0) {
			this.preco = preco;
		} else {
			throw new LivroInvalidoException("Preco de livro invalido");
		}
	}
}
