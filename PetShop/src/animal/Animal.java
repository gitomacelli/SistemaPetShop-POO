package animal;

// SuperClasse Animal
public class Animal {  
	
	//ATRIBUTOS/CARACTERISTICAS
    private String nome;
    private int idade;
    private double peso;
    
    //CONSTRUTOR
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        setPeso(peso); // Usa o método com validação
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            System.out.println("Erro: O peso deve ser maior que zero!");
        } else {
            this.peso = peso;
        }
    }
    public double precoServico(String servico) {
        System.out.println("Serviço não disponível para este tipo de animal.");
        return -1;
    }

}