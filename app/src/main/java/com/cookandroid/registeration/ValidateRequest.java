package com.cookandroid.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class  ValidateRequest extends StringRequest {

    final static private String URL = "https://sooowhat.cafe24.com/UserValidate.php";
    private Map<String, String> parameters;

    public ValidateRequest(String userEmail, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userEmail", userEmail);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
