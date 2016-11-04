
public class PointNom extends PointA {
	
	 private String Name;
	    
	    public PointNom (String Name, double x, double y){
	        super (x,y);
	        this.Name = Name;        
	    }
	    
	    public String AfficheCoord () //ce qui est demandé est de redéfinir afficheCoord() ici
	    {
	        return this.Name + super.AfficheCoord();
	    }

}
