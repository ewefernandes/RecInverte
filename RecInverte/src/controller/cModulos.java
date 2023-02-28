package controller;

public class cModulos {
	public String InverteString (int tam, String np, String [] v) {
		
		if (tam < 0) {
			return np;
		} else {
			np = np + v[tam];
			return InverteString(tam-1, np, v);
		}
	}
}
