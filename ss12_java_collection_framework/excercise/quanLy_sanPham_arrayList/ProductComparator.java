package ss12_java_collection_framework.excercise.quanLy_sanPham_arrayList;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    private boolean isDESC;

    public ProductComparator(boolean isDESC) {
        this.isDESC = isDESC;
    }

    @Override
    public int compare(Product o1, Product o2) {

        if(isDESC){
            return (int)(o1.getPrice() - o2.getPrice());
        }

        return (int)(o2.getPrice() - o1.getPrice());
    }
}



