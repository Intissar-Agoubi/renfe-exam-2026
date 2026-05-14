package org.renfe.mocks;

import org.renfe.domain.TrainModel;
import org.renfe.domain.TrainRepository;

import java.util.ArrayList;

public class NullTrainMockRepository implements TrainRepository {
    @Override
    public ArrayList<TrainModel> getAllTrain() {
        return null;
    }

    @Override
    public void saveTrain(TrainModel trainModel) {

    }

    @Override
    public void deleteTrain(String id) {

    }

    @Override
    public ArrayList<TrainModel> getAllTrains() {
        return null;
    }
}
