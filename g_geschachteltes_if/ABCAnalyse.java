// b05_kontrollstruktur
// g_geschachteltes_if
// 09.10.2025

public class ABCAnalyse
{
	public static void main(String[]arg)
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
		