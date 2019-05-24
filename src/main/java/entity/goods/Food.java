package entity.goods;

import entity.goods.food.Cake;
import entity.goods.food.Candy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "food")
public class Food {
    @XmlElement(name = "cake")
    private Cake cake;
    @XmlElement(name = "candy")
    private Candy candy;

    public Food() {
    }

    public Food(Cake cake, Candy candy) {
        this.cake = cake;
        this.candy = candy;
    }

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

    public Candy getCandy() {
        return candy;
    }

    public void setCandy(Candy candy) {
        this.candy = candy;
    }
}
