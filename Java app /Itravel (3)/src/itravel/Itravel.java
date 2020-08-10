
package itravel;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;


class user{
String username,password;
    public user(String username, String password) throws InputMismatchException{
    try{  
        this.username = username;
        this.password = password;
        }
    
      catch(InputMismatchException e){ 
          JOptionPane.showMessageDialog(null,"somethong went wrong with your insertion");
          
      }
        catch(Exception e){
      JOptionPane.showMessageDialog(null,"Error !");
      }
    
    }
    
 public String getUsername() {
        return username;
    }
 
    public String getPassword() {
        return password;
    }
 

}
class admin extends user{
    public admin(String username, String password) throws InputMismatchException {
        super(username, password);
    }
// del ,add ,update methods
    
}
class customer extends user{
String customer_id;
String fname,lname,email;
int phone_number ,postcode,citycode;
Date dateofbirth;
    public customer(String customer_id, String fname, String lname, String email, 
            int phone_number, Date dateofbirth, int postcode, int citycode, String username,
            String password) throws InputMismatchException {
        
        super(username, password);
        
       try{ 
           this.customer_id = customer_id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone_number = phone_number;
        this.dateofbirth = dateofbirth;
        this.postcode = postcode;
        this.citycode = citycode;
         }
       
         catch(InputMismatchException e){
          JOptionPane.showMessageDialog(null,"somethong went wrong with your insertion");
      }
        catch(Exception e){
      JOptionPane.showMessageDialog(null,"Error !");
      }
       
    }

    public String getCustomer_id() {
        return customer_id;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getEmail() {
        return email;
    }
    public int getPhone_number() {
        return phone_number;
    }
    public Date getDateofbirth() {
        return dateofbirth;
    }
    public int getPostcode() {
        return postcode;
    }
    public int getcitycode() {
        return citycode;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

}
class owner extends user{
int price,numberofrooms;
String hotel_name,hotel_services;
    public owner(int ssn, int price, String hotel_name, int numberofrooms, 
        String hotel_services, String username, String password) throws InputMismatchException {
        
        super(username, password);
        
       try{ 
          
        this.price = price;
        this.hotel_services = hotel_services;
        this.numberofrooms = numberofrooms;
        this.hotel_name = hotel_name;
    }  
       catch(InputMismatchException e){
          JOptionPane.showMessageDialog(null,"somethong went wrong with your insertion");
          
      }
        catch(Exception e){
      JOptionPane.showMessageDialog(null,"Error !");
      }
    }

    public int getPrice() {
        return price;
    }
    public String getHotel_services() {
        return hotel_services;
    }
    public int getNumberofrooms() {
        return numberofrooms;
    }
    public String getHotel_name() {
        return hotel_name;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }


}
class reservation{
int resrevation_num,room_num;
Date arrivaildate;
Date Departuredate;

    public reservation() {
    }

   public reservation(int resrevation_num, int room_num, Date arrivaildate, Date Departuredate) {
        this.resrevation_num = resrevation_num;
        this.room_num = room_num;
        this.arrivaildate = arrivaildate;
        this.Departuredate = Departuredate;
    }

   public int getResrevation_num() {
        return resrevation_num;
    }
    public int getRoom_num() {
        return room_num;
    }
    public Date getArrivaildate() {
        return arrivaildate;
    }
   
}


public class Itravel {

    public static void main(String[] args) {
       
    }
    
}
