// b05_kontrollstruktur
// g_geschachteltes_if
// 09.10.2025

//-------------------Schlechter Code--------------------------------

public class ABCAnalyse2
{
	public static void main(String[]args)
	{
		char prioritaet = 'B'; // @wenn man A macht ist das Ergebnis: Hoch, Unzulaessig
		
		if (prioritaet == 'A')
		{
			System.out.println("Hoch");
		}
		else
		{
		}
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

		