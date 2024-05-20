package racingCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarReportTest {

    @DisplayName("전진하는 자동차 출력")
    @Test
    void 전진하는_자동차_출력(){
        String names = "gabe,abc,bibi";
        CarList carList = new CarList(names);
        CarReport report = new CarReport();
        report.print(carList.getCars());
    }




}



