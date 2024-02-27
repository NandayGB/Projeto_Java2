package ecommerce.model;

public class Panelas extends Produto {

    private String inox;

    public Panelas(int id, String nome, int tipo, float preco, String inox) {
        super(id, nome, tipo, preco);
        this.inox = inox;    
    }

    public String getInox() {
        return inox;
    }

    public void setInox(String inox) {
        this.inox = inox;
    }
    
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Panela Inox.");
    }
}
