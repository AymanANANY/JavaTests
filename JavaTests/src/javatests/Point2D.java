/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatests;

/**
 *
 * @author AAnan
 */
public class Point2D {
    public Point2D (int abc, int ord){
        x = abc ;
        y = ord ;
    }
    public Point2D (Point2D autre) {
        x = autre.x ;
        y = autre.y ;
    }
    public Point2D copie()
    {
        Point2D ref = new Point2D(x, y) ; 
        return ref ;
    }
    public void affiche() {
        System.out.println("Je suis un point 2D de cordonnées" + x + y) ;
    }
    public double distance(){
        double dist = x*x + y*y ;
        return Math.sqrt(dist);
    }
    public void setName(String newName){
        name= newName;
    } 
        private int x,y;
        private String name;
}
    
