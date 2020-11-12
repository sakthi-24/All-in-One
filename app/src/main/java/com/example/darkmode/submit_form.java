package com.example.darkmode;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
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

public class submit_form extends AppCompatActivity implements View.OnClickListener {

    private EditText editEmail,editPhone,editFirstname,editLastname,editBranch,editPass,editDegree,editExam,editAchieve,editPresent,
             editDesignation,editEntrepreneur,editEmployee,editAwards,editContribution,editDisplay;
    private CheckBox cRotary,cLion,cJaycees,cOthers;
    private TextView mresult;
    private Button buttonRegister,photo;
    private ProgressDialog progressDialog;
    private ArrayList<String>  result;

    private String checkBoxChoices ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_form);

        editFirstname=(EditText)findViewById(R.id.firstname);
        editLastname=(EditText)findViewById(R.id.lastname);
        editEmail=(EditText)findViewById(R.id.email);
        editPass=(EditText)findViewById(R.id.pass);
        editPhone=(EditText)findViewById(R.id.phonenumber);
        editBranch=(EditText)findViewById(R.id.branch);
        editDegree=(EditText)findViewById(R.id.degree);
        editExam=(EditText)findViewById(R.id.exam);
        editAchieve=(EditText)findViewById(R.id.achieve);
        editPresent=(EditText)findViewById(R.id.present);
        editDesignation=(EditText)findViewById(R.id.designation);
        editEntrepreneur=(EditText)findViewById(R.id.entrepreneur);
        editEmployee=(EditText)findViewById(R.id.employee);
        editAwards=(EditText)findViewById(R.id.awards);
        editContribution=(EditText)findViewById(R.id.contribution);
        editDisplay=(EditText)findViewById(R.id.display);
        cRotary=(CheckBox)findViewById(R.id.rotary);
        cLion=(CheckBox)findViewById(R.id.lion);
        cJaycees=(CheckBox)findViewById(R.id.jaycees);
        cOthers=(CheckBox)findViewById(R.id.others);






        buttonRegister=(Button)findViewById(R.id.buttonRegister);

        progressDialog=new ProgressDialog(this);

        buttonRegister.setOnClickListener(this);



    }

    private void achieveForm()
    {

        final String firstname=editFirstname.getText().toString().trim();
        final String lastname=editLastname.getText().toString().trim();
        final String email=editEmail.getText().toString().trim();
        final String pass=editPass.getText().toString().trim();
        final String phonenumber=editPhone.getText().toString().trim();
        final String branch=editBranch.getText().toString().trim();
        final String degree=editDegree.getText().toString().trim();
        final String exam=editExam.getText().toString().trim();
        final String achieve=editAchieve.getText().toString().trim();
        final String present=editPresent.getText().toString().trim();
        final String designation=editDesignation.getText().toString().trim();
        final String entrepreneur=editEntrepreneur.getText().toString().trim();
        final String employee=editEmployee.getText().toString().trim();
        final String awards=editAwards.getText().toString().trim();
        final String contribution=editContribution.getText().toString().trim();
        final String display=editDisplay.getText().toString().trim();

        checkBoxChoices = "";

        if (cRotary.isChecked()) {
            checkBoxChoices += cRotary.getText().toString() + " ";
        }

        if (cLion.isChecked()) {
            checkBoxChoices += cLion.getText().toString() + " ";
        }

        if (cJaycees.isChecked()) {
            checkBoxChoices += cJaycees.getText().toString() + " ";
        }

        if (cOthers.isChecked()) {
            checkBoxChoices += cOthers.getText().toString() + " ";
        }


        final String member=checkBoxChoices;



        progressDialog.setMessage("Registering User.....");
        progressDialog.show();

        StringRequest stringRequest=new StringRequest(Request.Method.POST, Constants.URL_ACHIEVEFORM, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                progressDialog.dismiss();
                try
                {
                    JSONObject jsonObject=new JSONObject(response);

                    Toast.makeText(getApplicationContext(),jsonObject.getString("message"),Toast.LENGTH_LONG).show();

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
                params.put("lastName",lastname);
                params.put("email",email);
                params.put("year",pass);
                params.put("branch",branch);
                params.put("phoneNumber",phonenumber);
                params.put("hDegree",degree);
                params.put("cExam",exam);
                params.put("position",achieve);
                params.put("organization",present);
                params.put("designation",designation);
                params.put("owner",entrepreneur);
                params.put("employee",employee);
                params.put("awards",awards);
                params.put("contribution",contribution);
                params.put("line",display);
                params.put("member",member);
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
            achieveForm();
        }


}
}