public class Main {
    public static void main(String[] args) {
    		int[][] vetor = new int[5][2];
    		for(int i = 0; i < 5; i++) {
    			for(int j = 0; j < 5; j++) {
        			vetor[i][j] = j;
        		}
    		}
    		MapAdapter mapa = new MapAdapter(vetor);
    		
    		
    		    System.out.println(mapa.toString());
    		
    }
}
