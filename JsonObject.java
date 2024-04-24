import org.json.JSONException;
import org.json.JSONObject;

public class Person {
    public static void main(String[] args) {
        // স্ট্রিং থেকে জেসন অবজেক্টে পার্স
        String jsonString = "{\"name\":\"John\", \"age\":30}";
        try {
            JSONObject jsonObject = new JSONObject(jsonString);

            // প্রোপার্টি অ্যাক্সেস
            String name = jsonObject.getString("name");
            int age = jsonObject.getInt("age");

            // প্রিন্ট করুন
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}