package com.example.mvvmapp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmapp.pojo.Data;

import java.util.ArrayList;

public class MovieViewModel extends ViewModel {

    //3 --> parameter to get movieName with LiveData
    //3.1 --> LiveData and MutableLiveData

    public MutableLiveData<ArrayList<Data>> movieNameMutableLiveData = new MutableLiveData<>();

    //4 --> fun in main to tell the ViewModel to get the movie name when user event the button
    public void getMovieName(){
        movieNameMutableLiveData.setValue(getMovieFromDataBase());
    }

    //MVVM ..
    //1 --> dependency in gradle

    //2 --> get and set data
    private ArrayList<Data> getMovieFromDataBase (){
        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data("Cast Away","1999","Noo",1));
        arrayList.add(new Data("Cast Away2","1999","Noo",2));
        arrayList.add(new Data("Cast Away3","1999","Noo",3));
        arrayList.add(new Data("Cast Away4","1999","Noo",4));
        arrayList.add(new Data("Cast Away5","1999","Noo",5));
        arrayList.add(new Data("Cast Away6","1999","Noo",6));

        return arrayList;

    }



}
