package Lista02;

public class Ex6_ProdutoImpares {

	public static void main(String[] args) {

		int produtoInt = 15;  
		float produtoFloat= 15;

		for (int i = 17; i <= 30; i += 2) {
//	
			produtoInt = (int) produtoInt * i;
			produtoFloat = (float) produtoFloat * i;
		}
		System.out.print("Resultado Int: " + produtoInt + " Resultado Float: " + produtoFloat);

	}
	//o valor da variavel inteira vai estourar pois passa dos limites dos 4 bytes (32 bits) de memória que variavel int utiliza ( que limita os valores a -2.147.483.648 a 2.147.483.647 )
}
