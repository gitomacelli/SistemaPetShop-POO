# 🐾 Sistema de Gestão de PetShop - Projeto Java com POO

Este é um projeto de sistema para gerenciamento de serviços em um PetShop, desenvolvido com os conceitos da **Programação Orientada a Objetos (POO)** em Java. O sistema foi criado como parte de um exercício acadêmico para reforçar os conceitos de **herança, polimorfismo e encapsulamento**.

## 💡 Objetivo

Permitir que uma clínica veterinária/pet shop registre diferentes tipos de animais e realize serviços como **banho, tosa e consulta veterinária**, com preços personalizados por tipo de animal.

## 📦 Estrutura do Projeto

PetShop/ ├── src/ │ ├── animal/ │ │ ├── Animal.java │ │ ├── Cachorro.java │ │ ├── Cavalo.java │ │ └── Passaro.java │ ├── main/ │ │ └── Main.java │ └── module-info.java

## 🐶 Animais Suportados

O sistema permite o cadastro de:

- **Cachorro**
- **Cavalo**
- **Pássaro**

Cada animal possui **no mínimo 3 características**, como nome, idade, peso e uma característica própria (ex: raça, cor, habilidade de voo).

## 🔐 Encapsulamento e Validação

Os atributos dos animais são encapsulados e acessados via getters e setters.  
Foi implementada **uma restrição específica** para a modificação do peso: o peso não pode ser menor ou igual a zero.

```java
public void setPeso(double peso) {
    if (peso <= 0) {
        System.out.println("Erro: O peso deve ser maior que zero!");
    } else {
        this.peso = peso;
    }
}
🧠 POO Utilizado
Herança: As classes Cachorro, Cavalo e Passaro estendem a classe Animal.

Polimorfismo: O método precoServico() é sobrescrito em cada subclasse, permitindo comportamento específico para o cálculo de preço por animal.

Encapsulamento: Os atributos são privados e acessados por métodos públicos.

🧪 Execução:
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bolt", 3, 12.5, "Labrador", 7);
        Cavalo cavalo = new Cavalo("Spirit", 5, 500.0, "Marrom", true);
        Passaro passaro = new Passaro("Piu", 1, 0.2, "Azul", false);

        System.out.println("Preço do banho do cachorro: R$" + cachorro.precoServico("banho"));
        // ...
    }
}
✍️ Comentários
O código está comentado para auxiliar no entendimento das classes, métodos e lógicas implementadas.

👨‍💻 Desenvolvido por
Ana Valentina Araujo Martins
Gabrielle Cristina Gomes Maia
Giovanna Tomacelli Andrade
Letícia Soares da Costa Almeida
Marina Monalisa de Medeiros Melo

Curso: Analíse e Desenvolvimento de Sistemaas.

Disciplina: Programação Orientada a Objetos (POO).
