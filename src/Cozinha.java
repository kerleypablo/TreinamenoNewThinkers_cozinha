import java.util.ArrayList;
import java.util.List;



class Cozinha {

  private int numeroPratos;
  private String tipo;
  private int numeroCozinheiro;
  private int tempo;
  private int horaAbre;
  private int horaFecha;
  private String pratoPrincp;
  private List<Ingredientes> ingrediente = new ArrayList<Ingredientes>();
  private List<Funcionario> funcionarios = new ArrayList<Funcionario>();;
 


  
  public int getnumeroPratos(){
    return numeroPratos;
  }

  public void setnumeroPratos(int numeroPratos){
    this.numeroPratos = numeroPratos;
  }
  
  public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroCozinheiro() {
		return numeroCozinheiro;
	}

	public void setNumeroCozinheiro(int numeroCozinheiro) {
		this.numeroCozinheiro = numeroCozinheiro;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getHoraAbre() {
		return horaAbre;
	}

	public void setHoraAbre(int horaAbre) {
		this.horaAbre = horaAbre;
	}

	public int getHoraFecha() {
		return horaFecha;
	}

	public void setHoraFecha(int horaFecha) {
		this.horaFecha = horaFecha;
	}

	public String getPratoPrincp() {
		return pratoPrincp;
	}

	public void setPratoPrincp(String pratoPrincp) {
		this.pratoPrincp = pratoPrincp;
	}

	public List<Ingredientes> getIngredientes() {
		return ingrediente;
	}

	public void setIngrediente(Ingredientes ing) {
		this.ingrediente.add(ing);
	}

	public List<Funcionario> getFuncionario() {
		return funcionarios;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}




	

  void prepararPratos(){


  }


  void lavarLouca(){
    
  }




}