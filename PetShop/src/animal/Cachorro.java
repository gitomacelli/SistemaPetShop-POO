package animal;

//HERANÇA (Classe Cachorro que herda de Animal
public class Cachorro extends Animal {
	
	//Atributos da classe
	private String raca;
	private String porte;
	private boolean temVacinacao;
	
	// Construtor da classe
	public Cachorro(String nome, int idade, double peso, String raca, String porte, boolean temVacinacao) {
		 // Chama o construtor da superclasse Animal para inicializar nome,idade e peso
		super(nome, idade, peso);
		
		// Inicializa os atributos específicos do Cachorro
		setPorte(porte); // Usa o setter para validar
		this.raca = raca;
		this.temVacinacao = temVacinacao;
	}
	//ENCAPSULAMENTO(Métodos Getter e Setter para acessar e modificar os atributos privados)
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPorte() {
		return porte;
	}
	// Restrição: O porte só pode ser Pequeno, Médio ou Grande
    public void setPorte(String porte) {
        if (!porte.equalsIgnoreCase("Pequeno") && !porte.equalsIgnoreCase("Médio") && !porte.equalsIgnoreCase("Grande")) {
            System.out.println("Erro: O porte do cachorro deve ser Pequeno, Médio ou Grande!");
            return;
        }
        this.porte = porte;
    }

	public boolean isTemVacinacao() {
		return temVacinacao;
	}
	public void setTemVacinacao(boolean temVacinacao) {
		this.temVacinacao = temVacinacao;
	}
	
	//POLIMORFISMO(calcular o preço do serviço conforme for solicitado)
	@Override
		public double precoServico(String servico) {
			//converte paara que funcione independentemente de como o cliente digitar o serviço
			switch (servico.toLowerCase()) {
			case "banho": 
				return 50.00;
			case "tosa":
				return 80.00;
			case "consulta":
				return 100.00;
			default: // Caso o serviço não esteja listado, retorna -1
				return -1;
		}
    }
}

