package com.example.darkmode;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static android.widget.Toast.makeText;

public class googlef extends AppCompatActivity implements View.OnClickListener {

    private EditText editEmail,editPhone,editFirstname,editOffering;
    private Button buttonRegister;
    private ProgressDialog progressDialog;
    private ArrayList<String> result;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_googlef);

        editFirstname=(EditText)findViewById(R.id.firstname);
        editEmail=(EditText)findViewById(R.id.email);
        editPhone=(EditText)findViewById(R.id.phonenumber);
        editOffering=(EditText)findViewById(R.id.offering);





        buttonRegister=(Button)findViewById(R.id.buttonRegister);

        progressDialog=new ProgressDialog(this);

        buttonRegister.setOnClickListener(this);



    }

    private void googleForm()
    {

        final String firstname=editFirstname.getText().toString().trim();
        final String email=editEmail.getText().toString().trim();
        final String phonenumber=editPhone.getText().toString().trim();
        final String offering=editOffering.getText().toString().trim();


        progressDialog.setMessage("Registering User.....");
        progressDialog.show();

        StringRequest stringRequest=new StringRequest(Request.Method.POST, Constants.URL_GOOGLEFORM, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                progressDialog.dismiss();
                try
                {
                    JSONObject jsonObject=new JSONObject(response);

                    makeText(getApplicationContext(),jsonObject.getString("message"), Toast.LENGTH_LONG).show();

                }
                catch (JSONException e)
                {
                    e.printStackTrace();
                }


            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.hide();
                        makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params=new HashMap<>();

                params.put("firstName",firstname);
                params.put("email",email);
                params.put("phoneNumber",phonenumber);
                params.put("offering",offering);

                return params;
            }
        };

        RequestHandler.getInstance(this).addToRequestQueue(stringRequest);

    }

    @Override
    public void onClick(View view)
    {
        if(view==buttonRegister)
        {
            googleForm();
        }


    }
}