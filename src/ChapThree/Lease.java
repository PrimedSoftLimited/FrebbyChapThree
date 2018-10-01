/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapThree;

/**
 *
 * @author Frebby
 */
public class Lease {
    String tenantName;
    int apartmentNum;
    double monthlyRent;
    int termOfLease;
    
    public Lease(){
        tenantName = "XXX";
        apartmentNum = 0;
        monthlyRent = 1000;
        termOfLease = 12;
    }
    String getTenantsName(){
        return tenantName;
    }
    int getApartmentNum(){
        return apartmentNum;
    }
    double getMonthlyRent(){
        return monthlyRent;
    }
    int getTerm(){
        return termOfLease;
    }
    void setTenantName(String tenantName){
        this.tenantName = tenantName;
    }
    void setApartmentNum(int apartmentNum){
        this.apartmentNum = apartmentNum;
    }
    void setMonthlyRent(double rent){
        this.monthlyRent = rent;
    }
    void setTerm(int term){
        this.termOfLease = term;
    }
    void addPetFee(){
        double calculating = monthlyRent + 10;
        explainPetPolicy(calculating);
    }
    static void explainPetPolicy(double petFee){
        System.out.println("Pet fee: " + petFee);
    }
}
