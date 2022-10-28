
import javax.swing.JOptionPane;

public class Salgados extends Produto {

    //Atributos 
    private int salgado; 
    
    //Métodos
    
    //Construtor
    public Salgados() {
        
         this.salgado= Integer.parseInt(JOptionPane.showInputDialog("Digite o número do salgado desejado: \n 1 - Coxinha R$ 2,00\n 2 - Empada R$ 2,50"));
        
         if (this.salgado == 1 ){
             this.setPreco(2.0);
         } else if (this.salgado == 2 ){
             this.setPreco(2.50);
         } else {
             System.out.println("\nPor favor, digite o número correspondente a um salgado válido! ");
             System.exit(0);
         }
    }
        
    // Método sobrescrito da classe "Produto". 
    
    @Override
    public void setPrecoTotal(int quantidade) {
        this.setPrecoTotal(quantidade, this.getPreco());
    }
    
    //Getters and Setters

    public int getSalgado() {
        return salgado;
    }

    public void setSalgado(int salgado) {
        this.salgado = salgado;
    }
    
    
    
}
