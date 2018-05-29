package feltech.strixdroidshooter;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Button;
        import feltech.strixdroidshooter.actions.*;

public class MainActivity extends Activity {
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shootClick(View v) {
        TextView t = findViewById(R.id.myLabel);

        CameraActionPanel cap = new CameraActionPanel();
        t.setText(cap.shootImgToLib());
        //t.setText(String.format("we did it, reddit! %s", String.valueOf(counter)));
        counter++;
    }
}
