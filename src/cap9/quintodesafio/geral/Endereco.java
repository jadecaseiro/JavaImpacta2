package cap9.quintodesafio.geral;

public final class Endereco {
	String logradouro;
	int nr;
	String bairro;
	
	public Endereco(){}
	
	public Endereco(String logradouro, int nr, String bairro) {
		this.logradouro = logradouro;
		this.nr = nr;
		this.bairro = bairro;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setEndereco(String logradouro, int nr, String bairro){
		setLogradouro(logradouro);
		setNr(nr);
		setBairro(bairro);
	}
	
	public String getDados(){
		return getLogradouro() + " - " + getNr() + " - " + getBairro();
	}
	
}
