import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void test01() {
		// Função addTail
		LinkedList lista = new LinkedList();

		lista.addTail(10);
		assertEquals(lista.print(), "10", "Deve retornar: 10");

		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);
		assertEquals(lista.print(), "10 20 30 40", "Deve retornar: 10 20 30 40");
	}

	@Test
	void test02() {
		// Função addHead
		LinkedList lista = new LinkedList();

		lista.addHead(10);
		assertEquals(lista.print(), "10", "Deve retornar: 10");

		lista.addHead(20);
		lista.addHead(30);
		lista.addHead(40);
		assertEquals(lista.print(), "40 30 20 10", "Deve retornar: \"40 30 20 10\"");
	}

	@Test
	void test03() {
		// Função removeTail
		LinkedList lista = new LinkedList();

		lista.addTail(10);
		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);

		lista.removeTail();
		lista.removeTail();
		assertEquals(lista.print(), "10 20", "Deve retornar: \"10 20\"");
	}

	@Test
	void test04() {
		// Função removeHead
		LinkedList lista = new LinkedList();

		lista.addTail(10);
		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);

		lista.removeHead();
		lista.removeHead();
		assertEquals(lista.print(), "30 40", "Deve retornar: \"30 40\"");
	}

	@Test
	void test05() {
		// Função size
		LinkedList lista = new LinkedList();
		assertEquals(lista.size(), 0, "Tamanho deve ser 0");
		
		lista.addTail(10);
		assertEquals(lista.size(), 1, "Tamanho deve ser 1");
		
		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);
		assertEquals(lista.size(), 4, "Tamanho deve ser 4");
	}

	@Test
	void test06() {
		// Função min
		LinkedList lista = new LinkedList();
		assertEquals(lista.min(), 0, "Menor item deve ser 0");

		lista.addTail(10);
		assertEquals(lista.min(), 10, "Menor item deve ser 10");

		lista.addTail(20);
		lista.addTail(5);
		lista.addTail(30);
		lista.addTail(5);
		assertEquals(lista.min(), 5, "Menor item deve ser 5");
	}

	@Test
	void test07() {
		// função removeItem
		LinkedList lista = new LinkedList();
		
		lista.removeItem(10);
		assertEquals(lista.print(), "", "Lista deve continuar vazia");
		assertEquals(lista.head, null, "Cabeça da lista deve ser null");

		lista.addTail(20);
		lista.removeItem(20);
		assertEquals(lista.print(), "", "Lista deve ser vazia");
		assertEquals(lista.head, null, "Cabeça da lista deve ser null");

		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);
		lista.addTail(20);
		lista.addTail(50);
		lista.removeItem(20);
		assertEquals(lista.print(), "30 40 20 50", "Deve retornar: \"30 40 20 50\"");
		assertEquals(lista.head.element, 30, "Cabeça da lista deve ser 30");

		lista.removeItem(40);
		assertEquals(lista.print(), "30 20 50", "Deve retornar: \"30 20 50\"");
		assertEquals(lista.head.element, 30, "Cabeça da lista deve ser 30");

		lista.removeItem(50);
		assertEquals(lista.print(), "30 20", "Deve retornar: \"30 20\"");
		assertEquals(lista.head.element, 30, "Cabeça da lista deve ser 30");

		lista.removeItem(100);
		assertEquals(lista.print(), "30 20", "Deve retornar: \"30 20\"");
		assertEquals(lista.head.element, 30, "Cabeça da lista deve ser 30");
	}
	
	@Test
	void test08() {
		//Função sum
		
		LinkedList lista = new LinkedList();
		assertEquals(lista.sum(), 0, "Somatório da lista deve ser 0");
		lista.addTail(10);
        assertEquals(lista.sum(), 10, "Somatório da lista deve ser 10");
        lista.addTail(20);
        lista.addTail(35);
        assertEquals(lista.sum(), 65, "Somatório da lista deve ser 65");
        lista.addTail(60);
        lista.addTail(100);
        assertEquals(lista.sum(), 225, "Somatório da lista deve ser 225");
	}
	
	@Test
	void test09() {
		//Função mean
		
		LinkedList lista = new LinkedList();
		assertEquals(lista.mean(), 0, "Média da lista deve ser 0");
		lista.addTail(10);
		assertEquals(lista.mean(), 10, "Média da lista deve ser 10");
        lista.addTail(20);
        lista.addTail(30);
        lista.addTail(40);
        assertEquals(lista.mean(), 25, "Média da lista deve ser 25");
        lista.addTail(50);
        lista.addTail(60);
        assertEquals(lista.mean(), 35, "Média da lista deve ser 35");
	}
	
	@Test
	void test10() {
		//Função depth
		
		LinkedList lista = new LinkedList();
		assertEquals(lista.depth(10), 0, "Profundidade deve ser 0");
		lista.addTail(10);
		assertEquals(lista.depth(10), 0, "Profundidade deve ser 0");
        lista.addTail(20);
        lista.addTail(30);
        lista.addTail(40);
        assertEquals(lista.depth(20), 1, "Profundidade deve ser 1");
        assertEquals(lista.depth(30), 2, "Profundidade deve ser 2");
        assertEquals(lista.depth(40), 3, "Profundidade deve ser 3");
        
        // item inexistente
        assertEquals(lista.depth(80), -1, "Profundidade deve ser -1");
        
	}
	
	@Test
	void test11() {
		//Função reverse
		
		LinkedList lista = new LinkedList();
		lista.reverse();
		assertEquals(lista.print(), "", "Lista deve continuar vazia");
		lista.addTail(10);
		lista.reverse();
		assertEquals(lista.print(), "10", "Lista deve ser 10");
		lista.addTail(20);
		lista.addTail(30);
		lista.addTail(40);
		lista.addTail(50);
		lista.reverse();
		assertEquals(lista.print(), "50 40 30 20 10", "Lista deve ser 50 40 30 20 10");
		
		
	}
}
