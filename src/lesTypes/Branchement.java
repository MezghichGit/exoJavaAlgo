package lesTypes;

public class Branchement {

	public static void main(String[] args) {
		
		b:for (int i=0; i<10; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(j==4) break b;
				System.out.println("(i,j) = ("+i+","+j+")");	
			}

		}
		
		System.out.println("Suite du programme");

	}

}
