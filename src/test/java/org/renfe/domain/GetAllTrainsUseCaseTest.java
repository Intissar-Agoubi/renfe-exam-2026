package org.renfe.domain;

import org.junit.jupiter.api.Test;
import org.renfe.mocks.EmptyTrainMockRepositor;
import org.renfe.mocks.NullTrainMockRepository;
import org.renfe.mocks.TrainMockRepository;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetAllTrainsUseCaseTest {
    @Test
    public void shouldReturnTrainListWhenExecuteUseCase() {
        TrainMockRepository mockRepository = new TrainMockRepository();
        GetAllTrainsUseCase useCase = new GetAllTrainsUseCase(mockRepository);

        ArrayList<TrainModel> trains  = useCase.execute();

        assertEquals(3, trains.size());
        assertEquals("1", trains.get(0).getId());
    }
    @Test
    public void shouldReturnEmptyTrainListWhenExecuteUseCase() {
        EmptyTrainMockRepositor emptyRepository = new EmptyTrainMockRepositor();
        GetAllTrainsUseCase useCase = new GetAllTrainsUseCase(emptyRepository);

        ArrayList<TrainModel> trains = useCase.execute();

        assertEquals(0, trains.size());
    }
    @Test
    public void shouldReturnNullTrainListWhenExecuteUseCase() {
        NullTrainMockRepository nullRepository = new NullTrainMockRepository();
      GetAllTrainsUseCase useCase = new GetAllTrainsUseCase(nullRepository);

        ArrayList<TrainModel> trains = useCase.execute();

        assertNull(trains);
    }


}
