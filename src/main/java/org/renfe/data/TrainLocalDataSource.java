package org.renfe.data;

import org.renfe.domain.TrainModel;

import java.util.ArrayList;
import java.util.Objects;

public class TrainLocalDataSource {
    private static TrainLocalDataSource instance = null;
    private ArrayList<TrainModel> storage = new ArrayList<>();

    public TrainLocalDataSource() {
        this.storage = storage;
    }
    public  void saveStudent(TrainModel studentModel){
        storage.add(studentModel);
    }
    public void delete(String id ){
        storage.removeIf(studentModel -> Objects.equals(studentModel.getId(),id));
    }
    public ArrayList<TrainModel>getALLStudents(){
        return storage ;
    }
    public  static TrainLocalDataSource getInstance(){
        if (instance == null ){
            instance =new TrainLocalDataSource();
        }
        return instance ;
    }
}

