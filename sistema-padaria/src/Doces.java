
import javax.swing.JOptionPane;

public class Doces extends Produto{
    //Atributos
    
    private int doce; 
    
    //Métodos
    
    //Construtor
    public Doces() {
        
    this.doce= Integer.parseInt(JOptionPane.showInputDialog("Digite o número do doce desejado: \n 1 - Sonho R$ 4,00\n 2 - Brigadeiro R$ 3,00"));
    
    if (this.doce == 1){
        this.setPreco(4.0);  
        
    } else if(this.doce == 2 ){
       this.setPreco(3.0); 
       
    }else{
        System.out.println("\nPor favor, digite o número correspondente a um doce válido! ");
        System.exit(0);
    }
    
    }
    
    // Método sobrescrito da classe "Produto". 
    @Override
    public void setPrecoTotal(int quantidade) {
        this.setPrecoTotal(quantidade, this.getPreco());
    }
    
    //Getters and Setters

    public int getDoce() {
        return doce;
    }

    public void setDoce(int doce) {
        this.doce = doce;
    }
    
}
