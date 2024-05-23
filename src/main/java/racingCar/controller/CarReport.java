package racingCar.controller;

import racingCar.domain.CarName;
import racingCar.domain.Position;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CarReport {

    private Map<CarName, Boolean> victoryFlag;

    public CarReport(){
        victoryFlag = new HashMap<>();
    }

    public void positionPrint(Map<CarName, Position> map){
        for (CarName key : map.keySet()){
            Position position = map.get(key);
            namePrint(key);
            System.out.println(position);
            victoryCountCheck(key, position);
        }
        System.out.println();
    }
    private void victoryCountCheck(CarName name, Position position) {
        if (position.equals(new Position(5))){
            victoryFlag.put(name, true);
        }
    }

    public Map<CarName, Boolean> getVictoryFlag() {
        return victoryFlag;
    }

    public void namePrint(CarName carName){
        String name = carName.toString();
        System.out.print(name + " : ");
    }

}
