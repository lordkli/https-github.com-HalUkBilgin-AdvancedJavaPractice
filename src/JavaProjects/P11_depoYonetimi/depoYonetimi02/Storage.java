package JavaProjects.P11_depoYonetimi.depoYonetimi02;

import java.util.ArrayList;

public class Storage  implements Planning, Purchasing, Sales{
    ArrayList<Product> pList = new ArrayList<>();
    @Override
    public void pSpecification(String name, String producer, String unit) {
        int id = pList.size() + idBase;
        Product product = new Product(id, name, producer, unit);
        pList.add(product);
    }
    @Override
    public ArrayList<Product> pList() {
        return pList;
    }
    @Override
    public void pShelving(int id, String shelf) {
        pList.get(id-idBase).shelf = shelf;
    }
    @Override
    public void pEnter(int id, int quantity) {
        pList.get(id-idBase).quantity += quantity;
    }

    @Override
    public void pExit(int id, int quantity) {
        pList.get(id-idBase).quantity -= quantity;
    }
}
