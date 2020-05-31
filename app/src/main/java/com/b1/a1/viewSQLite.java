package com.b1.a1;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
    	import android.text.method.ScrollingMovementMethod;
        import android.widget.TextView;




public class viewSQLite {
            @Override
	    protected void onCreate(Bundle savedInstanceState) {
        	        super.onCreate(savedInstanceState);
        	        setContentView(R.layout.view_sqlite_data);

        	        TextView textView = findViewById(R.id.view_data);

        	        DbHelper db = new DbHelper(this);

        	        String data = db.getData();
        	        textView.setText(data);
        	        textView.setMovementMethod(new ScrollingMovementMethod());
        	    }
}
