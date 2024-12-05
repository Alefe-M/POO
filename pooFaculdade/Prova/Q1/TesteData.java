package Q1;

public class TesteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data data1 = new Data(01, 12, 2024);
		System.out.println("Data Inicial: " + data1);

		data1.avancaDias(15);
		System.out.println("Data após avançar 15 dias: " + data1);

		data1.retrocedeDias(10);
		System.out.println("Data após retroceder 10 dias: " + data1);

		Data dataHoje = new Data();
		System.out.println("Data de Hoje: " + dataHoje);

	}

}
