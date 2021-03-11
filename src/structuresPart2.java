
public class structuresPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numArr[]= {3,5,67,3,4,6};
		
		int sum=0;
		for(int i=0; i<numArr.length; i++) {
			
			sum=sum+i;
			
			
		}
		System.out.println(sum);
		
	
		
		double[] exampleArray = { 1, 5, 6, 5, 4, 1 };

		double maximum = exampleArray[0];

	int index=0;

		for (int i = 0; i < exampleArray.length; i++) {

			if (exampleArray[i] > maximum) {
				maximum = exampleArray[i];
		        index=i;
			}
		}
		System.out.println(index);
	}

}
