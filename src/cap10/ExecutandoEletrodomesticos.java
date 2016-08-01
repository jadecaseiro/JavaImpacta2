package cap10;

public class ExecutandoEletrodomesticos {
	public static void main(String[] args) {
		Eletrodomestico[] aparelhos = { new Geladeira(), new Televisao(), new Microondas() };

		executarAparelhos(aparelhos); // fa�a este m�todo funcionar

}
	static void executarAparelhos(Eletrodomestico[] aparelhos){
		for (Eletrodomestico eletrodomestico : aparelhos) {
			
			eletrodomestico.ligar();
			
			if (eletrodomestico instanceof Geladeira){
				((Geladeira)eletrodomestico).descongelar();
			} else if (eletrodomestico instanceof Televisao){
				((Televisao)eletrodomestico).trocarCanal();
			} else
				((Microondas)eletrodomestico).aquecer();
		}
	}
}
/*
 * Nesta mesma classe, implemente o m�todo void executarAparelhos(aparelhos)
 * 
 * A sa�da dever� ser:
 * 
 * Ligando a geladeira...
 * Descongelando...
 * ---------------------------------------------------
 * Ligando TV.
 * Trocando canal...
 * ---------------------------------------------------
 * Ligando Microondas.
 * Aquecendo...
* ---------------------------------------------------
 */

