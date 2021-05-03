package efrain;

public class Autor extends Pessoa{

    public String nacionalidade;


    ////get e set
    
     public String getnacionalidade(){
        return nacionalidade;
     }
     public String setnacionalidade(){
        this.nacionalidade;
     }


    //construtor
    public Autor(String nacionalidade,String nome){
    super(nacionalidade);
    this.nacionalidade = nacionalidade;
    }
}
