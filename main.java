package arvoreAVL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arvore teste = new arvore(); //Crio novo elemento tipo arvore 
		teste.inserir(15, teste.raiz); 	//insere elemento
		teste.inserir(10, teste.raiz);
		teste.inserir(2, teste.raiz);
		teste.preOrdem(teste.raiz);
		System.out.println("oi");
	}

}
