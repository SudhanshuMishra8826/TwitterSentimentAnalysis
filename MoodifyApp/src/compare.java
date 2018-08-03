/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu Mishra
 */
public class compare {
    public compare(){

    }
    public String compareDoubleValues(double a,double b,double c){
        String result="null";
        if(a>b){
            if(a>c){
                result="POSSITIVE";
            }
            else {
                result="NEUTRAL";
            }
        }
        else if(b>a){
            if(b>c){
                result="NEGATIVE";;
            }
            else {
                result="NEUTRAL";
            }
        }
        return result;

        }
}
