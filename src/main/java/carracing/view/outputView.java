package carracing.view;

public class outputView {

    public static final String REQUEST_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    public static final String REQUEST_GAME_COUNT = "시도할 회수는 몇회인가요?";

    public static void requestCarNameMSG(){
        System.out.println(REQUEST_CAR_NAME);
    }

    public static void requestGameCount(){
        System.out.println(REQUEST_GAME_COUNT);
    }


}
