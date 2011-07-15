/*############################################################################
  Kodierung: UTF-8 ohne BOM
############################################################################*/

//############################################################################
/**
*/
//############################################################################
public class MasterMindMain
{
  //##########################################################################
  /**
  */
  //##########################################################################
	public static void main(String[] args)
	{
    Ausgabe.leere();
		Ausgabe.zeile("\n\n\tM a s t e r m i n d\n\n");
		Ausgabe.zeile("Ich spiele mit dir ...");

    MasterMind spiel = new MasterMind();

    do {
      
      if (Eingabe.auswahl("Möchten sie das Level (" + spiel.getLevel() + ") ändern? [j/n] ", "j", "n")) {
        spiel.setLevel(Eingabe.ganzzahl("Setzen sie das Level [ 4-9 ] fest: ", 4, 9));
      }
      
      if (Eingabe.auswahl("Möchten sie den Modus (" + spiel.getModus() + ") ändern? [j/n] ", "j", "n")) {
        spiel.setModus(Eingabe.ganzzahl("Setzen sie den Modus mit \n\t 1 - Benutzer \n\t 2 - Computer \n fest: ", 1, 2));
      }
      
      spiel.spielen();
      
    } while (Eingabe.auswahl("Noch einmal? (j/n): ", "j", "n"));
    
    Ausgabe.zeile("\n\n\tAuf Wiedersehen!\n\n");
	}
}


