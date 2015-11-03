package uebung_4_0;

public class Kreiselschleife {

	public static void main(String[] args) {
		int maximum = 420;
		int summe = 0;
		
		for( int i = 0; summe<maximum; i++ )
		{
			summe = summe+i;
			System.out.println(summe-i+" + " +i+ " = " +summe);
		}
	}

}
