package efrain;

public class Professor extends Pessoa{

    public String nome;
    public String codigo;

    ////get e set
    public String getnome() {
        return nome;
    }
    public Void setnome() {
        this.nome = nome;
    }
    public String getcodigo() {
        return codigo;
    }
    public Void setcodigo() {
        this.codigo = codigo;
    

    //construtor
    
    public Professor(String nome){
    super(nome);
    this.nome = nome;
    this.codigo = codigo;


    }
}
