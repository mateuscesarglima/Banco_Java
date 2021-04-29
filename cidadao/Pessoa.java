package cidadao;
import cidade.Endereço;
import java.util.Date;
import java.util.Objects;
import exercicio.Conta;
public class Pessoa {
	
	private String nome;
	private String cpf;
	private	String nascimento;
	private Endereço endereço;
	private Conta conta;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public Endereço getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public boolean equals(Object o) {
	        if (o instanceof Pessoa) {
	            Pessoa outraPessoa = (Pessoa) o;
	            if (getNome() != null)
	                return getNome().equals(outraPessoa.getNome());
	        }

	        return false;
	    }
	
	public String toString() {
		
	        return
	               "NOME: " + nome + "\n"+
	                "CPF: " + cpf + "\n" +
	                "DATA NASCIMENTO: " + nascimento + "\n" +
	                "RUA: " + endereço.getRua() + "\n" +
	        		"Nº casa: " + endereço.getNumero() + "\n" +
	        		"CEP: " + endereço.getCep() + "\n" +
	        		"AGÊNCIA: 0631" + "\n";
	        		
	    }	
}
