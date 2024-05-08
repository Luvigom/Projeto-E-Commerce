package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.model.ecommerce;
import ecommerce.model.ProdutoEntrega;
import ecommerce.model.ProdutoRetirada;

public class Menu {

	public static void main(String[] args) {
		
		//Teste da Classe ecommerce
			ecommerce ec1 = new ProdutoRetirada (708,2, "Stephanie Goulart", "Sexta");
			ec1.visualizar();
			
			ecommerce ec2 = new ProdutoEntrega (709,1, "Renan Magalhães",5);
			ec2.visualizar();

				Scanner leia = new Scanner(System.in);

				int opcao;

				while (true) {

					System.out.println(Cores.TEXT_PURPLE_BOLD + "*****************************************************");
					System.out.println("                                                     ");
					System.out.println(Cores.TEXT_YELLOW_BOLD + "             E-COMMERCE Logistics                     ");
					System.out.println("                                                     ");
					System.out.println(Cores.TEXT_PURPLE_BOLD + "*****************************************************");
					System.out.println("                                                     ");
					System.out.println(Cores.TEXT_BLUE_BOLD + "            1 - Listar todo Mundo                    ");
					System.out.println("            2 - Listar por ID                        ");
					System.out.println("            3 - Cadastrar                            ");
					System.out.println(Cores.TEXT_GREEN + "            4 - Atualizar                            " + Cores.TEXT_RESET);
					System.out.println(Cores.TEXT_RED + "            5 - Deletar                              " + Cores.TEXT_RESET);
					System.out.println("                                                     ");
					System.out.println(Cores.TEXT_PURPLE_BOLD + "*****************************************************");
					System.out.println(Cores.TEXT_BLUE_BOLD + "\n          Escolha a opção desejada:                            ");
					System.out.println("                                                     " + Cores.TEXT_RESET);

					try {
					opcao = leia.nextInt();
					}catch(InputMismatchException e){
						System.out.println("\nDigite valores inteiros!");
						leia.nextLine();
						opcao=0;
					}
					
					if (opcao == 6) {
						System.out.println(Cores.TEXT_YELLOW_BOLD + "\n          E-COMMERCE - Seja Bem vindo"+ Cores.TEXT_RESET);
						sobre();
		                 leia.close();
						System.exit(0);
					}

					switch (opcao) {
						case 1:
							System.out.println("Listar todo Mundo\n\n");
							keyPress();
							break;
							
						case 2:
							System.out.println("Listar por ID\n\n");
							keyPress();
							break;
							
						case 3:
							System.out.println("Cadastrar\n\n");
							keyPress();
							break;
							
						case 4:
							System.out.println("Atualizar\n\n");
							keyPress();
							break;
							
						case 5:
							System.out.println("Deletar\n\n");
							keyPress();
							break;

						default:
							System.out.println("\nOpção Inválida!\n");
							keyPress();
							break;
					}
				}
			}
		    
			private static void keyPress() {
		// TODO Auto-generated method stub
		
	}

			public static void sobre() {
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\n*****************************************************" + Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_GREEN + "Projeto Desenvolvido por: Lucas Vinicius Gomes Silva ");
				System.out.println(Cores.TEXT_GREEN + "lucas.silva@genstudents.org");
				System.out.println(Cores.TEXT_GREEN + "github.com/luvigom"+ Cores.TEXT_RESET);
				System.out.println(Cores.TEXT_PURPLE_BOLD + "*****************************************************"+ Cores.TEXT_RESET);
			}
		}
