package ejrcicios_uno;

public class app {
    public static void main(String args[])
    {

        /*
        System.out.println("Empieza");
        int i = 0;
        while (i < 51 ) {
        	System.out.println(i);
        	i++;
        }
        System.out.println("Termino");
        System.out.println("empieza");
        
        for(int i1 =0; i1 < 51; i1++) {
        	System.out.println(i1);
        }
        System.out.println("Termino");
        */
        
        
        System.out.println("Empieza");
        int i = 0;
        while (i < 8 ) {
        	switch(i) {
	        case 0: 
	       		 System.out.println("Cero");
	       	     break;
        	 case 1: 
        		 System.out.println("Uno");
        	     break;
        	 case 2: 
        		 System.out.println("Dos");
        	     break;
        	 case 3: 
        		 System.out.println("Tres");
        	     break;
        	 case 4: 
        		 System.out.println("Cuatro");
        	     break;
        	 case 5: 
        		 System.out.println("Cinco");
        	     break;
        	 case 6: 
        		 System.out.println("Seis");
        	     break;
        	 default: 
        		 System.out.println("Otro número");
        	     break;
        	 }
 
        	i++;
        }
        System.out.println("Termino");
        
    }
    
}
