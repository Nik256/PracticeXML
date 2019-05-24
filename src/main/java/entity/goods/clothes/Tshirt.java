package entity.goods.clothes;

import entity.Good;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "t-shirt")
public class Tshirt {
    @XmlElementWrapper(name = "t-shirt")
    @XmlElement(name = "good")
    private List<Good> goodList;

    public Tshirt() {
    }

    public Tshirt(List<Good> goodList) {
        this.goodList = goodList;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }
}
