package arvorebinariabusca;

public class ArvoreBinariaBusca {

	private BTSNode raiz;

	public void insereNo(Integer valor, BTSNode noBase) {
		// verifica se o nó raiz existe
		if (raiz == null) {
			raiz = new BTSNode(valor, null, null, null);
			return;
		}

		// procura um local para inserir a direita
		if (valor > noBase.getValor()) {
			if (noBase.getDir() == null) {
				BTSNode novoNo = new BTSNode(valor, noBase, null, null);
				noBase.setDir(novoNo);
			} else {
				insereNo(valor, noBase.getDir());
			}
			// procura um local para inserir a esquerda
		} else if (valor < noBase.getValor()) {
			if (noBase.getEsq() == null) {
				BTSNode novoNo = new BTSNode(valor, noBase, null, null);
				noBase.setEsq(novoNo);
			} else {
				insereNo(valor, noBase.getEsq());
			}
		} else if (valor == noBase.getValor()) {
			System.out.println("Valor " + valor + " inserido previamente.");
		}
	}

	// pesquisa um no
	public BTSNode pesquisaNo(Integer valor, BTSNode noBase) {
		if (noBase == null) {
			return null;
		}
		if (valor == noBase.getValor()) {
			return noBase;
		}
		if (valor < noBase.getValor()) {
			return pesquisaNo(valor, noBase.getEsq());
		} else {
			return pesquisaNo(valor, noBase.getDir());
		}
	}

	// impressoes
	public void imprimePreFixado(BTSNode noBase) {
		if (noBase != null) {
			System.out.print(noBase.getValor() + "\t");
			imprimePreFixado(noBase.getEsq());
			imprimePreFixado(noBase.getDir());
		}
	}

	public void imprimeInterFixado(BTSNode noBase) {
		if (noBase != null) {
			imprimeInterFixado(noBase.getEsq());
			System.out.print(noBase.getValor() + "\t");
			imprimeInterFixado(noBase.getDir());
		}
	}

	public void imprimePosFixado(BTSNode noBase) {
		if (noBase != null) {
			imprimePosFixado(noBase.getEsq());
			imprimePosFixado(noBase.getDir());
			System.out.print(noBase.getValor() + "\t");
		}
	}

	public boolean removeNo(Integer valor) {
		BTSNode atual = this.raiz;
		BTSNode paiAtual = null;
		while (atual != null) {
			if (atual.getValor().equals(valor)) {
				break;
			} else if (valor.compareTo(atual.getValor()) == -1) {
				paiAtual = atual;
				atual = atual.getEsq();
			} else {
				paiAtual = atual;
				atual = atual.getDir();
			}
		}
		if (atual != null) {
			if (atual.getDir() != null) {
				BTSNode substituto = atual.getDir();
				BTSNode paiSubstituto = atual;
				while (substituto.getEsq() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsq();
				}
				if (paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsq(substituto);
					} else {
						paiAtual.setDir(substituto);
					}
				} else {
					this.raiz = substituto;
				}
				if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
					paiSubstituto.setEsq(null);
				} else {
					paiSubstituto.setDir(null);
				}

			} else if (atual.getEsq() != null) {
				BTSNode substituto = atual.getEsq();
				BTSNode paiSubstituto = atual;
				while (substituto.getDir() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDir();
				}
				//
				if (paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsq(substituto);
					} else {
						paiAtual.setDir(substituto);
					}
				} else {
					this.raiz = substituto;
				}
				//
				if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
					paiSubstituto.setEsq(null);
				} else {
					paiSubstituto.setDir(null);
				}
			} else {
				if (paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsq(null);
					} else {
						paiAtual.setDir(null);
					}
				} else {
					this.raiz = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	// profundidade da arvore
	/**
	 * public int profundidadeRecursiva(BTSNode noBase) { if(noBase == null ||
	 * noBase.equals(raiz)) { return 0; } else { return +
	 * profundidadeRecursiva(noBase.getPai()); } }
	 **/

	// altura da arvore
	/**
	 * public int alturaNo(BTSNode noBase) { if(noBase == null || isFolha(noBase)) {
	 * return 0; } else { return 1 + Math.max(alturaNo(noBase.getDir()),
	 * alturaNo(noBase.getEsq())); } }
	 **/

	public boolean isFolha(BTSNode no) {
		if (no.getDir() == null && no.getEsq() == null) {
			return true;
		}
		return false;
	}

	public BTSNode getRaiz() {
		return raiz;
	}
}
