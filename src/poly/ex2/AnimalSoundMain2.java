package poly.ex2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        Animal[] animalsArr = {dog, cat, caw, duck};

        for (Animal animal : animalsArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }



}
