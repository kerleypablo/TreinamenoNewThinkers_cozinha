class Main {
  public static void main(String[] args) {
    
    Cozinha cozMin = new Cozinha();

    cozMin.setTipo("Mineira");
    cozMin.setnumeroPratos(10);
    cozMin.setNumeroCozinheiro(5);
    cozMin.setTempo(20);
    cozMin.setHoraAbre(14);
    cozMin.setHoraFecha(20);
    cozMin.setPratoPrincp("feijoada");


    Ingredientes feijao = new Ingredientes("feijao",17,8,2023);
    Ingredientes farinha = new Ingredientes("farinha",15,10,2022);
    Ingredientes arroz = new Ingredientes("arroz",5,3,2023);
    Ingredientes carneP = new Ingredientes("Carne de porco",17,8,2023);
    Ingredientes linguiça = new Ingredientes("linguiça",05,8,2023);
    
    cozMin.setIngrediente(feijao);
    cozMin.setIngrediente(farinha);
    cozMin.setIngrediente(arroz);
    cozMin.setIngrediente(carneP);
    cozMin.setIngrediente(linguiça);
    
    
    
    Funcionario Paola = new Funcionario("Paola","chefe decozinha");
    Funcionario Marcelo = new Funcionario("Marcelo","Sub-chefe");
    Funcionario Natalia = new Funcionario("Natalia","cozinheira");
    Funcionario Lucas = new Funcionario("Lucas", "cozinheiro");
   
    
    cozMin.setFuncionario(Paola);
    cozMin.setFuncionario(Marcelo);
    cozMin.setFuncionario(Natalia);
    cozMin.setFuncionario(Lucas);


    Cozinha cozIta = new Cozinha();
    cozIta.setTipo("Italiana");
    cozIta.setnumeroPratos(20);
    cozIta.setNumeroCozinheiro(8);
    cozIta.setTempo(15);
    cozIta.setHoraAbre(13);
    cozIta.setHoraFecha(22);
    cozIta.setPratoPrincp("Macarronada");

    
    Funcionario Jacan = new Funcionario("Jacan","chefe decozinha");
    Funcionario Bruna = new Funcionario("Bruna","cozinheira");
  
    cozIta.setFuncionario(Jacan);
    cozIta.setFuncionario(Bruna);

    Ingredientes molho = new Ingredientes("molho",17,8,2023);
    Ingredientes macarrao = new Ingredientes("macarrao",15,10,2022);
    Ingredientes carne = new Ingredientes("carne",5,3,2023);

    
    cozIta.setIngrediente(molho);
    cozIta.setIngrediente(macarrao);
    cozIta.setIngrediente(carne);


    
    Cozinha cozChi = new Cozinha();
    cozChi.setTipo("Chinesa");
    cozChi.setnumeroPratos(15);
    cozChi.setNumeroCozinheiro(3);
    cozChi.setTempo(20);
    cozChi.setHoraAbre(10);
    cozChi.setHoraFecha(21);
    cozIta.setPratoPrincp("Yakisoba");
    
    Funcionario fogaca = new Funcionario("fogaça","chefe decozinha");
    Funcionario Breno = new Funcionario("Breno","cozinheira");
    Funcionario Lorena = new Funcionario("Lorena","cozinheira");
  
    cozChi.setFuncionario(fogaca);
    cozChi.setFuncionario(Breno);
    cozChi.setFuncionario(Lorena);
    
    
    Ingredientes champinhon = new Ingredientes("champinhon",17,8,2023);
    Ingredientes brocolis = new Ingredientes("brocolis",15,10,2022);
   

    
    cozChi.setIngrediente(champinhon);
    cozChi.setIngrediente(brocolis);
    cozChi.setIngrediente(macarrao);
    cozChi.setIngrediente(carne);

    
    
    System.out.println(feijao.validade);
   



  }
}