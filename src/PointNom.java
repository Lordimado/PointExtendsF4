
public class PointNom extends PointA {
	
	 private String Name;
	    
	    public PointNom (String Name, double x, double y){
	        super (x,y);
	        this.Name = Name;        
	    }
	    
	    public String AfficheCoord ()
	    {
	        return this.Name + super.toString();
	    }

}
