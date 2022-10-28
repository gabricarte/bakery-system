
public class Produto {
    
    //Atributos
    private String nome;  
    private double preco; // Implementar o get nas classes filhas 
    private double precoTotal; 
    
     //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public double getPrecoTotal() {
        return precoTotal;
    }
    
    // Método que é sobrescrito nas classes filhas 
    public void setPrecoTotal(int quantidade) {
        this.precoTotal = quantidade * preco;
    }
    
    //Método para alterar o valor do Preço Total
    public void setPrecoTotal(int quantidade, double preco){
        this.precoTotal = quantidade * preco; 
    }
    
}
