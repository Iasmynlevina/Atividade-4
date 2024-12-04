import java.util.Stack;

public class AutomatoPilha {

    public static boolean linguagem(String entrada) {
        Stack<Character> pilha = new Stack<>();

        for (char c : entrada.toCharArray()) {
            if (c == '0') {
                pilha.push(c);
            } else if (c == '1') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            } else {
                return false;
            }
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String[] entradas = { "0011", "000111", "0101", "0", "111", "" };

        for (String entrada : entradas) {
            boolean aceita = linguagem(entrada);
            System.out.println("Entrada: \"" + entrada + "\" -> " + (aceita ? "Aceitar" : "Rejeitar"));
        }
    }
}
