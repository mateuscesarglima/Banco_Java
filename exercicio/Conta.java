package exercicio;
import cidadao.Pessoa;
public abstract class Conta {
	
	
	private String num_conta;
	private String senha;
	

	public abstract void calcularRendimento();
	public abstract String getTipo();
	
	

	public String getNum_conta() {
		return num_conta;
	}
	public void setNum_conta(String num_conta) {
		this.num_conta = num_conta;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean equals(Object o) {
        if (o instanceof Conta) {
            Conta outraConta = (Conta) o;
            if (getNum_conta() != null)
                return getNum_conta().equals(outraConta.getNum_conta());
        }

        return false;
    }
}
