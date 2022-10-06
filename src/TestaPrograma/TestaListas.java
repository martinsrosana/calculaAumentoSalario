package TestaPrograma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Listas;

public class TestaListas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Listas listas = new Listas();
		int id = 0;
		List<Listas> list = new ArrayList<>();

		System.out.println("Quantos funcionário você vai adicionar? ");
		int numeroFunc = scanner.nextInt();
		for (int i = 0; i < numeroFunc; i++) {

			System.out.println(" Funcionário #" + (i + 1) + " . ");

			System.out.println("Digite o id do funcionário:");
			id = scanner.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id já existe! Digite novamente um id válido: ");
				id = scanner.nextInt();

			}
			System.out.println("Digite o nome do funcionário");
			scanner.nextLine();
			String nome = scanner.next();
			System.out.println("Digite o salário do funcionário");
			double salario = scanner.nextDouble();

			listas = new Listas(id, nome, salario);
			list.add(listas);
		}

		System.out.println("Digite o id do funcionario que terá aumento no salário: ");
		int idsalario = scanner.nextInt();
		// Integer pos = position(list, idsalario);
		Listas emp = list.stream().filter(x -> x.getId() == idsalario).findFirst().orElse(null);

		// if (pos == null) {
		if (emp == null) {
			System.out.println("ID não existe!");

		} else {
			System.out.print("Entre com a porcentagem que será aumentado o salário. ");
			double porcentagem = scanner.nextDouble();
			// list.get(pos).aumentoSalario(percent);
			emp.aumentoSalario(porcentagem);
		}
		System.out.println();
		System.out.println("Lista de Funcionários");
		for (Listas listasfunc : list) {
			System.out.println(listasfunc);
		}
		scanner.close();
	}

	public static Integer position(List<Listas> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Listas> list, int id) {
		Listas emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

	public static void ordenarArray(int[] id) {
		for (int idordenado : id) {
			System.out.println(idordenado);
		}
	}
}