
public class Principal {

	public static void main(String[] args) {

		// Cria uma lista vazia
		LinkedList lista = new LinkedList();

		// -----------------------------------------------------------------------

		// Exibe a lista
		System.out.println("Lista: " + lista.print()); // lista deve estar vazia

		// Executa funções
		System.out.println(lista.sum()); // Somatório deve ser 0
		System.out.println(lista.mean()); // Média deve ser 0
		System.out.println(lista.depth(10)); // Profundidade deve ser 0

		// Inverte a lista
		lista.reverse();

		// Exibe a lista
		System.out.println("Lista: " + lista.print()); // lista deve estar vazia

		// -----------------------------------------------------------------------
		// Adiciona nodo no final (cauda)
		lista.addTail(10);

		// Exibe a lista
		System.out.println("Lista: " + lista.print()); // lista deve ser: 10

		// Executa funções
		System.out.println("Soma: " + lista.sum()); // Somatório deve ser 10
		System.out.println("Media: " + lista.mean()); // Média deve ser 10
		System.out.println("Profundidade: " + lista.depth(10)); // Profundidade deve ser 0

		// inverte a lista
		lista.reverse();

		// Exibe a lista
		System.out.println("Lista: " + lista.print()); // lista deve ser: 10

		// ------------------------------------------------------------------------
		// Adiciona nodos no final (cauda)
		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);
		lista.addTail(50);
		lista.addTail(60);

		// Exibe a lista
		System.out.println("Lista: " + lista.print()); // lista deve ser: 10 20 30 40 50 60

		// Executa funções
		System.out.println("Soma: " + lista.sum()); // Somatório deve ser 210
		System.out.println("Media: " + lista.mean()); // Média deve ser 35
		System.out.println("Profundidade: " + lista.depth(60)); // Profundidade deve ser 5

		// inverte a lista
		lista.reverse();

		// Exibe a lista
		System.out.println("Lista: " + lista.print()); // lista deve ser: 60 50 40 30 20 10
	}

}
