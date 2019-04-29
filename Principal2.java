import java.util.Scanner;

public class Principal {

	public static void main() {

		HealthProfile health = new HealthProfile(null, null, null, 0, 0, 0, 0, 0);
		
		Scanner input = new Scanner( System.in );

		System.out.println("Informe seu nome: ");
		String nome = input.nextLine();
		health.setNome(nome);
		
		System.out.println("Informe seu sobrenome: ");
		String sobrenome = input.nextLine();
		health.setSobrenome(sobrenome);
		
		System.out.println("Informe seu sexo: ");
		String sexo = input.nextLine();
		health.setSexo(sexo);
		
		System.out.println("Informe seu dia de nascimento: ");
		int dia = input.nextInt();
		health.setDia(dia);

		System.out.println("Informe seu mes de nascimento: ");
		int mes = input.nextInt();
		health.setMes(mes);

		System.out.println("Informe seu ano de nascimento: ");
		int ano = input.nextInt();
		health.setAno(ano);
		
		System.out.println("Informe sua altura: ");
		float altura = input.nextFloat();
		health.setAltura(altura);

		System.out.println("Informe seu peso: ");
		float peso = input.nextFloat();
		health.setPeso(peso);
		
		System.out.printf("%s ", health.getNome());
		System.out.printf("%s%n", health.getSobrenome());
		System.out.printf("%d anos", health.idadeEmAnos());
		System.out.printf("Sua frequencia máxima é %d%n", health.maximumFrequenciaCardiaca());
		System.out.println("Frequencia Cardiaca Alvo:");
		System.out.printf("A Minima frequencia alvo é : %.0f%n", health.MinFrequenciaCardiacaAlvo());
		System.out.printf("A Maxima frequencia alvo é : %.0f%n", health.MaxFrequenciaCardiacaAlvo());
	}
}