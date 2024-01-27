package apis.down;

import com.google.gson.Gson;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30}";
        Gson gson = new Gson();

        Person person = gson.fromJson(json, Person.class);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.toString());
    }

}
