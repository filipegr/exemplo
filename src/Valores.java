import java.util.ArrayList;
import java.util.List;

public class Valores implements ValoresITF {

	private List<Integer> lista = new ArrayList<Integer>();

	@Override
	public boolean ins(int v) {
		if ((v > 0) && (lista.size()<10)) {
			lista.add(v);
			return true;
		}
			return false;
	}

	@Override
	public int del(int i) {
		for (int n = 0; n < lista.size(); n++) {
			if (lista.get(n) == i) {
				lista.remove(n);
				return n;
			}
		}
		return -1;
	}

	@Override
	public int size() {
		return lista.size();
	}

	@Override
	public double mean() {
		if (lista.size() == 0) {
			return -1;
		} else {
			int soma = 0;
			for (int i = 0; i < lista.size(); i++) {
				soma = soma + lista.get(i);
			}
			return soma / lista.size();
		}
	}

	@Override
	public int greater() {
		if (lista.size() == 0) {
			return -1;
		} else {
			int greater = lista.get(0);
			for (int i = 1; i < lista.size(); i++) {
				if (lista.get(i) > greater) {
					greater = lista.get(i);
				}
			}
			return greater;
		}
	}

	@Override
	public int lower() {
		if (lista.size() == 0) {
			return -1;
		} else {
			int lower = lista.get(0);
			;
			for (int i = 1; i < lista.size(); i++) {
				if (lista.get(i) < lower) {
					lower = lista.get(i);
				}
			}
			return lower;
		}
	}

}
