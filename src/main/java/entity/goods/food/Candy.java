package entity.goods.food;

import entity.Good;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "candy")
public class Candy {
    @XmlElementWrapper(name = "candy")
    @XmlElement(name = "good")
    private List<Good> goodList;

    public Candy() {
    }

    public Candy(List<Good> goodList) {
        this.goodList = goodList;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }
}
