// Classe base (superclasse)
class Animal {
    String nome;
    
    // Construtor da classe base
    public Animal(String nome) {
        this.nome = nome;
    }
    
    // Método da classe base
    void emitirSom() {
        System.out.println(nome + " emite um som desconhecido.");
    }
}

// Subclasse que herda de Animal
class Cachorro extends Animal {
    
    // Construtor da subclasse
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse
    }
    
    // Sobrescreve o método emitirSom da superclasse
    @Override
    void emitirSom() {
        System.out.println(nome + " late: Au au!");
    }
    
    // Novo método exclusivo da subclasse
    void abanarRabo() {
        System.out.println(nome + " está abanando o rabo.");
    }
}

public class ExemploHeranca {

    public static void main(String[] args) {
        // Criando uma instância da subclasse Cachorro
        Cachorro meuCachorro = new Cachorro("Bobby");
        
        // Chamando métodos da superclasse e subclasse
        meuCachorro.emitirSom(); // Chama o método sobrescrito da subclasse
        meuCachorro.abanarRabo(); // Chama o método exclusivo da subclasse
    }
}
