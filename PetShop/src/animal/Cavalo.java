package animal;

// Classe Cavalo que herda de Animal
public class Cavalo extends Animal {  

	//Atributos da classe
    private String raca; 
    private double altura;
    private boolean vermifugado; 

    // Construtor da classe Cavalo
    public Cavalo(String nome, int idade, double peso, String raca, double altura, boolean vermifugado) {
        super(nome, idade, peso); // Chama o construtor da superclasse Animal
     //Inicializa os atributos
        setAltura(altura); // Usa o setter para validar
        this.raca = raca; 
        this.vermifugado = vermifugado; 
    }

  //ENCAPSULAMENTO(Métodos Getter e Setter para acessar e modificar os atributos privados)
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getAltura() {
        return altura;
    }

 // Restrição: A altura do cavalo não pode ser menor que 1.2m
    public void setAltura(double altura) {
        if (altura < 1.2) {
            System.out.println("Erro: A altura do cavalo não pode ser menor que 1.2m!");
            return;
        }
        this.altura = altura;
    }

    public boolean isVermifugado() {
        return vermifugado;
    }

    public void setVermifugado(boolean vermifugado) {
        this.vermifugado = vermifugado;
    }
  //POLIMORFISMO(calcular o preço do serviço conforme for solicitado)
    @Override
    public double precoServico(String servico) {
        // Converte o serviço para letras minúsculas
        switch (servico.toLowerCase()) {
            case "banho":
                return 60.00; 
            case "tosa": 
                return 90.00; 
            case "consulta":
                return 130.00; 
            default: // Caso o serviço não esteja listado, retorna -1
                return -1;
        }
    }
}