package com.example.tic_tac_toe;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tictactoe.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button[]=new Button[9];
    Button Start,Exit,reset;
    TextView headerText;
    int player_O = 0;
    int player_X =0;
    String StartGame="x";
    int xcnt=0;
    int ocnt=0;

    int cnt=0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headerText=findViewById(R.id.header_text);
        Start=findViewById(R.id.Start);
        reset=findViewById(R.id.reset);
        Exit=findViewById(R.id.Exit);
        Start.setOnClickListener(this);
        reset.setOnClickListener(this);
        Exit.setOnClickListener(this);
       for (int i=0;i<button.length;i++)
       {
           int id=getResources().getIdentifier("btn"+i, "id",getPackageName());
           button[i]=findViewById(id);
           button[i].setOnClickListener(this);
       }
    }


    @Override
    public void onClick(View v)
    {
        if(v.getId()==button[0].getId())
        {
              if(cnt%2==0)
              {
                  button[0].setText("O");


              }
              else if(cnt%2==1)
              {
                  button[0].setText("X");

              }
              win();
              cnt++;
            button[0].setEnabled(false);
        }
        if(v.getId()==button[1].getId())
        {
            if(cnt%2==0)
            {
                button[1].setText("O");


            }
            else if(cnt%2==1)
            {
                button[1].setText("X");

            }
            cnt++;
            button[1].setEnabled(false);
            win();
        }
        if(v.getId()==button[2].getId()) {
            if (cnt % 2 == 0) {
                button[2].setText("O");


            } else if (cnt % 2 == 1) {
                button[2].setText("X");

            }
            cnt++;
            button[2].setEnabled(false);
            win();
        }
        if(v.getId()==button[3].getId())
        {
            if(cnt%2==0)
            {
                button[3].setText("O");


            }
            else if(cnt%2==1)
            {
                button[3].setText("X");

            }
            win();
            cnt++;
            button[3].setEnabled(false);
        }
        if(v.getId()==button[4].getId())
        {
            if(cnt%2==0)
            {
                button[4].setText("O");


            }
            else if(cnt%2==1)
            {
                button[4].setText("X");

            }
            cnt++;
            button[4].setEnabled(false);
            win();
        }
        if(v.getId()==button[5].getId())
        {
            if(cnt%2==0)
            {
                button[5].setText("O");


            }
            else if(cnt%2==1)
            {
                button[5].setText("X");

            }
            cnt++;
            button[5].setEnabled(false);
            win();
        }
        if(v.getId()==button[6].getId())
        {
            if(cnt%2==0)
            {
                button[6].setText("O");


            }
            else if(cnt%2==1)
            {
                button[6].setText("X");

            }
            cnt++;
            button[6].setEnabled(false);
            win();
        }
        if(v.getId()==button[7].getId())
        {
            if(cnt%2==0)
            {
                button[7].setText("O");


            }
            else if(cnt%2==1)
            {
                button[7].setText("X");

            }
            cnt++;
            button[7].setEnabled(false);
            win();
        }
        if(v.getId()==button[8].getId())
        {
            if(cnt%2==0)
            {
                button[8].setText("O");


            }
            else if(cnt%2==1)
            {
                button[8].setText("X");

            }
            cnt++;
            button[8].setEnabled(false);
            win();
        }

        if(v.getId()==reset.getId())
        {
            button[0].setEnabled(true);
            button[1].setEnabled(true);
            button[2].setEnabled(true);
            button[3].setEnabled(true);
            button[4].setEnabled(true);
            button[5].setEnabled(true);
            button[6].setEnabled(true);
            button[7].setEnabled(true);
            button[8].setEnabled(true);

            button[0].setText(" ");
            button[1].setText(" ");
            button[2].setText(" ");
            button[3].setText(" ");
            button[4].setText(" ");
            button[5].setText(" ");
            button[6].setText(" ");
            button[7].setText(" ");
            button[8].setText(" ");
        }
        if (v.getId()==Start.getId())
        {
            button[0].setEnabled(true);
            button[1].setEnabled(true);
            button[2].setEnabled(true);
            button[3].setEnabled(true);
            button[4].setEnabled(true);
            button[5].setEnabled(true);
            button[6].setEnabled(true);
            button[7].setEnabled(true);
            button[8].setEnabled(true);

            button[0].setText(" ");
            button[1].setText(" ");
            button[2].setText(" ");
            button[3].setText(" ");
            button[4].setText(" ");
            button[5].setText(" ");
            button[6].setText(" ");
            button[7].setText(" ");
            button[8].setText(" ");

              }
        if (v.getId()==Exit.getId())
        {

            finishAffinity();
        }

    }

    private void Declaring()
    {
        if (StartGame.equalsIgnoreCase("x"))
        {
            StartGame="o";
        }
        else
        {
            StartGame="x";
        }
    }   

    void win()
    {
        if (button[0].getText().toString().equalsIgnoreCase("o") && button[1].getText().toString().equalsIgnoreCase("o") && button[2].getText().toString().equalsIgnoreCase("o"))
        {
            System.out.println(" =*{{ o is win }}*=");
            headerText.setText("=* {{ o is win }}*=");
            player_O++;
            ocnt ++;
        }
        else if (button[0].getText().toString().equalsIgnoreCase("x") && button[1].getText().toString().equalsIgnoreCase("x") && button[2].getText().toString().equalsIgnoreCase("x"))
        {
            System.out.println(" =*{{ x is win }}*=");
            headerText.setText("=* {{ x is win }}*=");
            player_X++;
            xcnt++;
        }
        if (button[3].getText().toString().equalsIgnoreCase("o") && button[4].getText().toString().equalsIgnoreCase("o") && button[5].getText().toString().equalsIgnoreCase("o"))
        {
            System.out.println(" =*{{ o is win }}*=");
            headerText.setText("=* {{ o is win }}*=");
            player_O++;
            ocnt++;
        }
        else if (button[3].getText().toString().equalsIgnoreCase("x") && button[4].getText().toString().equalsIgnoreCase("x") && button[5].getText().toString().equalsIgnoreCase("x"))
        {
            System.out.println(" =*{{ x is win }}*=");
            headerText.setText("=* {{ x is win }}*=");
            player_X++;

        }
        if (button[6].getText().toString().equalsIgnoreCase("o") && button[7].getText().toString().equalsIgnoreCase("o") && button[8].getText().toString().equalsIgnoreCase("o"))
        {
            System.out.println(" =*{{ o is win }}*=");
            headerText.setText("=* {{ o is win }}*=");
            player_O++;

        }
        else if (button[6].getText().toString().equalsIgnoreCase("x") && button[7].getText().toString().equalsIgnoreCase("x") && button[8].getText().toString().equalsIgnoreCase("x"))
        {
            System.out.println(" =*{{ x is win }}*=");
            headerText.setText("=* {{ x is win }}*=");
            player_X++;

        }
        if (button[0].getText().toString().equalsIgnoreCase("o") && button[3].getText().toString().equalsIgnoreCase("o") && button[6].getText().toString().equalsIgnoreCase("o"))
        {
            System.out.println(" =*{{ o is win }}*=");
            headerText.setText("=* {{ o is win }}*=");
            player_O++;

        }
        else if (button[0].getText().toString().equalsIgnoreCase("x") && button[3].getText().toString().equalsIgnoreCase("x") && button[6].getText().toString().equalsIgnoreCase("x"))
        {
            System.out.println(" =*{{ x is win }}*=");
            headerText.setText("=* {{ x is win }}*=");
            player_X++;

        }
        if (button[1].getText().toString().equalsIgnoreCase("o") && button[4].getText().toString().equalsIgnoreCase("o") && button[7].getText().toString().equalsIgnoreCase("o"))
        {
            System.out.println(" =*{{ o is win }}*=");
            headerText.setText("=* {{ o is win }}*=");
            player_O++;

        }
        else if (button[1].getText().toString().equalsIgnoreCase("x") && button[4].getText().toString().equalsIgnoreCase("x") && button[7].getText().toString().equalsIgnoreCase("x"))
        {
            System.out.println(" =*{{ x is win }}*=");
            headerText.setText("=* {{ x is win }}*=");
            player_X++;

        }
        if (button[2].getText().toString().equalsIgnoreCase("o") && button[5].getText().toString().equalsIgnoreCase("o") && button[8].getText().toString().equalsIgnoreCase("o"))
        {
            System.out.println(" =*{{ o is win }}*=");
            headerText.setText("=* {{ o is win }}*=");
            player_O++;

        }
        else if (button[2].getText().toString().equalsIgnoreCase("x") && button[5].getText().toString().equalsIgnoreCase("x") && button[8].getText().toString().equalsIgnoreCase("x"))
        {
            System.out.println(" =*{{ x is win }}*=");
            headerText.setText("=* {{ x is win }}*=");
            player_X++;

        }

        if (button[0].getText().toString().equalsIgnoreCase("o") && button[4].getText().toString().equalsIgnoreCase("o") && button[8].getText().toString().equalsIgnoreCase("o"))
        {
            System.out.println(" =*{{ o is win }}*=");
            headerText.setText("=* {{ o is win }}*=");
            player_O++;

        }
        else if (button[0].getText().toString().equalsIgnoreCase("x") && button[4].getText().toString().equalsIgnoreCase("x") && button[8].getText().toString().equalsIgnoreCase("x"))
        {
            System.out.println(" =*{{ x is win }}*=");
            headerText.setText("=* {{ x is win }}*=");
            player_X++;

        }
        if (button[2].getText().toString().equalsIgnoreCase("o") && button[4].getText().toString().equalsIgnoreCase("o") && button[6].getText().toString().equalsIgnoreCase("o"))
        {
            System.out.println(" =*{{ o is win }}*=");
            headerText.setText("=* {{ o is win }}*=");
            player_O++;

        }
        else if (button[2].getText().toString().equalsIgnoreCase("x") && button[4].getText().toString().equalsIgnoreCase("x") && button[6].getText().toString().equalsIgnoreCase("x"))
        {
            System.out.println(" =*{{ x is win }}*=");
            headerText.setText("=* {{ x is win }}*=");
            player_X++;

        }

    }

}