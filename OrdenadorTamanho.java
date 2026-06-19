public class OrdenadorTamanho extends OrdenadorPalavras {

    @Override
    protected int comparar(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}
