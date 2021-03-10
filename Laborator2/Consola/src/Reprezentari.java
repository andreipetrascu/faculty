
public class Reprezentari {

	public static void main(String[] args) {
		System.out.println("Salut");
		byte nrb1 = 127;
		byte nrb2 = 5;
		nrb1 ++;
		System.out.println(nrb1); // -128
		
		short nrs = 32767;
		nrs+=45;
		System.out.println(nrs); // -32724
		nrs = -32768;
		nrs--;
		System.out.println(nrs); // 32767
		
		int nri = 2147483647;
		nri++;
		System.out.println(nri); // -2147483648
		
		long nrl = 923333333; // ????
		//nrl++;
		System.out.println(nrl);
		
		double nrf = 12.12345678987654321;
		System.out.println(nrf);
	}
}
