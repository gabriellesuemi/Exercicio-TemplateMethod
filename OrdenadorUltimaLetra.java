public class OrdenadorUltimaLetra extends OrdenadorPalavras {

    @Override
    protected int comparar(String a, String b) {
        char ultimaA = a.charAt(a.length() - 1);
        char ultimaB = b.charAt(b.length() - 1);

        return Character.compare(ultimaA, ultimaB);
    }
}
