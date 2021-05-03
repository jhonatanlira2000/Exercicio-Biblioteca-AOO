package efrain;

public class Livro extends Pessoa{

    public String nome;
    public String autor;
    public Pessoa emprestadoPor;


    ////get e set
     
    public String getnome(){
     return nome;

    }
    public Void setnome(){
     this.nome = nome;
    }
    
    public String getautor(){
     return autor;
    }
    public String setautor(){
     this.autor = autor;
    }
    public String getemprestadoPor(){
     return emprestadoPor;
    }
    public String setemprestadoPor(){
     this.emprestadoPor = emprestadoPor;
    }


    //construtor
    public Livro(String nome, String autor, Pessoa emprestadoPor){
    super(nome,autor,emprestadoPor);
    this.nome = nome;
    this.autor = autor;
    this.emprestadoPor = emprestadoPor;
    
}
