package domain;

import utils.NumberGenerator;

public class Car {
    private final static int BASE_NUMBER = 4;
    private final CarName name;
    private final Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = new Position(position);
    }

    public void move(NumberGenerator numberGenerator) {
        int movableNumber = numberGenerator.generate();
        if (isAtLeastBaseNumber(movableNumber)) {
            goForward();
        }
    }

    private void goForward() {
        this.position.increase();
    }

    public int getPosition() {
        return this.position.getValue();
    }

    public String getName() {
        return this.name.getValue();
    }

    private boolean isAtLeastBaseNumber(int number) {
        return BASE_NUMBER <= number;
    }



}
