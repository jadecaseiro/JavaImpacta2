package extra;

public class TestaVarargs {
    String nome, telefone, cidade;
    int a, b, c;
    void setDados(int a, int b, int c, String ...dados){
        this.a = a;
        this.b = b;
        this.c = c;
        this.nome = dados[0];
        this.telefone = dados[1];
        this.cidade = dados[2];
    }
    String getDados(){
        return a + ": " + nome + " - " + b + ": " +
                telefone + " - " + c + ": " + cidade;
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
