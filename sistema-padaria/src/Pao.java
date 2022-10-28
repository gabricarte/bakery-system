
import javax.swing.JOptionPane;

public class Pao extends Produto{
    
    //Atributos
    
    private String integral;
    
    //Métodos
    
    //Construtor
    public Pao() {
          this.integral = JOptionPane.showInputDialog("Deseja pão integral? (R$ 0,60)");
          this.integral = this.integral.toLowerCase(); 
          this.integral = this.integral.trim(); 
    
          if(this.integral.equals("sim") || this.integral.equals("s")){
              this.setPreco(0.6); 
          } else{
              this.setPreco(0.4);
          }
    }
   
    
    // Preço total da categoria pão.
    // Método sobrescrito da classe "Produto". 
    
    @Override
    public void setPrecoTotal(int quantidade) {
        this.setPrecoTotal(quantidade, this.getPreco());
    }
    
    //Getters and Setters

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }
    
    
    
}
