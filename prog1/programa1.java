public class programa1{
  public static void main(String args[]) {
    
    Pessoa obj1 = new Pessoa();

    obj1.fazAniversario();

    obj1.mostraIdade();
  }
}

class Pessoa{
	//Atributos
	private String nome;
	private short idade;

	//Métodos

	void fazAniversario(){
		this.idade += 1;
	}

  void mostraIdade(){
    System.out.println(this.idade);
  }
}

