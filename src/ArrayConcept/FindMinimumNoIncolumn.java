package ArrayConcept;

public class FindMinimumNoIncolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = { { 7, 3, 8 }, { 7, 3, 9 }, { 10, 3, 12 } };

		/*
		 * 7 2 8 7 1 9 10 0 12
		 * 
		 * 
		 * 
		 */
		int matrixcount = 0;
		int smallestNo = abc[0][0];
		
		int column = 0;
		int maxno = 0;

		for (int i = 0; i < abc.length; i++) {

			for (int j = 0; j < abc.length; j++) {

				matrixcount++;
				if (abc[i][j] < smallestNo) {

					smallestNo = abc[i][j];
					column = j;
				

				// if(matrixcount==9) {
				for (int k = 0; k < abc.length; k++) {

					if (abc[k][column] > maxno) {
						
						maxno = abc[k][column];
					}

				}
				}
				// }

			}

		}

		System.out.println(smallestNo);
		System.out.println(maxno);
	}

}
