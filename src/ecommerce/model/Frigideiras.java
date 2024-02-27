package ecommerce.model;

public class Frigideiras extends Produto {

    private String ferro;

    public Frigideiras(int id, String nome, int tipo, float preco, String ferro) {
        super(id, nome, tipo, preco);
        this.ferro = ferro;
    }

    public String getFerro() {
        return ferro;
    }

    public void setFerro(String ferro) {
        this.ferro = ferro;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Essa Frigideira é do modelo de ferro.");
    }
}