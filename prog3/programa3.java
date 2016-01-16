public class programa3{
  public static void main(String args[]) {
    Casa obj1 = new Casa();

    obj1.pinta("Amarela");

    obj1.setPortas(true,true,true);

    obj1.mostraEstado();
  }
}

class Casa{
	//Atributos
	private String cor;
	private boolean porta1;
  private boolean porta2;
  private boolean porta3;

	//Métodos

	void pinta(String Cor){
		this.cor = Cor;
	}

  int quantasPortasEstaoAbertas(){
    byte cont=0;

    if(this.porta1) cont++;
    if(this.porta2) cont++;
    if(this.porta3) cont++;

    return cont;
  }

  void setPortas(boolean port1,boolean port2, boolean port3){
    this.porta1 = port1;
    this.porta2 = port2;
    this.porta3 = port3;
  }

  void mostraEstado(){
    System.out.println("A cor da porta he: "+this.cor);

    System.out.println(this.quantasPortasEstaoAbertas()+" Porta(s) esta(ao) aberta(s).");

  }
}

