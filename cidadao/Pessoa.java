package cidadao;
import cidade.Endere�o;
import exercicio.ContaPoupan�a;
import exercicio.ContaCorrente;
import java.util.Date;
import java.util.Objects;
import exercicio.Conta;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private	String nascimento;
	private Endere�o endere�o;
	private ContaCorrente corrente;
	private ContaPoupan�a poupan�a;
	
	
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

	public boolean equals(Object o) {
	        if (o instanceof Pessoa) {
	            Pessoa outraPessoa = (Pessoa) o;
	            if (getNome() != null)
	                return getNome().equals(outraPessoa.getNome());
	        }
	        return false;
	    }
	
	
	public ContaPoupan�a getPoupan�a() {
		return poupan�a;
	}
	public void setPoupan�a(ContaPoupan�a poupan�a) {
		this.poupan�a = poupan�a;
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
	                "RUA: " + endere�o.getRua() + "\n" +
	        		"N� casa: " + endere�o.getNumero() + "\n" +
	        		"CEP: " + endere�o.getCep() + "\n" +
	        		"AG�NCIA Dinheirus Bank: 0631" + "\n" + 
	        		"N� CONTA: " + poupan�a.getNum_conta();
	    }	
	public String toString2() {
		
        return
               "NOME: " + nome + "\n"+
                "CPF: " + cpf + "\n" +
                "DATA NASCIMENTO: " + nascimento + "\n" +
                "RUA: " + endere�o.getRua() + "\n" +
        		"N� casa: " + endere�o.getNumero() + "\n" +
        		"CEP: " + endere�o.getCep() + "\n" +
        		"AG�NCIA: 0631" + "\n" + 
        		"N� CONTA: " + corrente.getNum_conta() + "\n" +
        		"TIPO: " + corrente.getTipo(); 
    }	
}
