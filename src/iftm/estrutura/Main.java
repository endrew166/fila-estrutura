package iftm.estrutura;

public class Main {
	public static void main(String[] args) throws IllegalAccessException {
		Fila<Paciente> fila = new Fila<Paciente>();
		Paciente c1 = new Paciente("Maria", "12/03/99", "Dor de cabeça", "Verde");
		Paciente c2 = new Paciente("Jose", "12/03/95", "Perna quebrada", "Amarelo");
		Paciente c3 = new Paciente("Mike", "3/04/92", "Infarto", "Vermelho");
		Paciente c4 = new Paciente("Micão", "16/09/99", "Bicho de pé", "Verde");



		fila.enfileiraComPrioridade(c1);
		fila.enfileiraComPrioridade(c2);
		fila.enfileiraComPrioridade(c3);
		fila.enfileiraComPrioridade(c4);

		System.out.println();
		System.out.println(fila.desenfileira());
		System.out.println();
		System.out.println(fila.toString());

	}
}
