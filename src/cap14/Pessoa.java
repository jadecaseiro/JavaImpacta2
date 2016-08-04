package cap14;

public class Pessoa {
    String nome;
    String RG;

    Pessoa(String nome, String RG){
    	setNome(nome);
    	setRG(RG);
    }
    
  public boolean equals(Object obj) {

      if((obj instanceof Pessoa) && (((Pessoa)obj)).getRG()==this.getRG()){
          return true;
      }
      else return false;
  }
    
    
  
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		return result;
	}





//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Pessoa other = (Pessoa) obj;
//		if (RG == null) {
//			if (other.RG != null)
//				return false;
//		} else if (!RG.equals(other.RG))
//			return false;
//		return true;
//	}





	public void setRG(String RG) {
        this.RG = RG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }
    
}