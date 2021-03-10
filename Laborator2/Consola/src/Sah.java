
//Hallo
import java.math.BigInteger;
public class Sah {
	
	public static void main(String[] args)
	{
		BigInteger nr1, nr2;
		nr1 = BigInteger.valueOf(1); 
		nr2 = BigInteger.valueOf(1); 
		
		 for(int i=1; i<64; i++)
		 {
			 System.out.println(nr1);
			 nr2 = nr2.add(nr2);
			 nr1 = nr1.add(nr2); 
             //System.out.println(nr2);
		 }
	}

}
