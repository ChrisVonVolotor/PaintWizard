import java.util.ArrayList;
import java.util.Scanner;

public class Solver {
    Scanner sc = new Scanner(System.in);
    ArrayList<Paint> arlPaintWiz = new ArrayList<Paint>();
    public void solvePaint(){
        System.out.println("Please enter your room size:");
        int intRoomSize = sc.nextInt();
        arlPaintWiz.add(new Paint("CheapoMax (20Litre)", 10, 19.99));
        arlPaintWiz.add(new Paint("AverageJoes (15 Litre)", 11, 17.99));
        arlPaintWiz.add(new Paint(" DuluxourousPaints (10 Litre)", 20, 25.0));

        String strLeastWaste = "";
        int intLeastWaste = 0;
        boolean booWasterSolved = false;

        String strCheapestPaint = "";
        double dblCheapestPaint = 0;
        boolean booCheapestSolved = false;
        String strTempWaste = "";
        int intTempWaste = 0;

        String strTempCost = "";
        double dblTempCost = 0;

        for (Paint brand: arlPaintWiz
             ) {
            strTempWaste = brand.getStrPaintName();
            intTempWaste = leftOverPaint(brand.getIntPaintCover(),intRoomSize);

            strTempCost = brand.getStrPaintName();
            dblTempCost = paintCost(brand.getIntPaintCover(),intRoomSize, brand.getDblPrice());

            if (booWasterSolved == false){
                strLeastWaste = strTempWaste;
                intLeastWaste = intTempWaste;
                booWasterSolved = true;
            } else if (intTempWaste < intLeastWaste){
                strLeastWaste = strTempWaste;
                intLeastWaste = intTempWaste;
            }

            if (booCheapestSolved == false){
                strCheapestPaint = strTempCost;
                dblCheapestPaint = dblTempCost;
                booCheapestSolved = true;
            } else if (intTempWaste < intLeastWaste){
                strCheapestPaint = strTempCost;
                dblCheapestPaint = dblTempCost;
            }


        }

        System.out.println("The Least wasteful paint is " + strLeastWaste + ", wasting " + intLeastWaste + "m2 of paint" );
        System.out.println("The Cheapest paint is " + strCheapestPaint + ", Costing £" + dblCheapestPaint + " in total" );





    }

    private int leftOverPaint(int intPaintCoverage, int intRoomSize){
        int intLeftover;

        return intRoomSize % intPaintCoverage;


    }

    private Double paintCost(int intPaintCoverage, int intRoomsize, double dblPricePerTin  ){

        double dblTinRequired = intRoomsize/intPaintCoverage;

        dblTinRequired = Math.ceil(dblTinRequired);

        return dblTinRequired * dblPricePerTin;





    }

}
