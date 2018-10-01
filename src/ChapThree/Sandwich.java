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
public class Sandwich {
    String mainIngredient;
    String breadType;
    double price;
    
    String getMainIngredient(){
        return mainIngredient;
    }
    String getBreadType(){
        return breadType;
    }
    double getPrice(){
        return price;
    }
    void setMainIngredient(String ingredient){
        this.mainIngredient = ingredient;
    }
    void setBreadType(String breadType){
        this.breadType = breadType;
    }
    void setPrice(double price){
        this.price = price;
    }
    
}
