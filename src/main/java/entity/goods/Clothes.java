package entity.goods;

import entity.goods.clothes.Coat;
import entity.goods.clothes.Tshirt;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "clothes")
public class Clothes {
    @XmlElement(name = "coat")
    private List<Coat> coat;
    @XmlElement(name = "tshirt")
    private List<Tshirt> tshirt;

    public Clothes() {
    }

    public Clothes(List<Coat> coat, List<Tshirt> tshirt) {
        this.coat = coat;
        this.tshirt = tshirt;
    }

    public List<Coat> getCoat() {
        return coat;
    }

    public void setCoat(List<Coat> coat) {
        this.coat = coat;
    }

    public List<Tshirt> getTshirt() {
        return tshirt;
    }

    public void setTshirt(List<Tshirt> tshirt) {
        this.tshirt = tshirt;
    }
}
