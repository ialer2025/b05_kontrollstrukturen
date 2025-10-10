// b05_kontrollstruktur
// g_geschachteltes_if
// 10.10.2025

public class ABCAnalyse4
{
	public static void main(String[]args)
	{
		char prioritaet = 'X';
		
		if (prioritaet == 'A')
		{
			System.out.println("Hoch");
		}
		else
		{
			if(prioritaet == 'B')
			{
				System.out.println("Mittel");
			}
			else
			{
				if(prioritaet == 'C')
				{
					System.out.println("Niedrig");
				}
				else
				{
					System.out.println("Unzulaessig");
				}
			}
		}
	}
}
		