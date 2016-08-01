package extra;

public class UsandoVarargs {
	public static void main(String[] args) {
       
		System.out.println("Resultado: " + somar(2,3));
        System.out.println("Resultado: " + somar(2,3,4));
        System.out.println("Resultado: " + somar(2,3,4,6));
    }

    public static int somar(int ... inteiros){
        int resultado = 0;
        for (int i = 0; i<inteiros.length; i++) {
            resultado += inteiros[i];
        }
        return resultado;
    }

}

/*
 * Sintaxe mais simples para passar
 * conjuntos de par�metros do mesmo tipo
 * Evita a cria��o de arrays manualmente
 * As declara��es de tamanho variado 
 * s�o sempre seguidas de ...
 * Devem ser sempre o �ltimo par�metro

*/

