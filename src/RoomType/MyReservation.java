
package RoomType;


public class MyReservation {
    
    int Reservation_Id;
    String Description;
    String Check_IN_Date;
    String Check_OUT_Date;
    String username;
    int Room_ID;
    
    public MyReservation(int Reservation_Id ,String Description, String Check_IN_Date, String Check_OUT_Date,String username, int Room_ID){
    this.Reservation_Id = Reservation_Id;
    this.Description= Description;
    this.Check_IN_Date = Check_IN_Date;
    this.Check_OUT_Date= Check_OUT_Date;
    this.username= username;
    this.Room_ID= Room_ID;
    }
    
    public int getReservation_Id(){
        return Reservation_Id;
    }
    
    public String getDescription(){
        return Description;
    }
    
     public String getCheck_IN_Date(){
        return Check_IN_Date;
    }
     
      public String getCheck_OUT_Date(){
        return Check_OUT_Date;
    }
     
      public String getusername(){
        return username;
    }
      
       public int getRoom_ID(){
        return Room_ID;
    }
       
       
       
       
}
