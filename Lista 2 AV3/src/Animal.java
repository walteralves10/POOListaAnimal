/*
        Exercicio 01 - Criado os metodos e atribuições como pedido no exercicio

*/
public class Animal {
    
    private String nome;
    private int idade;
    
    public void emitirSom(){
        System.out.println("Som de animal");
    }
    
    public void locomover(){
        System.out.println("correndo!");
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
}
