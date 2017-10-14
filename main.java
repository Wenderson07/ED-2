package arvoreAVL;
import java.io.*;                 
import java.lang.Integer;

public class main {
	public static void main(String[] args) throws IOException{
		arvore teste = arvore();
		teste.inserir(10,teste);
	}
}
