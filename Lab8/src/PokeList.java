import java.util.Scanner;

public class PokeList {
	
	public static void main(String[] args)	{
		
		Scanner keyboard = new Scanner(System.in);
		
		Pokemon[] pokelist = createPokes();

		int x;

		do {
			System.out.println("UNSORTED POKEMONS\n");
			
			for ( int i=0; i<pokelist.length; i++ )
				System.out.println("\t" + i + ". " + pokelist[i].getName());

			System.out.println("\nChoose an action on Pokemon list (Or enter 0 to quit.)");
			
			System.out.println(" 1 - sort by name ");
			System.out.println(" 2 - sort by HP (increasingly)");
			System.out.println(" 3 - rank by attack power (increasingly) ");
			System.out.println(" 4 - rank by speed (decreasingly) ");
			
			
			System.out.print("> ");
			x = keyboard.nextInt();

			
			switch (x) {
				case 1:
					sortByName(pokelist.clone());
					break;
				case 2:
					sortByHPIncrease(pokelist.clone());
					break;
				case 3:
					rankByAttackIncrease(pokelist.clone());
					break;
				case 4:
					rankBySpeedDecrease(pokelist.clone());
					break;
				case 0:
					return;
				default:
					return;
			}

		} while ( x > 0 );

	}

	// Using selectionSort
	private static void rankBySpeedDecrease(Pokemon[] pokelist) 
	{
		for(int i = 0; i < pokelist.length; i++)
		{
			int minSpeed = i;
			
			// find slowest speed
			for (int j = i; j < pokelist.length; j++)
			{
				if(pokelist[j].getSpeed() > pokelist[minSpeed].getSpeed())
				{
					minSpeed = j; 
				}
			}
			
			Pokemon temp = pokelist[i];
			pokelist[i] = pokelist[minSpeed];
			pokelist[minSpeed] = temp; 
		}
		for(Pokemon speed : pokelist)
		{
			System.out.println(speed.getName() + " (" + speed.getSpeed() + ") " + " "); 
		}
	}

	// Using insertion sort
	private static void rankByAttackIncrease(Pokemon[] pokelist) 
	{
		for (int i = 1; i < pokelist.length; i++)
		{
			int j = i;
			while (j > 0 && pokelist[j - 1].getAttack() > pokelist[j].getAttack())
			{
				Pokemon temp = pokelist[j]; 
				pokelist[j] = pokelist[j - 1];
				pokelist[j - 1] = temp; 
				
				j--; 
			}

		}
		for(Pokemon attack : pokelist)
		{
			System.out.println(attack.getName() + " (" +  attack.getAttack() + ") "+ " ");
		}
	}

	// Using Quick Sort
	public static void sortByHPIncrease(Pokemon[] pokelist) 
	{
		quickSort(pokelist, 0, pokelist.length - 1);
		
		for(Pokemon HP : pokelist)
		{
			System.out.println(HP.getName() + " (" +  HP.getHP() + ") " + " ");
		}

	}

	private static void quickSort(Pokemon[] pokelist, int low, int high) 
	{
	    if (low < high) 
	    {
	        int pivot = partition(pokelist, low, high);
	        quickSort(pokelist, low, pivot - 1);
	        quickSort(pokelist, pivot + 1, high);
	    }
	}
	
	private static int partition(Pokemon[] pokelist, int low, int high) 
	{
	    int pivot = pokelist[high].getHP();
	    int i = low - 1;
	    for (int j = low; j < high; j++) 
	    {
	        if (pokelist[j].getHP() <= pivot) 
	        {
	            i++;
	            Pokemon temp = pokelist[i];
	            pokelist[i] = pokelist[j];
	            pokelist[j] = temp;
	        }
	    }
	    Pokemon temp = pokelist[i + 1];
	    pokelist[i + 1] = pokelist[high];
	    pokelist[high] = temp;
	    return i + 1;
	}
	
	// Using any sort algorithm
	private static void sortByName(Pokemon[] pokelist) 
	{
		for (int i = 0; i < pokelist.length - 1; i++)
		{
			int minIndex = i;
			
			//find the earliest letter
			for(int j = i + 1; j < pokelist.length; j++)
			{
				
				if(pokelist[j].getName().compareToIgnoreCase(pokelist[minIndex].getName()) < 0)
				{
					minIndex = j; 
				}
				
			}
				
			Pokemon temp = pokelist[i];
			pokelist[i] = pokelist[minIndex];
			pokelist[minIndex] = temp;
			
		}
		for(Pokemon name : pokelist)
		{
			System.out.println(name.getName() + " ");
		}

	}
		

	public static Pokemon[] createPokes() {
		
		Pokemon p1 = new Pokemon("Bulbasaur", 15.2, 30, 30, 30);
		Pokemon p2 = new Pokemon("Pikachu", 13.2, 35, 40, 60);
		Pokemon p3 = new Pokemon("Poliwhirl", 44.1, 40, 40, 60);
		Pokemon p4 = new Pokemon("Gengar", 89.3, 45, 45, 70);
		Pokemon p5 = new Pokemon("Dragonair", 36.4, 42, 55, 50);
		Pokemon p6 = new Pokemon("Psyduck", 43.2, 25, 35, 35);
		Pokemon p7 = new Pokemon("Mewtwo", 269.0, 75, 75, 85);
		Pokemon p8 = new Pokemon("Wobbuffet", 62.8, 120, 20, 15);
		Pokemon p9 = new Pokemon("Lucario", 119.0, 50, 70, 65);
		Pokemon p10 = new Pokemon("Xerneas", 474.0, 85, 85, 67);
		
		Pokemon[] list = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
		
		return list;
	}

}
