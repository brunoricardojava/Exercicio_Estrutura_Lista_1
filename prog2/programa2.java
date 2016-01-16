public class programa2{
  public static void main(String args[]) {

    Porta obj1 = new Porta();

    obj1.abre();

    obj1.setCor("Amarela");

    obj1.setDimensoes(5,18,1);

    obj1.mostraPorta();
  }
}

class Porta{
	//Atributos
	private boolean aberta;
	private String cor;
  private int dimensaoX;
  private int dimensaoY;
  private int dimensaoZ;

	//Métodos

	void abre(){
		this.aberta = true;
	}

  void fecha(){
    this.aberta = false;
  }

  void setCor(String Cor){
    this.cor = Cor;
  }

  boolean estaAberta(){
    return this.aberta;
  }

  void setDimensoes(int x, int y, int z){
    this.dimensaoX = x;
    this.dimensaoY = y;
    this.dimensaoZ = z;
  }

  void mostraPorta(){

    if(this.aberta)System.out.println("A porta esta aberta.");
    else System.out.println("A porta esta fechada.");

    System.out.println("A porta eh: "+this.cor);

    System.out.println("As dimensoes da porta sao: x = "+this.dimensaoX+" y = "+this.dimensaoY+" z = "+dimensaoZ);
  }
}

