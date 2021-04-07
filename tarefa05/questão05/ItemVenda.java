package tarefa05.questão05;

public class ItemVenda implements Recebivel{

    private String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemVenda(String produto, int quantidade, double precoUnitario){
        this.setProduto(produto);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double totalizarReceita() {
        return getPrecoUnitario() * getQuantidade();
    }
}
