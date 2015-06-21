package Q2;

import java.util.Comparator;

public class OrdenaQuantidade implements Comparator<Produto> {

	@Override
	public int compare(Produto produto1, Produto produto2) {
		if (produto1.getQuantidade() < produto2.getQuantidade()) {
			return -1;
		}
		if (produto1.getQuantidade() > produto2.getQuantidade()) {
			return 1;
		}
		return 0;
	}

}
