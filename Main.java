import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] nomes = {
                "Gabrielle",
                "Livia",
                "Luiza",
                "Eduardo",
                "Rafaela",
                "Matheus",
        };

        String[] porUltimaLetra = nomes.clone();
        String[] porTamanho = nomes.clone();

        OrdenadorPalavras ordUltima = new OrdenadorUltimaLetra();
        OrdenadorPalavras ordTamanho = new OrdenadorTamanho();

        ordUltima.ordenar(porUltimaLetra);
        ordTamanho.ordenar(porTamanho);

        System.out.println("Ordenado pela última letra:");
        System.out.println(Arrays.toString(porUltimaLetra));

        System.out.println();

        System.out.println("Ordenado por tamanho:");
        System.out.println(Arrays.toString(porTamanho));
    }
}