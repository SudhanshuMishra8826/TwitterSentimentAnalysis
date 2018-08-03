/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sudhanshu Mishra
 */
import org.json.JSONException;
import org.json.JSONObject;

public class extract{
    public extract(){

    }

    public String extractdata(String args,String ret) throws JSONException {

        JSONObject jsonObj = new JSONObject(args);
        String data = jsonObj.getString(ret);
        return(data);
    }


}