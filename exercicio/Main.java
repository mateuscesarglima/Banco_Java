package exercicio;
import cidadao.CadastroPessoa;
import cidadao.Pessoa;
import cidade.Endereço;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		CadastroPessoa cadastro = new CadastroPessoa();
		
		int opc = 0;
		while(opc != 8) {
		System.out.println("\n" + "-------Seja bem vindo ao Dinheirus Bank--------" + "\n");
		System.out.println("==========  Informe a operação que deseja:  ==========" + "\n");
		System.out.println("	   [1] Criar conta bancária");
		System.out.println("	   [2] Ver saldo conta");
		System.out.println("	   [3] Ver dados cliente");
		System.out.println("	   [4] Depositar");
		System.out.println("	   [5] Sacar");
		System.out.println("	   [6] Transferir");
		System.out.println("	   [7] Encerrar Conta");
		System.out.println("	   [8] Sair" + "\n");
		System.out.println("Digite a opção que deseja: ");
		opc = scanner.nextInt();
		
		System.out.println("\n");
		
		if(opc == 1) {
			
			Pessoa pessoa = new Pessoa();
			Endereço endereço = new Endereço();
			Conta conta = new Conta();
			
		
			System.out.println("============ Criar Conta Bancária ===========");
			System.out.println("Por favor, em vez de apertar o espaço no teclado, colocar o símbolo '_' como espaçamento. EXEMPLO: 'Mateus_Cesar'" + "\n\n");
			
			
			System.out.println("Informe o seu nome: ");
			String nome = scanner.next();
			pessoa.setNome(nome);
			
			
			System.out.println("Informe o seu CPF: ");
			String cpf = scanner.next();
			pessoa.setCpf(cpf);
			

			System.out.println("Informe o número que voce deseja que seja a sua conta: ");
			String num_conta = scanner.next();
			conta.setNum_conta(num_conta);
			
			System.out.println("Informe sua data de nascimento");
			String data_nascimento = scanner.next();
			pessoa.setNascimento(data_nascimento);
			
			
			
			System.out.println("Informe a sua rua: ");
			String rua = scanner.next();
			endereço.setRua(rua);
			
			
		
			System.out.println("Informe o número da sua casa: ");
			int numero = scanner.nextInt();
			endereço.setNumero(numero);
			
			scanner.nextLine();
			
			System.out.println("Informe o seu cep: ");
			String cep = scanner.nextLine();
			endereço.setCep(cep);
			
			
			pessoa.setConta(conta);
			pessoa.setEndereço(endereço);
			cadastro.registrar(pessoa);

			
			}else if(opc == 2){
				
				System.out.println("======== SALDO CONTA =======");
				System.out.println("Informe a conta que você deseja ver o saldo: ");
				String conta = scanner.next();
				System.out.println("\n");
				for(Pessoa pessoa: cadastro.getPessoas()) {
					if(conta.equals(pessoa.getConta().getNum_conta())) {
						System.out.println("NOME: " + pessoa.getNome());
						System.out.println("SALDO: " + pessoa.getConta().getSaldo() + "\n");
					}
				}
				
				
			}else if(opc == 3) {
				System.out.println("======= DADOS CLIENTE =======");
				System.out.println("Informe o seu CPF:  ");
				String cpf = scanner.next();
				
				
					for(Pessoa pessoa: cadastro.getPessoas()) {
						
							
						if(cpf.equals(pessoa.getCpf())) {		
							System.out.println("DADOS: "+ " \n" + pessoa.toString());
	
						}
				}
		
				
			}else if(opc == 4) {
				
				System.out.println("======= DEPOSITAR =======" + "\n");
				System.out.println("Informe a conta em que você deseja depositar: ");
				String conta = scanner.next();
				System.out.println("Informe o valor a ser depositado: ");
				double valor = scanner.nextFloat();
				try {
					for(Pessoa pessoa: cadastro.getPessoas()) {
						if(conta.equals(pessoa.getConta().getNum_conta())) {
							pessoa.getConta().depositar(valor);
						}
					}
				}catch(Exception e) {
					System.out.println("Deu erro no depósito");
				}
			}else if(opc == 5) {
					System.out.println("======= SACAR =======" + "\n");
					System.out.println("Informe a conta que você deseja sacar dinheiro: ");
					String conta = scanner.next();
					System.out.println("Informe o valor a ser sacado: ");
					double valor = scanner.nextFloat();
					try {
						for(Pessoa pessoa: cadastro.getPessoas()) {
							if(conta.equals(pessoa.getConta().getNum_conta())) {
								pessoa.getConta().sacar(valor);
							}
						}
					}catch (Exception e) {
						System.out.println("Erro no saque, favor verificar seu saldo");
				}
			}else if(opc == 6 ) {
				System.out.println("========== TRANSFERÊNCIA ==========");
					System.out.println("Informe a sua conta: ");
					String conta = scanner.next();
					System.out.println("Informe a conta para qual você deseja transferir: ");
					String conta2 = scanner.next();
					System.out.println("Informe o valor a ser transferido: ");
					double valor = scanner.nextFloat();
					
					try {
						for(Pessoa pessoa: cadastro.getPessoas()) {
							
							if(conta.equals(pessoa.getConta().getNum_conta())) {
								pessoa.getConta().sacar(valor);
							}
								if(conta2.equals(pessoa.getConta().getNum_conta())) {
									pessoa.getConta().depositar(valor);
									System.out.println("Transferência realizada com sucesso!");
								}
						}
					}catch (Exception e) {
						System.out.println("Saldo insuficiente");
					}	
				}else if(opc == 7) {
					System.out.println("======= ENCERRAR CONTA ========");
					System.out.println("Informe a conta que você deseja encerrar: ");
					String conta = scanner.next();
					
					for(Pessoa pessoa: cadastro.getPessoas()) {
						if(conta.equals(pessoa.getConta().getNum_conta())) {
							cadastro.getPessoas().remove(pessoa);
							System.out.println("CONTA ENCERRADA COM SUCESSO!");
						}
					}			
				}
			}
		}
	}


	
			
		
	

