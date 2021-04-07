package tarefa05.questão05;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroRecebimentos {
    ArrayList<Recebivel> registros = new ArrayList();

    public RegistroRecebimentos(){
        this.interfaceUsuario();

    }

    public void interfaceUsuario(){
        boolean exit = false;

        while(!exit){
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite 1 para registrar uma venda e 2 para registrar um serviço:");
            int escolha = teclado.nextInt();
            teclado.nextLine();

            if (escolha == 1){
                System.out.println("Digite o nome do produto:");
                String produto = teclado.nextLine();

                System.out.println("Digite a quantidade do produto:");
                int quantidade = teclado.nextInt();

                System.out.println("Digite o preço unitário do produto:");
                double precoUnitario = teclado.nextDouble();

                registros.add(new ItemVenda(produto, quantidade, precoUnitario));
                System.out.println("Venda registrada");




            }else if(escolha == 2){
                System.out.println("Digite a discrição do serviço:");
                String discricao = teclado.nextLine();
                System.out.println("Digite a quantidade de horas:");
                int horas = teclado.nextInt();
                System.out.println("Digite o preço por hora do serviço:");
                double precoHora = teclado.nextDouble();
                registros.add(new Servico(discricao, horas, precoHora));
                System.out.println("Serviço registrado");
            }else{
                System.out.println("Por favor digite apenas 1 ou 2");
            }

            System.out.println("Digite 0 para fazer outro registro e 3 para desligar o sistema");
            escolha = teclado.nextInt();
            if (escolha == 0){
                continue;
            }else{
                exit = true;
            }
        }

    }




}
