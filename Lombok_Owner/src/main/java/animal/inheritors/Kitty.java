package animal.inheritors;

import animal.Animal;
import enumerations.CuteLevel;
import food.EatCharacteristic;
import food.KittyCat;
import humans.Owner;
import lombok.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Kitty extends Animal {

    final static Logger logger = Logger.getLogger(Kitty.class);

    private @EqualsAndHashCode.Include
    CuteLevel cuteLevel;
    private @EqualsAndHashCode.Include
    Owner owner;
    private KittyCat dailyFood;

    public Kitty(String name, int weight, CuteLevel level, Owner owner, KittyCat food) {
        super(name, weight);
        this.cuteLevel = level;
        this.owner = owner;
        this.dailyFood = food;
        logger.info("Cat birth.");
    }

    public void eatFood(EatCharacteristic eatChar) {
        if (dailyFood.getWeight() == 0.0) {
            logger.warn("Cat is concerned about a lack of food.");
        } else if (dailyFood.getWeight() > 0.0) {
            dailyFood.setWeight(dailyFood.getWeight() - eatChar.getAmountFoodEaten());
            logger.info("Cat ate.");
            if (dailyFood.getWeight() <= 0) {
                logger.info("Food is finished.");
            }
        }
    }

    @SneakyThrows(Exception.class)
    public void killCat() {
        if (StringUtils.equalsIgnoreCase(cuteLevel.toString(), "BAD_CAT")) {
            logger.info(StringUtils.replace("Owner name is sad.", "name", owner.getName()));
        }
        throw new InterruptedException();
    }
}

