public class HealthProfile
{
	private String nome;
	private String sobrenome;
	private String sexo;
	private int dia;
	private int mes;
	private int ano;
	private float altura;
	private float peso;

	public HealthProfile(String nome, String sobrenome, 
			String sexo, int dia, int mes, int ano, float altura,
			float peso)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.altura = altura;
		this.peso = peso;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}

	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
		
	public String getSobrenome()
	{
		return sobrenome;
	}

	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	
	public String getSexo()
	{
		return sexo;
	}

	public void setDia(int dia)
	{
		if ((dia >= 1) && (dia <= 31))
			this.dia = dia;
	}
	
	public int getDia()
	{
		return dia;
	}

	public void setMes(int mes)
	{
		if ((mes >= 1) && (mes <= 12))
			this.mes = mes;
	}

	public int getMes()
	{
		return mes;
	}
	
	public void setAno(int ano)
	{
		if (ano >= 1900)
			this.ano = ano;
	}
	
	public int getAno() 
	{
		return ano;
	}
	
	public void setAltura(float altura)
	{
		if (altura >= 100)
			this.altura = altura;
	}
	
	public float getAltura()
	{
		return altura;
	}

	public void setPeso(float peso)
	{
		if (peso >= 70)
			this.peso = peso;
	}
	
	public float getPeso()
	{
		return peso;
	}

	public int idadeEmAnos() 
	{
		return 2019 - getAno();
	}

	public int maximumFrequenciaCardiaca()
	{
		return 220 - idadeEmAnos();
	}

	public double MinFrequenciaCardiacaAlvo()
	{
		return 0.5 * maximumFrequenciaCardiaca();
	}

	public double MaxFrequenciaCardiacaAlvo()
	{
		return 0.85 * maximumFrequenciaCardiaca();
	}

	public float getIMC()
	{
		float IMC = getPeso() / (getAltura() * getAltura());
		return IMC;
	}
}