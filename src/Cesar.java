
public class Cesar {
	
	//CHAMPS
	int cle;
	
	//CONSTRUCTEUR
	Cesar(int cle) {
		this.cle = cle%26;
		if(cle<0)
			this.cle += 26;
	}
	//METHODES
	public char code(char c, int cle) {
		if((c>='A') && (c<='z'))
			return (char) ('A' + (c-'A'+cle)%26);
		else
			return c;
	}
	
	public char code(char c) {
		return code(c, this.cle);
	}
	
	public char decode(char c) {
		return code(c, 26 - this.cle);
	}
	
	public String code(String s, int cle) {
		char [] neW= new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			neW[i]=code(c,cle);
		}
		return new String(neW);
	}
	
	public String code(String s) {
		return code(s, this.cle);
	}

	public String decode(String s) {
		return code(s, 26 - this.cle);
	}
}
