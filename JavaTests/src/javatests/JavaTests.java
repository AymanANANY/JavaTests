/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatests;

/**
 *
 * @author AAnan
 */
public class JavaTests {
    public static void main(String[]args) {
        int t[] = {5,2,1,4,6,8,9}; 
        char []c = {'H','E','L','L','O'}; 
        //t[0]= 7;
        //t[1]= 5 ;    
        for (int i=0; i<c.length; i++) {
            //System.out.println(c[i]);
        }
        //System.out.println(c);
        String s = new String("HeLLo");
        String s2 = "Hello" ;
        char test[] = {'A','y','m','a','n'};
        String test2 = new String(test);
        char []test3 = test2.toCharArray();
        //System.out.println(Jour courant =Jour.mercredi);
        Jour courant = Jour.dimanche;
        System.out.println(courant.ordinal());
    }
}

        enum Jour {lundi, mardi, mercredi, jeudi, vendedi, samedi, dimanche};

/*
byte b = 1;
        char c[] = {'a'};
        short s = 5;
        int i = 7;
        long l = 9;
        float f = 1.5f;
        double d = 70.0;
        String name = "Ayman";
        String n = new String(c);
        System.out.println(Float.POSITIVE_INFINITY);
        java.util.Scanner entree = new java.util.Scanner(System.in) ;
        //String nom = entree.nextLine() ;
        //System.out.println("nom : " + nom) ;
        int o = 1;
        o = 50 ;
*/

/*
        Point2D ref ;
        ref = new Point2D(2, 7);
        Point2D ref2 = new Point2D(-5, 4) ;
        ref2 = ref.copie();
        System.out.println(ref.toString());
        System.out.println(ref2.toString());
        ref.affiche();
        ref2.affiche();
        ref2.affiche();
*/