/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falconflights;

/**
 *
 * @author 1893541
 */
public class Agent extends Employee{
    Details details1=new Details();
    String Gender;
    public static String Agent(String Gender){
        //this.Gender=Gender;
        return Gender;
    }
    public void setGender(String Gender){
        this.Gender=Gender;
    }
     public String getGender(){
            return Gender;
        }
}
