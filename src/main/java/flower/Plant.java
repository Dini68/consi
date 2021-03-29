package flower;

class Plant {
    String getName() {
        return "plant";
    }
    Plant getType() {
        return this;
    }
}

class Flower extends Plant {
    Plant getType() {
        return this;
    }
}

class Tulip extends Plant{

}