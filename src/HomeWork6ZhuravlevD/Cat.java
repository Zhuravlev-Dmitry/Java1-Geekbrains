package HomeWork6ZhuravlevD;

public class Cat extends Animals {
        public Cat(String name, float maxDistRun, float maxDistSwim) {
            super(name, maxDistRun, maxDistSwim);
        }
    public int swim(float distance) {
        return Animals.notSwim;
    }
}


