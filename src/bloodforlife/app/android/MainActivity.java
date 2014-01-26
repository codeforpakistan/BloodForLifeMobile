package bloodforlife.app.android;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity implements OnItemSelectedListener
{
	Spinner Spin1;
	Spinner Spin2;
	
	
	
	String myString1[] = {"Lahore","Karachi","Islamabad","Rawalpindi","Lahore","Faisalabad","Gujranwala","Hyderabad"};
	
	/*{"Ahmadpur East" ,
		"Arifwala",
		"Attock City",
		"Badin",
		"Bahawalnagar",
		"Bahawalpur",
		"Bhakkar",
		"Bhalwal",
		"Burewala",
		"Chakwal",
		"Chaman",
		"Charsadda",
		"Chichawatni",
		"Chiniot",
		"Chishtian Mandi",
		"Chuhar Kana",
		"Dadu",
		"Daska",
		"Dera Ghazi Khan",
		"Dera Ismail Khan",
		"Dipalpur",
		"Faisalabad",
		"Gawadar",
		"Ghotki",
		"Gojra",
		"Gujar Khan",
		"Gujranwala",
		"Gujrat",
		"Hafizabad",
		"Harunabad",
		"Hasilpur",
		"Haveli",
		"Hyderabad",
		"Islamabad",
		"Jacobabad",
		"Jalalpur",
		"Jaranwala",
		"Jhang Sadr",
		"Jhelum",
		"Kahror Pakka",
		"Kamalia",
		"Kambar",
		"Kamoke",
		"Kandhkot",
		"Karachi",
		"Kashmore",
		"Kasur",
		"Khairpur",
		"Khanpur",
		"Kharian",
		"Khushab",
		"Khuzdar",
		"Kohat",
		"Kot Addu",
		"Kot Malik",
		"Kotri",
		"Lahore",
		"Lala Musa",
		"Larkana",
		"Leiah",
		"Lodhran",
		"Mailsi",
		"Mandi Bahauddin",
		"Mansehra",
		"Mardan",
		"Mian Channun",
		"Mianwali",
		"Mingaora",
		"Mirpur Khas",
		"Moro",
		"Multan",
		"Muridke",
		"Muzaffargarh",
		"Narowal",
		"Nawabshah",
		"Nowshera Cantonment",
		"Okara",
		"Pakpattan",
		"Pano Aqil",
		"Pattoki",
		"Peshawar",
		"Quetta",
		"Rawalpindi",
		"Sadiqabad",
		"Sahiwal",
		"Sargodha",
		"Shabqadar",
		"Shahdadkot",
		"Shahdadpur",
		"Shekhupura",
		"Shikarpur",
		"Shorko",
		"Shujaabad",
		"Sialkot",
		"Sibi",
		"Sukkur",
		"Swabi",
		"Swat",
		"Tando Adam",
		"Tando Allahyar",
		"Tando Muhammad Khan",
		"Toba Tek Singh",
		"Turbat",
		"Vihari",
		"Wazirabad" };*/

String myString2[] = {"A+",
					"B+",
					"AB+",
					"A-",
					"B-",
					"AB-",
					"O+",
					"O-"};
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		
		ArrayAdapter<String> adapt1 , adapt2;
		adapt1 = new ArrayAdapter<String> (this, android.R.layout.simple_dropdown_item_1line,myString1);
		adapt2 = new ArrayAdapter<String> (this, android.R.layout.simple_dropdown_item_1line,myString2);
		
		Spin1 = (Spinner) this.findViewById(R.id.spinner1);
		Spin2 = (Spinner) this.findViewById(R.id.spinner2);
		
		Spin1.setAdapter(adapt1);
		Spin2.setAdapter(adapt2);
		
		
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
			long arg3) 
	{
		 
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void openR(View v){
		//String url="http://bloodforlife.com.pk/joinus_doner.php";
				//Intent i= new Intent(Intent.ACTION_VIEW);
				//i.setData(Uri.parse(url));
				//startActivity(i);
				//WebView webView = new WebView(this); //(WebView)findViewById(R.id.webView);
				//you can load an html code 
				//webView.loadData("yourCode Html to load on the webView " , "text/html" , "utf-8");
				// you can load an URL 
				//webView.loadUrl(url);
				Intent i=new Intent(this,Register.class);
				this.startActivity(i);
	}
	
	public void openS(View v){
		/*String url="http://bloodforlife.com.pk/login.php";
		Intent i= new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);*/
		Intent i=new Intent(this,Signin.class);
		this.startActivity(i);
	}
	
	public void opensearch(View v)
	{
		String url="";
		//String url="http://bloodforlife.com.pk/search_results.php?city="+Spin1.getSelectedItem().toString()+"&blood_group="+pars+"%2B&start=0&Search=Search";
		/*Intent i= new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);*/

		Intent i=new Intent(this,Search.class);
		i.putExtra("url", "http://54.201.39.41:3000/search?group="+Spin2.getSelectedItem().toString()+"&city="+Spin1.getSelectedItem().toString());
		this.startActivity(i);
	}
	
	
}
