package cidadao;
import cidade.Endere�o;
import java.util.Date;
import java.util.Objects;
import exercicio.Conta;
public class Pessoa {
	
	private String nome;
	private String cpf;
	private	String nascimento;
	private Endere�o endere�o;
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
	public Endere�o getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(Endere�o endere�o) {
		this.endere�o = endere�o;
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
	                "RUA: " + endere�o.getRua() + "\n" +
	        		"N� casa: " + endere�o.getNumero() + "\n" +
	        		"CEP: " + endere�o.getCep() + "\n" +
	        		"AG�NCIA: 0631" + "\n";
	        		
	    }	
}
