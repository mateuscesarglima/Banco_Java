package exercicio;
import cidadao.CadastroPessoa;
import cidadao.Pessoa;
import cidade.Endere�o;
import java.util.Scanner;
import java.util.Random;
public class Main {
	
	private static final String[] CONTAS = {"001","002", "003", "004", "005", "006","007","010","011","012","013","015","020","030"};
    private static final Random RANDOM = new Random();
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		CadastroPessoa cadastro = new CadastroPessoa();
		
		int opc = 0;
		while(opc != 8) {
		System.out.println("\n" + "-------Seja bem vindo ao Dinheirus Bank--------" + "\n");
		System.out.println("==========  Informe a opera��o que deseja:  ==========" + "\n");
		System.out.println("	   [1] Criar conta banc�ria");
		System.out.println("	   [2] Ver saldo conta");
		System.out.println("	   [3] Ver dados cliente");
		System.out.println("	   [4] Depositar");
		System.out.println("	   [5] Sacar");
		System.out.println("	   [6] Transferir");
		System.out.println("	   [7] Encerrar Conta");
		System.out.println("	   [8] Sair" + "\n");
		System.out.println("Digite a op��o que deseja: ");
		opc = scanner.nextInt();
		
		System.out.println("\n");
		
		if(opc == 1) {
			
			Pessoa pessoa = new Pessoa();
			Endere�o endere�o = new Endere�o();
			ContaPoupan�a cp = new ContaPoupan�a();
			ContaCorrente cc = new ContaCorrente();
		
			System.out.println("============ Criar Conta Banc�ria ===========");
			System.out.println("Por favor, em vez de apertar o espa�o no teclado, colocar o s�mbolo '_' como espa�amento. EXEMPLO: 'Mateus_Cesar'" + "\n\n");
			
			
			System.out.println("Informe o seu nome: ");
			String nome = scanner.next();
			pessoa.setNome(nome);
			
			
			System.out.println("Informe o seu CPF: ");
			String cpf = scanner.next();
			pessoa.setCpf(cpf);
			
			
			System.out.println("Informe sua data de nascimento");
			String data_nascimento = scanner.next();
			pessoa.setNascimento(data_nascimento);
			
			
			
			System.out.println("Informe a sua rua: ");
			String rua = scanner.next();
			endere�o.setRua(rua);
			
			
		
			System.out.println("Informe o n�mero da sua casa: ");
			int numero = scanner.nextInt();
			endere�o.setNumero(numero);
			
			scanner.nextLine();
			
			System.out.println("Informe o seu cep: ");
			String cep = scanner.next();
			endere�o.setCep(cep);
			
	
			System.out.println("Informe o tipo de conta que voc� deseja: " + "\n\n" + "[1] CONTA POUPAN�A" + "\n" + "[2] CONTA CORRENTE");
			
			int tipo = scanner.nextInt();
			
			if(tipo == 1) {
				System.out.println("===== CONTA POUPAN�A =======");
				
				System.out.println("Informe a senha da sua conta: ");
				String senha = scanner.next();
				cp.setSenha(senha);
				
			
				cp.setSelic(10);
				cp.setNum_conta(contaAleatoria());
				pessoa.setPoupan�a(cp);
				pessoa.setEndere�o(endere�o);
				cadastro.registrar(pessoa);
				
				System.out.println("O n�mero da sua conta �: " + cp.getNum_conta());
				
			}else if(tipo == 2) {
				
				System.out.println("Informe a senha da sua conta: ");
				String senha = scanner.next();
				cc.setSenha(senha);
				
		
				
				cc.setNum_conta(contaAleatoria());
				pessoa.setCorrente(cc);
				pessoa.setEndere�o(endere�o);
				cadastro.registrar(pessoa);
				
				System.out.println("O n�mero da sua conta �: " + cc.getNum_conta());
			}
			
			}else if(opc == 2){
				
				System.out.println("======== SALDO CONTA =======" + "\n");
				System.out.println("Digite" + "\n" + "[1] - CONTA POUPAN�A" + "\n" + "[2] - CONTA CORRENTE");
				int tipo = scanner.nextInt();
				System.out.println("Informe a conta que voc� deseja ver o saldo: ");
				String conta = scanner.next();
				System.out.println("Informe a sua senha: ");
				String senha = scanner.next();
				System.out.println("\n");
				
				for(Pessoa pessoa: cadastro.getPessoas()) {
					if(tipo == 1) {
						if(conta.equals(pessoa.getPoupan�a().getNum_conta()) ) {
							if(senha.equals(pessoa.getPoupan�a().getSenha())) {
								
								System.out.println("NOME: " + pessoa.getNome());
								System.out.println("SALDO: " + pessoa.getPoupan�a().getSaldo());
								
							}
						}
					}else if (tipo == 2) {
						if(conta.equals(pessoa.getCorrente().getNum_conta())){
							if(senha.equals(pessoa.getCorrente().getSenha())) {
								
								System.out.println("NOME: " + pessoa.getNome());
								System.out.println("SALDO: " + pessoa.getCorrente().getSaldo());
							}
						}
					}
				}
				
			}else if(opc == 3) {
				System.out.println("======= DADOS CLIENTE =======");
				System.out.println("Informe a conta que voc� deseja ver o saldo: ");
				String conta = scanner.next();
				System.out.println("Informe a senha da sua conta: " + "\n");
				String senha = scanner.next();
				System.out.println("Digite" + "\n" + "[1] - CONTA POUPAN�A" + "\n" + "[2] - CONTA CORRENTE" );
				int tipo = scanner.nextInt();

					for(Pessoa pessoa: cadastro.getPessoas()) {
						
						if(tipo == 1){
							if(conta.equals(pessoa.getPoupan�a().getNum_conta())) {
								if(senha.equals(pessoa.getPoupan�a().getSenha())) {
									System.out.println(pessoa.toString1());
								}
							}
						}else if(tipo == 2){
							if(conta.equals(pessoa.getCorrente().getNum_conta())) {
								if(senha.equals(pessoa.getCorrente().getSenha())) {
									System.out.println(pessoa.toString2());
								}
							}
						}
					}		
			}else if(opc == 4) {
				
				System.out.println("======= DEPOSITAR =======" + "\n");
				
				System.out.println("Digite" + "\n" + "[1] - CONTA POUPAN�A" + "\n" + "[2] - CONTA CORRENTE");
				int tipo = scanner.nextInt();
				
				System.out.println("Informe a conta em que voc� deseja depositar: ");
				String conta = scanner.next();
				
				System.out.println("Informe o valor a ser depositado: ");
				double valor = scanner.nextFloat(); 
				
				
				
				try {
					for(Pessoa pessoa: cadastro.getPessoas()) {
						if(tipo == 1) {
							if(conta.equals(pessoa.getPoupan�a().getNum_conta())) {
								pessoa.getPoupan�a().depositar(valor);
							}
						}else if(tipo == 2) {
							if(conta.equals(pessoa.getCorrente().getNum_conta())) {
								pessoa.getCorrente().depositar(valor);
							}
						}
					}
					
					System.out.println("Dep�sito realizado com sucesso!");
				}catch(Exception e) {
					System.out.println("Deu erro no dep�sito");
				}
				
			}else if(opc == 5) {
					System.out.println("======= SACAR =======" + "\n");
					System.out.println("Digite" + "\n" + "[1] - CONTA POUPAN�A" + "\n" + "[2] - CONTA CORRENTE");
					int tipo = scanner.nextInt();
					System.out.println("Informe a conta que voc� deseja sacar dinheiro: ");
					String conta = scanner.next();
					System.out.println("Informe o valor a ser sacado: ");
					double valor = scanner.nextFloat();
					System.out.println("Informe a sua senha para confirmar a opera��o: ");
					String senha = scanner.nextLine();
					try {
						for(Pessoa pessoa: cadastro.getPessoas()) {
							if(tipo == 1) {
								if(conta.equals(pessoa.getPoupan�a().getNum_conta())) {
									if(senha.equals(pessoa.getPoupan�a().getSenha())) {
										pessoa.getPoupan�a().sacar(valor);
									}else{
										System.out.println("Senha incorreta, tente novamente.");
									}
								}else {
									System.out.println("Dados incorretos, tente novamente.");
								}
							}else if(tipo == 2) {
								if(conta.equals(pessoa.getCorrente().getNum_conta())) {
									if(senha.equals(pessoa.getCorrente().getSenha())) {
										pessoa.getCorrente().sacar(valor);
									}
								}
							}
						}
					}catch (Exception e) {
						System.out.println("Erro no saque, favor verificar seu saldo");
				}
			}else if(opc == 6 ) {
				System.out.println("========== TRANSFER�NCIA ==========");
					System.out.println("Informe o seu CPF");
					String cpf = scanner.next();
					System.out.println("Informe a sua conta: ");
					String conta = scanner.next();
					System.out.println("Informe a conta para qual voc� deseja transferir: ");
					String conta2 = scanner.next();
					System.out.println("Informe o valor a ser transferido: ");
					double valor = scanner.nextFloat();
					System.out.println("Informe sua senha para confirma a transa��o: ");
					String senha = scanner.next();
					
					try {
						for(Pessoa pessoa: cadastro.getPessoas()) {
							
							if(cpf.equals(pessoa.getCpf())) {
								if(senha.equals(pessoa.getPoupan�a().getSenha())) {
									pessoa.getPoupan�a().sacar(valor);
								}		
							}
								if(conta2.equals(pessoa.getCorrente().getNum_conta())) {
									pessoa.getCorrente().depositar(valor);
									System.out.println("Transfer�ncia realizada com sucesso!");
								
							}
						}
					}catch (Exception e) {
						System.out.println("Saldo insuficiente");
					}	
				}else if(opc == 7) {
					System.out.println("======= ENCERRAR CONTA ========");
					System.out.println("Digite" + "\n" + "[1] - CONTA POUPAN�A" + "\n" + "[2] - CONTA CORRENTE");
					int tipo = scanner.nextInt();
					System.out.println("Informe a conta que voc� deseja encerrar: ");
					String conta = scanner.next();
					System.out.println("Informe a senha da conta para confirmar a a��o: ");
					String senha = scanner.next();
					
					for(Pessoa pessoa: cadastro.getPessoas()) {
						if(tipo == 1 ) {
							if(conta.equals(pessoa.getPoupan�a().getNum_conta())) {
								if(senha.equals(pessoa.getPoupan�a().getSenha())){
									cadastro.getPessoas().remove(pessoa);
									System.out.println("CONTA REMOVIDA COM SUCESSO!");
								}
							}
						}else if(tipo == 2) {
							if(conta.equals(pessoa.getCorrente().getNum_conta())) {
								if(senha.equals(pessoa.getCorrente().getSenha())){
									cadastro.getPessoas().remove(pessoa);
									System.out.println("CONTA REMOVIDA COM SUCESSO!");
								}
							}
						}
					}			
				}
			}
		}
		public static String contaAleatoria() {
			return CONTAS[RANDOM.nextInt(CONTAS.length)];
		}
	}


	
			
		
	

