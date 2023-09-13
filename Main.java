import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) {
		
		long[] c = new long[14];
		
		for (int i = 17; i >= 4; i--) {
			c[17 - i] = i;
		}
		
		float[] x = new float[15];
		for (int i = 0; i < x.length; i++) {
			x[i] = (float)Math.random() * 22 - 11;
		}
						
		double[][] res = new double[14][15];
		
		Integer[] numbers = { 5, 9, 10, 11, 12, 14, 17 };
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if (c[i] == 8) {
					res[i][j] = Math.pow(Math.E, Math.pow(Math.pow(x[j], 0.25 * (1 - x[j])), Math.log(Math.abs(x[j])) / 2));
				}
				else if (Arrays.asList(numbers).contains((int)c[i])) {
					res[i][j] = 3.0 / 4 * (Math.pow(2 * Math.sin(x[j]), 3) - 2.0 / 3);
				}
				else {
					res[i][j] = Math.pow(Math.E, Math.atan(0.25 * Math.pow(x[j] / 22.0, 2)));
				}
			}
		}
				
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(String.format("%.5f ", res[i][j]));
			}
			System.out.println();
		}
		
	}
	
}
 