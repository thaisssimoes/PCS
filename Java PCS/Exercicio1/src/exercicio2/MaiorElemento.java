package exercicio2;
import static java.lang.Math.max;

public class MaiorElemento {
	public static int maiorElemento(int vetor[], int i) {
	    if (i > 0) {
	        return max(vetor[i], maiorElemento(vetor, i-1));
	    } else {
	        return vetor[0];
	    }
	}
}
