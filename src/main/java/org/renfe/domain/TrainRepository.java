package org.renfe.domain;

import java.util.ArrayList;

public interface TrainRepository {
    void saveTrain(TrainModel trainModel );
    void deleteTrain(String id );
    ArrayList<TrainModel>getAllTrains();
}
