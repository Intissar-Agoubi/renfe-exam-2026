package org.renfe.presentation;

import org.renfe.data.TrainDataRepository;
import org.renfe.data.TrainLocalDataSource;
import org.renfe.domain.DeleteTrainUseCase;
import org.renfe.domain.GetAllTrainsUseCase;
import org.renfe.domain.SavetrainUseCase;
import org.renfe.domain.TrainModel;

import java.util.ArrayList;

public class TrainView {
    public static void funtion1(){
        printTrains();
        saveTrain();
        printTrains();
    }
    public  static void function2(){
        printTrains();
    }
    public  static  void function3(){
        printTrains();
        deleteTrain("FF23");
        printTrains();
    }

    public static void printTrains() {
        GetAllTrainsUseCase getAllTrainsUseCase = new GetAllTrainsUseCase(new TrainDataRepository(TrainLocalDataSource.getInstance()));
        ArrayList<TrainModel> trains = getAllTrainsUseCase.execute();
        System.out.println("Trains " +trains);
    }
    public static void saveTrain() {
        TrainModel trainModel =new TrainModel("EERRFF","cercanias","tgv","paris");
        SavetrainUseCase savetrainUseCase= new SavetrainUseCase(new TrainDataRepository(TrainLocalDataSource.getInstance()));
        savetrainUseCase.execute(trainModel);

    }
    public static void deleteTrain(String id ){
        DeleteTrainUseCase deleteTrainUseCase = new DeleteTrainUseCase(new TrainDataRepository(TrainLocalDataSource.getInstance()));
        deleteTrainUseCase.execute(id);
    }

}
