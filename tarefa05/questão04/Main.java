package tarefa05.questão04;

import java.util.ArrayList;

public class Main {

    public static void main( String[] args ){
        ArrayList<Funcionario> funcionarios = new ArrayList();

        /* Cria os objetos de os adiciona no array */
        funcionarios.add(new FuncionariosAssalariados("Paulo", "Plinio", 5000));
        funcionarios.add(new FuncionarioPorHora("Jurandir","Fagundes", 120, 40));
        funcionarios.add(new FuncionarioComissionado("Jubileu", "Tropeiro", 30000, 2));
        funcionarios.add(new FuncionarioComissionadoAssalariado("Jefinho", "ReiDelas", 30000, 2, 3000));

        // Percorre o array para encontrar os funcionarios q devem ser atualizados
        for(Funcionario index : funcionarios){

            // Encontrou o funcionario que deve ser atualizado
            if(index instanceof FuncionarioComissionadoAssalariado){

                //Faz o downcasting para poder alterar o elemento do array
                ((FuncionarioComissionadoAssalariado) index).setSalarioBase(((FuncionarioComissionadoAssalariado) index).getSalarioBase() * 1.1);
                System.out.printf("Funcionário Atualizado:\n%s\n\n",((FuncionarioComissionadoAssalariado) index).toString());

            }

        }


    }

}

