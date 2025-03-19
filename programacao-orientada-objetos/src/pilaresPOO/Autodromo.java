public class Autodromo {

    public static void main(String [] args) {
        Carro civic = new Carro();
        civic.setChassi("10293");
        System.out.println("Chassi Carro: " + civic.getChassi());
        civic.ligar();

        Moto Z400 = new Moto();

        Z400.setChassi("20201");
        System.out.println( "Chassi Moto: " + Z400.getChassi());
        Z400.ligar();
        
    }
}

// Pilares da Programação Orientada a Objetos (POO)

// 1. Abstração: 
// A ideia é esconder detalhes desnecessários e mostrar apenas o que é essencial. 
// Por exemplo, ao usar um carro, você não precisa saber como o motor funciona internamente — basta dirigir.

// 2. Encapsulamento: 
// Consiste em "proteger" os dados da classe, deixando eles privados e acessíveis só por métodos públicos (getters e setters).

// 3. Herança: 
// Permite que uma classe "filha" herde atributos e métodos de uma classe "pai".
// No exemplo, Carro herda de Veiculo e aproveita seus métodos.

// 4. Polimorfismo: 
// Permite que métodos com o mesmo nome se comportem de formas diferentes, dependendo da classe que o implementa.