package demo;

import animal.inheritors.Kitty;
import enumerations.CatPosition;
import enumerations.DayPart;
import food.EatCharacteristic;
import food.KittyCat;
import humans.Owner;

import static enumerations.CuteLevel.FAT_CAT;

public class Main {
    public static void main(String[] args) {
        KittyCat food = new KittyCat("name", 54);
        Owner owner = new Owner();
        owner.setName("Adam");

        Kitty cat = new Kitty("Bob", 5, FAT_CAT, owner, food);
        EatCharacteristic e = EatCharacteristic.createCharacteristic()
                .amountFoodEaten(480)
                .dayPart(DayPart.EVENING)
                .catPosition(CatPosition.LAY)
                .foodCollector();
        cat.eatFood(e);
    }
}
