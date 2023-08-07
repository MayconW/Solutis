package Lista02;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class Ex10_Contador {

    private String texto;
    private static final Set<Character> VOGAIS = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));

    public Ex10_Contador(String texto) {
        this.texto = texto.toLowerCase();
    }

    public int contardor_de_Vogais() {
        int vogais = 0; //exemplo de variavel local
        for (char c : texto.toCharArray()) {
            if (VOGAIS.contains(c)) {
                vogais++;
            }
        }
        return vogais;
    }

    public int contardor_de_Espacos() {
        return texto.split("\\s+").length - 1;
    }

    public int contador_de_Consoantes() {
        int consoantes = 0;
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c) && !VOGAIS.contains(c)) {
                consoantes++;
            }
        }
        return consoantes;
    }

    public static void main(String[] args) {
    	int vogais, espacos, consoantes;
        String resposta;
        
        Scanner s = new Scanner (System.in);
        
        System.out.print("Digite a frase: ");
        resposta=s.nextLine();
        
        Ex10_Contador contador = new Ex10_Contador(resposta);
        
        espacos = contador.contardor_de_Espacos();
        vogais = contador.contardor_de_Vogais();
        consoantes = contador.contador_de_Consoantes();

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de espacos em branco: " + espacos);
        System.out.println("Quantidade de consoantes: " + consoantes);
    }

}
