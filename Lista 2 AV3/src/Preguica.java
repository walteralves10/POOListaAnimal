/*
    Exercicio 01 - estendido de animal, hedando o que tem em animal e criado um metodo locomover pois é diferente 
    e não foi pedido para usar polimorfismo.
*/
public class Preguica extends Animal{
    
//    public void locomoverDiferente(){
//        System.out.println("Sobe em arvores");
//    }
    //Exercicio 02, chamando metodo de sobreposição que é uma forma de polimorfismo
    @Override
    public void emitirSom() {
        System.out.println("Fazendo som de preguiça");
    }
    //...
    @Override
    public void locomover() {
        System.out.println("Subindo em arvores");
    }
}
