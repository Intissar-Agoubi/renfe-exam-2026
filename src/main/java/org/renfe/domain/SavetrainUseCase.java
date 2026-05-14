package org.renfe.domain;

public class SavetrainUseCase {
    private TrainRepository trainRepository ;

    public SavetrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }
    public void  execute(TrainModel trainModel){
    trainRepository.saveTrain(trainModel);
    }
}
