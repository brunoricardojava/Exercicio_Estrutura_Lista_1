public class Exercicio{
  public static void main(String args[]) {

  	funcionario objeto1 = new funcionario();
  	funcionario objeto2 = new funcionario();
  	
  	//objeto1.nome = "Bruno";
  	objeto1.mudaNome("Bruno");

  	//objeto1.departamento = "D-2";
  	objeto1.mudaDepartamento("D-2");

  	//objeto1.salario = 20000.0;
  	objeto1.mudaSalario(20000.0);

  	//objeto1.data = "08/09/2010";
  	objeto1.mudaData("08/09/2010");

  	//objeto1.rg = "092837493834";
  	objeto1.mudarg("092902839230");

  	objeto1.recebeAumento(1000.0);

  	objeto1.mostra();
  	//objeto2.mostra();


  }
}

class funcionario{
	//Atributos
	private String nome;
	private String departamento;
	private double salario;
	private String data;
	private String rg;

	//Métodos

	void recebeAumento(double aumento){
		this.salario += aumento;
	}

	double calculaGanhoAnual(){
		return this.salario*12;
	}

	//Metodo Get
	void mostra(){
		System.out.println("Ganho: " + this.calculaGanhoAnual());
  		System.out.println("Nome: " + this.nome);
  		System.out.println("Departamento: " + this.departamento);
  		System.out.println("Data: " + this.data);
  		System.out.println("RG: " + this.rg);
  		System.out.println("Salario: " + this.salario);
  	}

  	//Metodo Set
  	void mudaNome(String nome){
  		this.nome = nome;
  	}

  	void mudaDepartamento(String departamento){
  		this.departamento = departamento;
  	}
  	void mudaSalario(double salario){
  		this.salario = salario;
  	}

  	void mudaData(String data){
  		this.data = data;
  	}

  	void mudarg(String rg){
  		this.rg = rg;
  	}
}

