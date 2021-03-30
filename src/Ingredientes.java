
import java.util.Calendar;
import java.util.Date;


class Ingredientes {

  private String nome;
  Date validade = Calendar.getInstance().getTime();
  
  
  
  
  public Ingredientes(String nome , int d , int m , int y  ) {
	  this.nome = nome ;
	  setValidade(d, m, y);
  }
  
  
  public Ingredientes() {
	  
  }
  
  
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}


public int getValidade() {
	return validade.getDate();
}

public void setValidade(int d, int m , int y) {
	validade.setDate(d);
	validade.setMonth(m);
	validade.setYear(y);
	
}





}