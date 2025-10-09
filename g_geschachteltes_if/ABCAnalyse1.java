// b05_kontrollstruktur
// g_geschachteltes_if
// 09.10.2025

//----------------SCHLECHTER CODE---------------------------
// so sollen wir das nicht machen

public class ABCAnalyse1
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
		}
		else
		{
			System.out.println("Niedrieg");
		}
		// Compiliert nicht!!!
		// Fehler: "else" ohne "if"
		// error: 'else' without 'if'
	}
}
		