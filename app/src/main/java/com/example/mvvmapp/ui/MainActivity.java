package com.example.mvvmapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvvmapp.R;
import com.example.mvvmapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity{

    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Binding class
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        // this --> mean that this activity will listen to the MovieViewModel
        // .get --> refer to type of ViewModel
        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);

        //assign variable in data in xml file
        binding.setViewMod(movieViewModel);
        binding.setLifecycleOwner(this);

        //replace with on click in xml

//        binding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                movieViewModel.getMovieName();
//            }
//        });

        //replace with binding variable in xml file

//        movieViewModel.movieNameMutableLiveData.observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                binding.textView.setText(s);
//            }
//        });

    }
}