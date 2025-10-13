// b05_kontrollstruktur
// i_do_equals
// 13.10.2025

import java.io.*;

public class DoSchleife
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader eingabeLeser;
		BufferedReader		gepufferterLeser;
		String 				eingabeText	="";
		int 					gebot			=0;
		
		eingabeLeser		= new InputStreamReader(System.in);
		gepufferterLeser	= new BufferedReader(eingabeLeser);
		
		System.out.println("/nVersteigerung /n");
		// Die do-Schleife enthaelt in ihrem Fuss eine Bedingung.
		// Dieser "while-Fuss" MUSS mit einem Semikolon enden.
		// Die Bedingung wird NACH dem Schleifendurchlauf geprueft.
		// Wenn die Bedingung erfuellt ist, wird der Schleifenrumpf
		// noch einmal durchlaufen. Wenn nicht, dann endet die Wiederhilung.
		// Mindestens einmal wird der Rumpf aber auf JEDEN FALL
		// durchlaufen ("Annehmende Schleife").
		// Die for-Schleife und die while-Schleife werden auch 
		// "Abweisende Schleifen" bezeichnet.
		
		do
		{
			gebot = gebot + 100;
			System.out.println("Gebot: " +gebot);
			
			System.out.print("Mehr bieten? (ja/nein): ");
			eingabeText = gepufferterLeser.readLine();		
		}
		while(eingabeText.equals("ja"));
	}
}