/*
        Exercicio 01 - estendido de animal, hedando o que tem em animal
*/
public class Cavalo extends Animal{
    //Exercicio 02, chamando metodo de sobreposição que é uma forma de polimorfismo
    @Override
    public void emitirSom() {
        System.out.println("Fazendo som de cavalo!");
    }
}
