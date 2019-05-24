package entity.goods;

import entity.goods.furniture.Table;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "furniture")
public class Furniture {
    @XmlElementWrapper(name = "furniture")
    @XmlElement(name = "table")
    private List<Table> tableList;

    public Furniture() {
    }

    public Furniture(List<Table> tableList) {
        this.tableList = tableList;
    }

    public List<Table> getTableList() {
        return tableList;
    }

    public void setTableList(List<Table> tableList) {
        this.tableList = tableList;
    }
}
