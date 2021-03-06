package arvoreAVL;


public class arvore {
	public No raiz;
	
	public arvore() { //construtor
		//Iniciar
		raiz = null;
	}
	
	
	public boolean checarArvoreVazia() {
		//Função que checa se etá vazio
		return raiz == null;
	}
	public void limpar() {
		//Limpa ou cria a arvore
		raiz =null;
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
	int maximo(int a, int b) {
		if(a> b) {
			return a;
		}else {
			return b;
		}
	}

	public No rotacionarParaEsquerda(No y) {
		No aux = y.esquerda;  //Filho da direita
		//rotacionar
		y.esquerda = aux.direita;
		aux.direita = y;

		//altura
		y.altura = maximo(altura(y.esquerda),altura(y.direita))+1;
		aux.altura = maximo(altura(aux.esquerda),altura(aux.direita))+1;
		return aux;
	}
	
	public No rotacionarParaDireita(No y) {
		No aux = y.direita;  //Filho da direita
		//rotacionar
		y.direita = aux.esquerda;
		aux.esquerda = y;

		//altura
		y.altura = maximo(altura(y.esquerda),altura(y.direita))+1;
		aux.altura = maximo(altura(aux.esquerda),altura(aux.direita))+1;
		return aux;
	}
	
	int fatorDeBalanceamento(No y) {
		if(y == null) {
			return 0;}
		return altura(y.esquerda) - altura(y.direita); 
	}
	
	public No inserir(int x, No y) {
		System.out.println(x);
		if(y == null) {
			System.out.println("vazia");
			y = new No(x);	//Cria o novo no, caso seja vazia	
		}else if(x < y.valor) {		
			y.esquerda = inserir(x,y.esquerda);
		}else {
			y.direita = inserir(x,y.direita);
		}
		int fb = fatorDeBalanceamento(y);
		if(fb > 1) {
			if(x < y.esquerda.valor) {
				return rotacionarParaDireita(y);
			}else {
				y.direita = rotacionarParaEsquerda(y.esquerda);
				return rotacionarParaDireita(y);
			}	
		}
		if(fb < -1) {
			if(x > y.direita.valor) {
				return rotacionarParaEsquerda(y);
			}else {
				y.direita =rotacionarParaDireita(y);
				return rotacionarParaEsquerda(y);
			}
			
		}
		y.altura = maximo(altura(y.esquerda),altura(y.direita)) + 1;
		return y;
	}

	void preOrdem(No y) {
		if(y == null) {
			System.out.println("Arvore vazia");
		}
		if(y != null) {
			System.out.println(y.valor+"(" + fatorDeBalanceamento(y)+ ")");
			preOrdem(y.esquerda);
			preOrdem(y.direita);
		}
	}

}
