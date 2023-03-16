package car;

import java.util.Objects;

public class CarName {
    private final String name;

    public CarName(String name) {
        vaildation(name);
        this.name = name;
    }

    private void vaildation(String name){
        if( name.isEmpty() ){
            throw new IllegalArgumentException("이름은 최소 1글자이상 되어야 합니다");
        }

        if( name.length() > 5 ){
            throw new IllegalArgumentException("이름은 최대 5글자입니다");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
