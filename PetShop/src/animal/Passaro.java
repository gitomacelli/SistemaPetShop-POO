package animal; 
// Classe Passaro que herda de Animal
public class Passaro extends Animal {  
	
	//Atributos da classe
    private String especie;      
    private String corDasPenas;  
    private boolean voa;    

    // Construtor da classe Passaro
    public Passaro(String nome, int idade, double peso, String especie, String corDasPenas, boolean voa) {
        super(nome, idade, peso); // Inicializa os atributos da superclasse Animal
        setCorDasPenas(corDasPenas); // Usa o setter para validar
        this.especie = especie;
        this.voa = voa;
    }

  //ENCAPSULAMENTO(Métodos Getter e Setter para acessar e modificar os atributos privados)
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCorDasPenas() {
        return corDasPenas;
    }

 // Restrição: A cor do pássaro só pode ser Azul, Verde, Vermelho ou Amarelo
    public void setCorDasPenas(String corDasPenas) {
        if (!corDasPenas.equalsIgnoreCase("Azul") && !corDasPenas.equalsIgnoreCase("Verde") && !corDasPenas.equalsIgnoreCase("Vermelho") && !corDasPenas.equalsIgnoreCase("Amarelo")) {
            System.out.println("Erro: A cor do pássaro deve ser Azul, Verde, Vermelho ou Amarelo!");
            return;
        }
        this.corDasPenas = corDasPenas;
    }
    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

  //POLIMORFISMO(calcular o preço do serviço conforme for solicitado)
    @Override
    public double precoServico(String servico) {
        // Converte para letras minúsculas, garantindo que funcione independentemente de como o cliente digitar o serviço
        switch (servico.toLowerCase()) {
            case "banho":
                return 30.00;
            case "tosa": 
                return 40.00;
            case "consulta":
                return 80.00;
            default: // Caso o serviço não esteja listado, retorna -1
                return -1;
        }
    }
}