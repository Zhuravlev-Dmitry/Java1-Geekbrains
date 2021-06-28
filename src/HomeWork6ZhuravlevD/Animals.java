package HomeWork6ZhuravlevD;
//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
// собака 10 м.).

public class Animals {
    String name;
    private float maxDistRun;
    private float maxDistSwim;
    static final int SwimNot = 99;
    static final int swimAvailable = 1;
    static final int notSwim = -1;

    public Animals(String name, float maxDistRun, float maxDistSwim) {
        this.name = name;
        this.maxDistRun = maxDistRun;
        this.maxDistSwim = maxDistSwim;
    }
    String getName() {
        return this.name;
    }
    float getMaxDistRun() {
        return this.maxDistRun;
    }

    float getMaxDistSwim() {
        return this.maxDistSwim;
    }
    protected boolean run(float distance) {
        return (distance <= maxDistRun);
    }
    protected int swim(float distance) {
        return (distance <= maxDistSwim) ? swimAvailable : SwimNot;
    }

}
