package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

				Scanner leia = new Scanner(System.in);

				int opcao;

				while (true) {

					System.out.println(Cores.TEXT_PURPLE_BOLD + "*****************************************************");
					System.out.println("                                                     ");
					System.out.println(Cores.TEXT_YELLOW_BOLD + "                     E-COMMERCE                      ");
					System.out.println("                                                     ");
					System.out.println(Cores.TEXT_PURPLE_BOLD + "*****************************************************");
					System.out.println("                                                     ");
					System.out.println(Cores.TEXT_BLUE_BOLD + "            1 - Listar todo Mundo                    ");
					System.out.println("            2 - Listar por ID                        ");
					System.out.println("            3 - Cadastrar                            ");
					System.out.println("            4 - Atualizar                            ");
					System.out.println("            5 - Deletar                              ");
					System.out.println("                                                     ");
					System.out.println(Cores.TEXT_PURPLE_BOLD + "*****************************************************");
					System.out.println(Cores.TEXT_BLUE_BOLD + "                 \nEscolha a opção desejada:                            ");
					System.out.println("                                                     " + Cores.TEXT_RESET);

					opcao = leia.nextInt();

					if (opcao == 6) {
						System.out.println("\nE-COMMERCE - Seja Bem vindo");
						sobre();
		                 leia.close();
						System.exit(0);
					}

					switch (opcao) {
						case 1:
							System.out.println("Listar todo Mundo\n\n");

							break;
						case 2:
							System.out.println("Listar por ID\n\n");

							break;
						case 3:
							System.out.println("Cadastrar\n\n");

							break;
						case 4:
							System.out.println("Atualizar\n\n");

							break;
						case 5:
							System.out.println("Deletar\n\n");

							break;

						default:
							System.out.println("\nOpção Inválida!\n");
							break;
					}
				}
			}
		    
			public static void sobre() {
				System.out.println("\n*********************************************************");
				System.out.println("Projeto Desenvolvido por: Lucas Vinicius Gomes Silva ");
				System.out.println("lucas.silva@genstudents.org");
				System.out.println("github.com/luvigom");
				System.out.println("*********************************************************");
			}
		}
