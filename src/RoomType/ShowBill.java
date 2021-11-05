
package RoomType;


public class ShowBill {
        
    int Reservation_ID;
    int Bill_ID ;
    String User_Name;
    int Room_ID;
    int Total_Price;
    
    public ShowBill(int Bill_ID,String User_Name ,int Reservation_ID , int Room_ID, int Total_Price){
    this.Bill_ID= Bill_ID;
    this.User_Name= User_Name;
    this.Reservation_ID = Reservation_ID;
    this.Room_ID= Room_ID;
    this.Total_Price= Total_Price;
    }
    
    public int getReservation_ID(){
        return Reservation_ID;
    }
     
      public String getUser_Name(){
        return User_Name;
    }
      
       public int getRoom_ID(){
        return Room_ID;
    }
       
       public int getBill_ID(){
        return Bill_ID;
    }
       
     
       public int getTotal_Price(){
        return Total_Price;
    }
      
       
       
       
       
}

    

