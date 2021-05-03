package efrain;

public class aluno extends Pessoa{

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
    }


    //construtor

    public aluno(String nome){
    super(nome);
    this.nome = nome;
    this.codigo = codigo;
    
}
