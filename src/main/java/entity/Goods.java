package entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import entity.goods.Clothes;
import entity.goods.Food;
import entity.goods.Furniture;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@JacksonXmlRootElement(localName = "goods")
@XmlRootElement(name = "goods")
public class Goods {
    @XmlElement(name = "food")
    private Food food;
    @XmlElement(name = "clothes")
    private Clothes clothes;
    @XmlElement(name = "furniture")
    private Furniture furniture;

    public Goods() {
    }

    public Goods(Food food, Clothes clothes, Furniture furniture) {
        this.food = food;
        this.clothes = clothes;
        this.furniture = furniture;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "food=" + food +
                ", clothes=" + clothes +
                ", furniture=" + furniture +
                '}';
    }
}
