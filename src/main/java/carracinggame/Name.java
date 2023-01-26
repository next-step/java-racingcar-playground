package carracinggame;



public class Name {
    String name;

    public Name(String name) {
        if(name.isBlank())
            throw new IllegalArgumentException("빈값은 입력 불가 합니다.");

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
