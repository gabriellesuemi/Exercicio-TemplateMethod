import java.util.Arrays;

public abstract class OrdenadorPalavras {

    public final void ordenar(String[] palavras) {
        Arrays.sort(palavras, (a, b) -> comparar(a, b));
    }

    protected abstract int comparar(String a, String b);
}