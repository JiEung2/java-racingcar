package domain;

public class CarName {
    private final static int MAX_NAME_LENGTH = 5;
    private final String value;

    public CarName(String name) {
        validateName(name);
        this.value = name;
    }

    public String getValue() {
        return this.value;
    }

    private void validateName(String name) {
        if (exceedsMaxNameLength(name)) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
    }

    private boolean exceedsMaxNameLength(String name) {
        return name.length() > MAX_NAME_LENGTH;
    }
}
