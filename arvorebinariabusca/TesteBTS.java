package arvorebinariabusca;

public class TesteBTS {

	public static void main(String[] args) {
		ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

		arvore.insereNo(20, arvore.getRaiz());

		arvore.insereNo(30, arvore.getRaiz());

		arvore.insereNo(10, arvore.getRaiz());
		
		arvore.insereNo(35, arvore.getRaiz());

		arvore.imprimeInterFixado(arvore.getRaiz());
		
		arvore.removeNo(30);
		System.out.println();
		arvore.imprimeInterFixado(arvore.getRaiz());
		
		}
		
	}
