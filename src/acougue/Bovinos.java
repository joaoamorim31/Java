package acougue;

public class Bovinos {
    private int codigo;
    private String nome;
    private double estoque;
    private String descricao;
    protected double preco ;

    //construtor
    public Bovinos(int codigo, String nome, double estoque, double  preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    //Metodos para alterar o nome
    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    //Metodos para alterar dados do estoque
    public void alterarDados(double novoEstoque) {
        this.estoque = novoEstoque;
    }

    //Metodo para exibir dados
    public void mostrarDados() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Etoque: " + this.estoque + "Kg");
        System.out.println("Descrição: " + this.descricao);
    }

    //Metodo para venda do mes
    public void saida(double venda) {
        if (venda > estoque) {
            System.out.println("Valor Invalido!");
        } else {
            estoque -= venda;
        }
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
