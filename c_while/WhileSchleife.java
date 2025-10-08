// b05_kontrollstruktur
// c_while
// 08.10.2025

import java.io.*;

public class WhileSchleife
{
   public static void main(String[] args) throws Exception
   {
      InputStreamReader eingabeLeser;
      BufferedReader    gepufferterLeser;
      String            eingabeText = "";  
      int               eingabeZahl = 0;



      eingabeLeser     = new InputStreamReader(System.in);
      gepufferterLeser = new BufferedReader(eingabeLeser);

     // Die While-Schleife enthaelt in ihrem Kopf eine 
     // Bedingung.
     // Eine Bedingung ist ein Ausdruck, der einen
     // Wahrheitswert hat (true oder false, Typ: boolean)
     // Diese Bedingung wird VOR jedem Schleifendurchlauf 
     // geprueft.
     // Wenn Sie erfuellt ist, wird der Schleifenrumpf 
     // durchlaufen.
     // Wenn nicht, findet keine Wiederholung (mehr) statt.
     // != bedeutet ungleich.
	 
      while (eingabeZahl != 4711) 
      {
         System.out.println("Bitte die PIN eingeben: ");
         eingabeText = gepufferterLeser.readLine();
         eingabeZahl = Integer.parseInt(eingabeText);
      }
	  
	  System.out.println();
	  System.out.println("Eingegeben wurde: " +eingabeZahl);
   }
}
