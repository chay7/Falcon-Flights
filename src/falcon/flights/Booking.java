/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falcon.flights;

import java.util.Date;

/**
 *
 * @author 1893541
 */
public class Booking {
    Date dateOfBooking;
    
    public void Booking(Date dateOfBooking){
        this.dateOfBooking=dateOfBooking;
    }
    public Date getdateOfBooking(){
        return dateOfBooking;
    }
    public void setdateOfBooking(Date dateOfBooking){
        this.dateOfBooking=dateOfBooking;
    }
}
