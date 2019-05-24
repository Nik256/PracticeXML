package entity.goods;

import entity.goods.clothes.Coat;
import entity.goods.clothes.Tshirt;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "clothes")
public class Clothes {
    @XmlElementWrapper(name = "clothes")
    @XmlElement(name = "coat")
    private List<Coat> coatList;
    @XmlElementWrapper(name = "clothes")
    @XmlElement(name = "t-shirt")
    private List<Tshirt> tshirtList;

    public Clothes() {
    }

    public Clothes(List<Coat> coatList, List<Tshirt> tshirtList) {
        this.coatList = coatList;
        this.tshirtList = tshirtList;
    }

    public List<Coat> getCoatList() {
        return coatList;
    }

    public void setCoatList(List<Coat> coatList) {
        this.coatList = coatList;
    }

    public List<Tshirt> getTshirtList() {
        return tshirtList;
    }

    public void setTshirtList(List<Tshirt> tshirtList) {
        this.tshirtList = tshirtList;
    }
}
