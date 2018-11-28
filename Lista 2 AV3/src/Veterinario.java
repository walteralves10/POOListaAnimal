/*
    Exercicio 03 - Simples metodo examinar chamando as objetos das classes herdadas por animais
*/
public class Veterinario {

    public void examinar(Cachorro dog, Cavalo mula, Preguica eu) {
        dog.emitirSom();
        mula.emitirSom();
        eu.emitirSom();
    }

}
