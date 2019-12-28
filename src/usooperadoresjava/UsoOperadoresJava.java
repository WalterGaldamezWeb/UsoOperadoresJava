package usooperadoresjava;

/**
 *
 * @author Walter Galdamez
 */
public class UsoOperadoresJava {

    public static void main(String[] args) {
        System.out.println("Operadores Aritmeticos");
        
        int a=1+2;
        int b=a*4;
        int c=b/2;
        int d=c-a;
        int e=-d;

        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("c :"+c);
        System.out.println("d :"+d);
        System.out.println("e :"+e);

        System.out.println("\nOperador Modulo (residuo:)");
        System.out.println("x mod 10 = "+a%2);

        System.out.println("\nOperador Compuesto: ");
        //a = a+4
        a+=2;
        b-=4;
        c+=a;

        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("c :"+c);

        System.out.println("\nOperador Incremento");
        //a = a+1
        //puede aumentar como
        a++;
        System.out.println("a:"+a);

        //pre-incremento/decremento (se incrementa antes de asignar el valor)
        c=++a;
        //pos-incremento/decremento (se incrementa despues de asignar el valor)
        //la siguiente vez que evaluemos b aumentara
        d=b++;

        System.out.println("b :"+b);
        System.out.println("c :"+c);
        System.out.println("d :"+d);

        System.out.println("\nOperador Relacional");
        //a es menor que b
        boolean res=a<b;
        System.out.println("Respuesta: "+res);

        System.out.println("\nOperador Ternario");
        //si a es menor que b se asigna el valor de a en la variable min caso contrario el valor de b
        int min=(a<b)?a:b;

        System.out.println("min: "+ min);

        System.out.println("\nOperador de asignacion");
        int i,j,k;
        //asignamos el valor de 100 a las tres variables en una sola linea
        i=j=k=100;

        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("k: "+k); 
        
    }
    
}
