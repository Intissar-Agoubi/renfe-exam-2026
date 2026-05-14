package org.renfe.data;

import org.renfe.domain.TrainModel;
import org.renfe.domain.TrainRepository;

import java.util.ArrayList;

public class TrainDataRepository implements TrainRepository {
    private  TrainLocalDataSource trainLocalDataSource;

    public TrainDataRepository(TrainLocalDataSource trainLocalDataSource) {
        this.trainLocalDataSource = trainLocalDataSource;
    }

    @Override
    public void saveTrain(TrainModel trainModel) {
      trainLocalDataSource.saveStudent(trainModel);
    }

    @Override
    public void deleteTrain(String id) {
        trainLocalDataSource.delete(id);

    }

    @Override
    public ArrayList<TrainModel> getAllTrains() {
        return trainLocalDataSource.getALLStudents();
    }
}
