
public class Main {
	
	  public static void main(String[] args) {
	     
	        Point X = new Point (2.0,1.5);
	        PointA A = new PointA (5.0,4.75);       
	        PointNom B = new PointNom("B",1.0,0.0);
		  
	        System.out.println("\n          *------------------------------------*                ");
	        System.out.println("          |  Les Coordonnées de X"+X.toString()+"    |            ");
	        System.out.println("          |  Les Coordonnées de A"+A.AfficheCoord()+"   |         ");
	        System.out.println("          |  Les Coordonnées de "+B.AfficheCoord()+"    |         ");
	        System.out.println("          *------------------------------------*                  ");
	    }
}
