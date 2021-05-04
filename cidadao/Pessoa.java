package cidadao;
import cidade.Endereço;
import exercicio.ContaPoupança;
import exercicio.ContaCorrente;
import java.util.Date;
import java.util.Objects;
import exercicio.Conta;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private	String nascimento;
	private Endereço endereço;
	private ContaCorrente corrente;
	private ContaPoupança poupança;
	
	
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

	public boolean equals(Object o) {
	        if (o instanceof Pessoa) {
	            Pessoa outraPessoa = (Pessoa) o;
	            if (getNome() != null)
	                return getNome().equals(outraPessoa.getNome());
	        }
	        return false;
	    }
	
	
	public ContaPoupança getPoupança() {
		return poupança;
	}
	public void setPoupança(ContaPoupança poupança) {
		this.poupança = poupança;
	}
	public ContaCorrente getCorrente() {
		return corrente;
	}
	public void setCorrente(ContaCorrente corrente) {
		this.corrente = corrente;
	}
	public String toString1() {
		
	        return
	               "NOME: " + nome + "\n"+
	                "CPF: " + cpf + "\n" +
	                "DATA NASCIMENTO: " + nascimento + "\n" +
	                "RUA: " + endereço.getRua() + "\n" +
	        		"Nº casa: " + endereço.getNumero() + "\n" +
	        		"CEP: " + endereço.getCep() + "\n" +
	        		"AGÊNCIA Dinheirus Bank: 0631" + "\n" + 
	        		"Nº CONTA: " + poupança.getNum_conta();
	    }	
	public String toString2() {
		
        return
               "NOME: " + nome + "\n"+
                "CPF: " + cpf + "\n" +
                "DATA NASCIMENTO: " + nascimento + "\n" +
                "RUA: " + endereço.getRua() + "\n" +
        		"Nº casa: " + endereço.getNumero() + "\n" +
        		"CEP: " + endereço.getCep() + "\n" +
        		"AGÊNCIA: 0631" + "\n" + 
        		"Nº CONTA: " + corrente.getNum_conta() + "\n" +
        		"TIPO: " + corrente.getTipo(); 
    }	
}
