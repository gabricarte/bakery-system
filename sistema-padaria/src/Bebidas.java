
import javax.swing.JOptionPane;

public class Bebidas extends Produto{
    
    //Atributos
     private int bebida; 
    
    //Métodos
    
    //Construtor
     
    public Bebidas() {
        
    this.bebida= Integer.parseInt(JOptionPane.showInputDialog("Digite o número da bebida desejada: \n 1 - Café R$ 2,50\n 2 - Suco R$ 3,00"));
    
    if (this.bebida == 1) {
        this.setPreco(2.5); 
    } else if(this.bebida == 2 ){
       this.setPreco(3.0); 
    }else{
        System.out.println("\nPor favor, digite o número correspondente a uma bebida válida! ");
        System.exit(0);
    }
    
    }
    
    // Método sobrescrito da classe "Produto". 
    @Override
    public void setPrecoTotal(int quantidade) {
        this.setPrecoTotal(quantidade, this.getPreco());
    }
    
    //Getters and Setters

    public int getBebida() {
        return bebida;
    }

    public void setBebida(int bebida) {
        this.bebida = bebida;
    }
    
    
    
}
