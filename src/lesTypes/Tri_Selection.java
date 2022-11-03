package lesTypes;

public class Tri_Selection {

	public static void main(String[] args) {
		/*int tab[] = new int[6];
		tab[0] = 20;
		tab[1] = 4;
		tab[2] = 6;
		tab[3] = 1;
		tab[4] = 15;
		tab[5] = 8;*/
		
		int tab[] = {20,4,20,15,15,8};
		for(int i = 0; i<tab.length;i++)
		{
			System.out.print(tab[i]+"\t");
		}
		
		/*** Algorithme de Tri par selection ***/
		/*
		int indiceMin;
		int valMin;
		
		for(int i=0; i<tab.length-1; i++)
		{
			indiceMin = i;
			valMin = tab[i];
			for(int j= i+1; j<tab.length;j++)
			{
				if(tab[j]<=valMin)
				{
					indiceMin = j;
					valMin=tab[j];
				}
			}
			tab[indiceMin]=tab[i];
			tab[i]=valMin;
		}
		*/
		
		/*** Algorithme de Tri à Bulle ***/
		int temp;
		for(int i=tab.length; i>=0;i--)
		{
			for(int j=1; j<i; j++)
			{
				if(tab[j-1]>=tab[j])
				{
					temp = tab[j-1];
					tab[j-1]=tab[j];
					tab[j]=temp;
				}
			}
		}
		
		System.out.println("\n Tableau trié");
		for(int i = 0; i<tab.length;i++)
		{
			System.out.print(tab[i]+"\t");
		}

	}

}
