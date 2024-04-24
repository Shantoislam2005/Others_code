import org.json.JSONException;
import org.json.JSONObject;

public class Json {
    public static void main(String[] args) {
        
        String jsonString = "{\"name\":\"John\", \"age\":30}";
        try {
            JSONObject jsonObject = new JSONObject(jsonString);

            
            String name = jsonObject.getString("name");
            int age = jsonObject.getInt("age");

            
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}