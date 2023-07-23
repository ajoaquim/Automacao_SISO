package Ultils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TEST {

	public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("C:/Users/jpbrito/Documents/Automatização/ProjetoSISO/Automacao_SISO/src/main/resources/employees.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;

            //Iterate over employee array
           employeeList.forEach( emp -> System.out.println(parseEmployeeObject( (JSONObject) emp )));
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static String parseEmployeeObject(JSONObject employee) 
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");
        return firstName;
//        System.out.println("First Name: "+firstName);
//         
//        //Get employee last name
//        String lastName = (String) employeeObject.get("lastName");  
//        System.out.println("Last Name: " + lastName);
//         
//        //Get employee website name
//        String website = (String) employeeObject.get("website");    
//        System.out.println("Website: "+website);
    }

}
