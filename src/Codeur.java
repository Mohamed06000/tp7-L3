
public class Codeur {

	
	public static void main(String[] args) {
		int cle = -1;
		boolean doitCoder = false;
		
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
		
		
	}
	
	public static void erreur(String msg) {
		System.err.println(msg);
		System.exit(1);
	}
}
