package by.task10;

/**
 * 1.3 Создать класс Зоопарк в котором будут жить наши животные. В качестве поля в новом классе
 * будет массив из животных (private Animal[]animals).
 * 1.4 Реализовать метод в классе зоопарк по добавлению нового животного. Сигнатура метода будет такая:
 * public void addAnimal(Animal animal); Данный метод должен будет скопировать текущий массив с животными
 * в новый массив с животными. Размерность нового массива должна увеличиться на 1, так как метод добавляет
 * новое животное. Полученный массив нужно перезаписать в поле animals в классе Зоопарк.
 * 1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.
 */
public class Zoo {
    private Animal[] animals;
    private int size;

    public Zoo() {
        this.animals = new Animal[10];  // начальный размер массива
        this.size = 0;
    }

    public void addAnimal(Animal animal) {

        Animal[] newAnimals = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; i++) {
            newAnimals[i] = animals[i];
        }

        newAnimals[size] = animal;
        animals = newAnimals;
        size++;

    }

    public void getAnimals() {
        for (int i = 0; i < size; i++) {
            System.out.println(animals[i]);
        }
    }

    public void delById(int id) {
        if (id < 0 || id >= animals.length) {
            System.out.println("Неверный индекс.");
            return;
        }
        Animal[] newArray = new Animal[ animals.length- 1];


        /*for (int i = 0; i < animals.length; i++) {
               if (animals[i].getId() == id){
                animals[i] = null;
            }
        }*/

        for (int i = 0; i < id; i++) {
            newArray[i] = animals[i];
        }

        for (int i = id; i < newArray.length; i++) {
            newArray[i] = animals[i + 1];
        }


    }
}
