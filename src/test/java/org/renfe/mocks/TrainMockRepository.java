package org.renfe.mocks;

import org.renfe.domain.TrainModel;
import org.renfe.domain.TrainRepository;

import java.util.ArrayList;

public class TrainMockRepository implements TrainRepository {
    public Integer countSaveMethod = 0;
    public Integer countDeleteMethod = 0;

    @Override
    public ArrayList<TrainModel> getAllTrain() {
        ArrayList<TrainModel> trains = new ArrayList<>();

       trains.add(new TrainModel("EERTY11","Renfe1","tgv","tunez"));
        trains.add(new TrainModel("EErQT","Renfe2","tgv","Madrid"));
        trains.add(new TrainModel("EEWWS", "Renfe3", "TGV", "Lyon"));

        return trains;
    }
    @Override
    public void saveTrain(TrainModel trainModel) {
        countSaveMethod++;
    }

    @Override
    public void deleteTrain(String id) {
     countDeleteMethod++;
    }

    @Override
    public ArrayList<TrainModel> getAllTrains() {
        return new TrainModel("EERF","Renfe4","tgv","Barcelona");
    }
}
