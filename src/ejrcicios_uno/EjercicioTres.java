package ejrcicios_uno;


import java.util.Scanner;
public class EjercicioTres {

    private static int unoADiez[] = {1,2,3,4,5,6,7,8,9,10};

    private void tellMeWhatYoWant(){
        int numero1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("dime el entero para el que quieres la tabla de multiplicar: ");
        numero1 = entrada.nextInt();
        muestroTablaMultiplicar( numero1);
        System.out.println("---------------------------------------------------- ");
        muestroTablaMultiplicar2( numero1);
        System.out.println("---------------------------------------------------- ");
        muestroTablaMultiplicar3( numero1);
    }

    private void muestroTablaMultiplicar( int tablaDel){
        if (tablaDel > 0 && tablaDel <= 10)
          for (int cual:unoADiez ){
              System.out.println(tablaDel + " * " +cual + " = " + tablaDel * cual );
          }
        else
        System.out.println("Solo tablas del 1 al 10");
    }

    private void muestroTablaMultiplicar2( int tablaDel){
        if (tablaDel > 0 && tablaDel <= 10)
          for (int cual = 1 ; cual <= 10; cual++ ){
              System.out.println(tablaDel + " * " +cual + " = " + tablaDel * cual );
          }
        else
        System.out.println("Solo tablas del 1 al 10");
    }

    private void muestroMultiplicoUno( int tablaDel, int cual){
        System.out.println(tablaDel + " * " +cual + " = " + tablaDel * cual );
        if (++cual <= 10)
            muestroMultiplicoUno( tablaDel,  cual);
    }


    private void muestroTablaMultiplicar3( int tablaDel){
        if (tablaDel > 0 && tablaDel <= 10)
            muestroMultiplicoUno( tablaDel, 1);
        else
        System.out.println("Solo tablas del 1 al 10");
    }
    public static void main(String args[]) {

        new EjercicioTres().tellMeWhatYoWant();
    }
}