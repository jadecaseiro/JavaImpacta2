package cap13.lab;

public class MaioresSalarios {
	public static void main(String[] args) {
		double[] salariosBrutos = { 1350, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00 };
		double[] salariosTop;
		salariosTop = DoubleArrayUtils.filtraValores(salariosBrutos, salario -> (salario>3000));
		
//		for (double salarioTop : salariosTop){
//			System.out.println(salarioTop);}
		
		DoubleArrayUtils.processaValores(salariosTop, salario -> System.out.println(salario)); 
			
		
	}

}
