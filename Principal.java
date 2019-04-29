import javax.swing.JOptionPane;

public class Principal{
	public static void main(String[] args) {

		int dia, mes, ano;
		float altura, peso;

		String nome = JOptionPane.showInputDialog("Nome: ");
		String sobrenome = JOptionPane.showInputDialog("Sobrenome: ");
		String sexo = JOptionPane.showInputDialog("Sexo: ");
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu nascimento (em digitos)"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do nascimento (como antes)"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento (como antes)"));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Altura(em metros): "));
		peso = Float.parseFloat(JOptionPane.showInputDialog("Peso(em quilogramas): "));

		HealthProfile health = new HealthProfile(nome, sobrenome, sexo, dia, mes, ano, altura, peso);

		String message = String.format(
				"Nome:%s\nSobrenome:%s\nSexo:%s\nData de Nascimento:%d/%d/%d\nIdade em Anos:%d\nFrequencia Cardiaca Maxima:%d\nFrequencia Cardiaca Alvo:[%.2f;%.2f]\nIMC:%.2f",
				health.getNome(), health.getSobrenome(), health.getSexo(), health.getDia(), health.getMes(),
				health.getAno(), health.idadeEmAnos(), health.maximumFrequenciaCardiaca(), health.MinFrequenciaCardiacaAlvo(),
				health.MaxFrequenciaCardiacaAlvo(), health.getIMC());

		JOptionPane.showMessageDialog(null, message);
	}

}