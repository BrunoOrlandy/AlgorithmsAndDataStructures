package Arvores;

public class ArvoresBinariasParte1 {

    public static void main(String[] args) {
	No arvore = new No(8);

	insereArvore(arvore, 5);
	insereArvore(arvore, 3);
	insereArvore(arvore, 7);
	insereArvore(arvore, 9);
	insereArvore(arvore, 12);

	System.out.print("Em  Ordem: ");
	emOrdem(arvore);
	System.out.println("");
	System.out.print("Soma de todos os nós: " + contarNos(arvore, 0));

    }

    public static void insereArvore(No arvore, int chave) {
	No anterior = arvore;
	while (arvore != null) {
	    anterior = arvore;
	    if (arvore.getChave() < chave) {
		arvore = arvore.getDireita();
	    } else {
		arvore = arvore.getEsquerda();
	    }

	}
	No novo = new No(chave);
	if (anterior.getChave() < chave) {
	    anterior.setDireita(novo);
	} else {
	    anterior.setEsquerda(novo);
	}
    }

    public static void emOrdem(No no) {
	if (no != null) {
	    emOrdem(no.getEsquerda());
	    System.out.print(no.getChave() + ", ");
	    emOrdem(no.getDireita());
	}
    }

    public static int contarNos(No atual, int soma) {
	if (atual == null) {
	    return soma;
	} else {
	    return soma = (contarNos(null, atual.getEsquerda().getValor())
		    + contarNos(null, atual.getDireita().getValor()));
	}
    }
}