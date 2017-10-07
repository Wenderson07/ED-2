package arvoreAVL;


//Essa Classe cria os nós
public class No {
	private int x;
	int fatorDeBalanceamento;
	private No pai;
	private No esquerda;
	private No direita;
	private int altura; //pode ser removido

	
	//Construtores 
	public No pai() {
		return this.pai;
	}
	
	public No esquerda() {
		return this.esquerda;
	}
	public No direita() {
		return this.direita;
	}
	public int altura() {
		return this.altura;
	}

	
	public int valor() {
		return this.x;
	}
}





/*

package arvoreAVL;


//Essa Classe cria os nós
public class No {
	private int valor;
	int fatorDeBalanceamento;
	private No pai;
	private No direita;
	private No esquerda;
	private int altura; //pode ser removido
	
	public No(int x) { //valor
		pai = null;
		direita = null;
		esquerda = null;
		altura = 0;
		valor = x;
	}

}
*/
