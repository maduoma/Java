import java.util.Arrays;

class Products{
    String mItem;
    int mPrice;

    public Products(String mItem, int mPrice) {
        this.mItem = mItem;
        this.mPrice = mPrice;
    }

    public String getmItem() {
        return mItem;
    }

    public void setmItem(String mItem) {
        this.mItem = mItem;
    }

    public int getmPrice() {
        return mPrice;
    }

    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }

    @Override
    public String toString() {
        return "Products [mItem=" + mItem + ", mPrice=" + mPrice + "]";
    }
    public static void main(String[] args) {
        Products products1 = new Products("mItem1", 1);
        Products products2 = new Products("mItem2", 2);
        Products[] products = {products1, products2}; 
        System.out.println(Arrays.toString(products));
    }
}