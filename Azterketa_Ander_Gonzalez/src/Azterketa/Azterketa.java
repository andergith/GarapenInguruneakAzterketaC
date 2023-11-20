package Azterketa;

import java.util.Scanner;

public class Azterketa {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input;
        int batu = 0;
        int zenbatu = 0;

        System.out.println("Nahi dituzun zenbaki osoak sartu itzazu, '0' zenbakia sartzerakoan kalkulua bukatu egingo da eta sartutako zenbakien bataz bestekoa azalduko da.");

		    do {
		        input = sc.nextInt();
		        if(input != 0) {
		            batu = input;
		            zenbatu++;
		        }
		        
		    } while(input != 0);
		
		    if(zenbatu > 0) {
		        double batazbestekoa = (double) batu / zenbatu;
		        System.out.println("Sartutako zenbakien bataz bestekoa: " + batazbestekoa);
		    } else {
		        System.out.println("Zenbakiak sartu behar dira, ez dituzu sartu.");
		    }
		    
        sc.close();
		    
	}
}

