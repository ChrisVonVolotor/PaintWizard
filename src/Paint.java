public class Paint {
    private String strPaintName;
    private int intPaintCover;
    private double dblPrice;

    public Paint(String name, int paintCover, double price){
        strPaintName = name;
        intPaintCover = paintCover;
        dblPrice = price;
    }

    public double getDblPrice() {
        return dblPrice;
    }

    public int getIntPaintCover() {
        return intPaintCover;
    }

    public String getStrPaintName() {
        return strPaintName;
    }
}
