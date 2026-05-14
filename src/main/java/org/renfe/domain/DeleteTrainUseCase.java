package org.renfe.domain;

public class DeleteTrainUseCase {
    private  TrainRepository trainRepository ;

    public DeleteTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }
    public void  execute (String id ){
       trainRepository.deleteTrain(id);
}
}
