package dodo1305.kr.hs.emirim.favoritegamer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,View.OnClickListener{
    CheckBox checkSelect;
    TextView textQuest;
    RadioGroup rg;
    RadioButton radioEsca, radioRyu, radioTobi;
    Button butOk;
    ImageView imgvgamer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect = (CheckBox)findViewById(R.id.check_select);
        textQuest = (TextView) findViewById(R.id.msg_quest);
        rg = (RadioGroup) findViewById(R.id.rg);
        radioEsca = (RadioButton)findViewById(R.id.radio_esca);
        radioRyu = (RadioButton)findViewById(R.id.radio_ryu);
        radioTobi = (RadioButton)findViewById(R.id.radio_tobi);
        butOk = (Button)findViewById(R.id.but_ok);
        imgvgamer = (ImageView)findViewById(R.id.imgv_gamer);

        checkSelect.setOnCheckedChangeListener(this);
        butOk.setOnClickListener(this);


    } //onCreate

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butOk.setVisibility(View.VISIBLE);
            imgvgamer.setVisibility(View.VISIBLE);
        }
        else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butOk.setVisibility(View.INVISIBLE);
            imgvgamer.setVisibility(View.INVISIBLE);

        }
    }

    @Override
    public void onClick(View v) {
        switch(rg.getCheckedRadioButtonId()){
            case R.id.radio_esca: imgvgamer.setImageResource(R.drawable.esca);
                break;
            case R.id.radio_ryu: imgvgamer.setImageResource(R.drawable.ryujehong);
                break;
            case R.id.radio_tobi: imgvgamer.setImageResource(R.drawable.tobi);
                break;
            default:
                Toast.makeText(this,"라디오 버튼을 선택해주세요",Toast.LENGTH_SHORT).show();

        }
    }
}
