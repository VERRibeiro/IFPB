import java.util.*;
public class MapAdapter extends TreeMap{
	
	public MapAdapter(int[][] vetor) {
		for (int i=0; i < 5 ; i++) {
			this.put(vetor[0][i], vetor[1][i]);
		}
	}

}