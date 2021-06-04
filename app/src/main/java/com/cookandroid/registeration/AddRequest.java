package com.cookandroid.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class AddRequest extends StringRequest {

    final static private String URL = "https://sooowhat.cafe24.com/CourseAdd.php";
    private Map<String, String> parameters;

    public AddRequest(String userEmail, String courseID, String Priority, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userEmail", userEmail);
        parameters.put("courseID", courseID);
        parameters.put("Priority", Priority);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}