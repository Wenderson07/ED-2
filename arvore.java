package arvoreAVL;


public class arvore {
	private No raiz;
	
	
	public boolean checarArvoreVazia() {
		//Função que checa se etá vazio
		return raiz == null;
	}
	public void limpar() {
		//Limpa ou cria a arvore
		raiz =null;
	}
	
	public void inserir(int x) {
		//Inserir um valor x
		raiz = inserir(x,raiz); 
		
	}
	// Toda referencia a No é a classe No, sugestão: mudar nome para NoAvl
	private int altura(No y) {
		//return x == null ? -1 : x.altura;  Tradução:
		if(y == null) {
			return -1;
		}else {
			return altura(y); // Codigo original, testar se eh valido hue
		}
	}
	
	public No buscar(int x,No y) {
		if (y == null) {
			return null;
		}
		if(y.valor() == x) {
			return y;
		}else if(x < y.valor()){
			return buscar(x,y.esquerda());
		}else {
			return buscar(x,y.direita());
		}	
		}

	
	
	
	
}
