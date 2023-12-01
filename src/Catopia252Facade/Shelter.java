/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catopia252Facade;


import java.util.*;
import Catopia252Proxy.Client;

public class Shelter extends user{
    private String ShelterName;
    private boolean Verification;
    private ArrayList<String> RecievedDonation;
    private ArrayList<Appointment> ReservedAppointment;

    public Shelter(String ShelterName, boolean Verification, ArrayList<String> RecievedDonation, ArrayList<Appointment> ReservedAppointment) {
        this.ShelterName = ShelterName;
        this.Verification = Verification;
        this.RecievedDonation = RecievedDonation;
        this.ReservedAppointment = ReservedAppointment;
    }

    public Shelter() {
    }

    public String getShelterName() {
        return ShelterName;
    }

    public void isVerification() {
        Client obj=new Client();
        //obj.main(null);
        String[] arg={};
        Client.main(arg);
    }

    public ArrayList<String> getRecievedDonation() {
        return RecievedDonation;
    }

    public ArrayList<Appointment> getReservedAppointment() {
        return ReservedAppointment;
    }

    public void setShelterName(String ShelterName) {
        this.ShelterName = ShelterName;
    }

    public void setVerification(boolean Verification) {
        this.Verification = Verification;
    }

    public void setRecievedDonation(ArrayList<String> RecievedDonation) {
        this.RecievedDonation = RecievedDonation;
    }

    public void setReservedAppointment(ArrayList<Appointment> ReservedAppointment) {
        this.ReservedAppointment = ReservedAppointment;
    }
    
  
     public Appointment searchAppointment(String date){
  for (int i = 0; i < ReservedAppointment.size(); i++){
      if (ReservedAppointment.get(i).getDate().equalsIgnoreCase(date))
          return ReservedAppointment.get(i);
  }
  return null;
     }
   
  
    

}