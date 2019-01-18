
package film;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnexionBD {
    
    
   Connection c=null;
   ResultSet rs=null;
   Statement stmt=null;
   static int PrimaireA=1;
   static int PrimiryDate=1;
    static int PrimaireC=1;
   public ConnexionBD ()
   {    
   }
   public boolean driver() 
   {
       try
   {
  DriverManager.registerDriver((Driver) Class.forName("com.mysql.jdbc.Driver").newInstance());
  Class.forName("com.mysql.jdbc.Driver");
  
       return true;
   }
       catch(Exception e)  
   {
       System.out.println("Erreur lors de charegment de pilote "+e.getMessage());
   return false;
   }      
   }
   public boolean Openconnexion()
   {
       try{
           
        String url="jdbc:mysql://localhost:3306/gestion";
        c=DriverManager.getConnection(url,"root","");
           return true;
       }
       catch(Exception e)
       {
           System.out.println("Echec de ouverture de la connexion: "+e.getMessage() );
           return false;
       }
   }
   
    
}
