package cap11.lab;

public class Cap11Lab1 {
	
	static int maiorNumero(int [] v){
		int maior= 0;
		for (int i =0; i < v.length; i++){
			if (v[i]>maior){
				maior = v[i];
			}
		}
		return maior;		
	}
}
