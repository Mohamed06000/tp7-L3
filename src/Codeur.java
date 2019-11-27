import java.io.*;

public class Codeur {

	
	public static void main(String[] args) {
		int cle = -1;
		boolean doitCoder = false;
		File src = new File(args[2]);
		File dst = new File(args[3]);

		
		if(args.length != 4)
			erreur("4 arguments requis !");
		
		try {
			cle = Integer.parseInt(args[0]);
		}
		catch (NumberFormatException e) {
			erreur("args[0] doit être un entier !");
		}
		
		if(cle<1 && cle>25)
			erreur("clé invalide");
		
		Cesar cesar = new Cesar(cle);

		
		switch(args[1]) {
		
		case "code" :
			doitCoder = true;
			break;
			
		case "decode" :
			doitCoder = false;
			break;
			
		default :
			erreur("instructuon non reconnue");
		}
		
		
		if(!src.exists())
			erreur("fichier introuvable !");
		if(!src.isFile())
			erreur("fichier invalide");
		
		try (
			BufferedReader lecteur = new BufferedReader(new FileReader(src));
	        BufferedWriter ecriture = new BufferedWriter((new FileWriter(dst)));
			) {
			
			while((line=lecteur.readLine())!=null) {
				if(code)
					ecriture(cesar.code(normalize(line)));
				else
					ecriture(cesar.decode(ecriture(System.lineSep)))
			}
		}
		
		
	}
	
	public static void erreur(String msg) {
		System.err.println(msg);
		System.exit(1);
	}
}
