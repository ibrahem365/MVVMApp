package com.example.mvvmapp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmapp.pojo.Data;

public class MovieViewModel extends ViewModel {

    //3 --> parameter to get movieName with LiveData
    //3.1 --> LiveData and MutableLiveData

    public MutableLiveData<String> movieNameMutableLiveData = new MutableLiveData<>();

    //4 --> fun in main to tell the ViewModel to get the movie name when user event the button
    public void getMovieName(){
        String movieName = getMovieFromDataBase().getName().toString();
        movieNameMutableLiveData.setValue(movieName);
    }

    //MVVM ..
    //1 --> dependency in gradle

    //2 --> get and set data
    private Data getMovieFromDataBase (){
        return new Data("cast away","1999","very sad",1);
    }



}
