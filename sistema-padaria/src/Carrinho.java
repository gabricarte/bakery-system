
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Carrinho {

    //Atributos 
    private int numero; 
    private String addProd; 
    private int quantidade;
    private int quantPao;
    private int quantBebidas; 
    private int quantDoces;
    private int quantSalgados;
    private double total;
    
    //Construtor 
    public Carrinho() {
        this.inserirDados();
    }
    
    
    //Método que pergunta ao usuário o produto desejado e realiza a instância da respectiva classe desse produto
    
    public void inserirDados(){
 
    this.addProd = JOptionPane.showInputDialog("Deseja adicionar um produto ao carrinho? [Sim] [Não]");
    this.addProd = this.addProd.toLowerCase(); 
    this.addProd = this.addProd.trim(); 
    
    while (this.addProd.equals("sim") || this.addProd.equals("s")){ 
 
    this.numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do produto: "));
    
    this.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: "));
    
    /*Se o número digitado pelo usuário for igual a 1, realiza a instância da classe pão, adiciona
    ao atributo "quantPao" a quantidade de pães que o usuário deseja e chama o método que calcula
    o preço total dos pães de acordo com a quantidade. 
    
    Após isso, adiciona ao atributo "total" o preço final dos pães pedidos. Esse atributo armazena
    o preço final da compra.
    */
    
    if (this.numero == 1){
        
        Pao pao1 = new Pao();
        this.quantPao = quantidade; 
        pao1.setPrecoTotal(this.quantPao);
        this.total += pao1.getPrecoTotal(); 
        
    } else if (this.numero == 2){
        
        Bebidas bebida1 = new Bebidas(); 
        this.quantBebidas = quantidade; 
        bebida1.setPrecoTotal(this.quantBebidas);
        this.total += bebida1.getPrecoTotal();
        
    } else if (this.numero == 3){
        
         Doces doce1 = new Doces();
         this.quantDoces = quantidade;
         doce1.setPrecoTotal(this.quantDoces);
         this.total += doce1.getPrecoTotal();
         
    }else if(this.numero == 4){

         Salgados salgado1 = new Salgados();
         this.quantSalgados = quantidade;
         salgado1.setPrecoTotal(this.quantSalgados);
         this.total += salgado1.getPrecoTotal();
          
    } else{
        System.out.println("\nPor favor, digite uma categoria válida! ");
        System.exit(0);
    }
    
    this.addProd= JOptionPane.showInputDialog("Deseja adicionar outro produto ao carrinho? ");
    }
    
    this.mostrarDados();
    
    }
    
    
    //Método que mostra o recibo total da compra
    public void mostrarDados(){
        System.out.println("------ Recibo  ------");
        System.out.println("Pães: " + this.quantPao);
        System.out.println("Bebidas: " + this.quantBebidas);
        System.out.println("Doces: " + this.quantDoces);
        System.out.println("Salgados: " + this.quantSalgados);
        System.out.println("Total a pagar: R$" + new DecimalFormat("#,##0.00").format(this.total));
    }
    
    
    //Getters and setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAddProd() {
        return addProd;
    }

    public void setAddProd(String addProd) {
        this.addProd = addProd;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantPao() {
        return quantPao;
    }

    public void setQuantPao(int quantPao) {
        this.quantPao = quantPao;
    }

    public int getQuantBebidas() {
        return quantBebidas;
    }

    public void setQuantBebidas(int quantBebidas) {
        this.quantBebidas = quantBebidas;
    }

    public int getQuantDoces() {
        return quantDoces;
    }

    public void setQuantDoces(int quantDoces) {
        this.quantDoces = quantDoces;
    }

    public int getQuantSalgados() {
        return quantSalgados;
    }

    public void setQuantSalgados(int quantSalgados) {
        this.quantSalgados = quantSalgados;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    
    
}
