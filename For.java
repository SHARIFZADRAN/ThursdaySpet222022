package javaProjects;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
			//for
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
        }
        System.out.println();
  
        	//foreach
        for (int element : arrayOfInts) {
            System.out.print(element + " ");
        }
        System.out.println();
        
	}

}
