public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        x*=1000;
        y*=1000;
        int x1= (int)x;
        int y1= (int)y;
        if (x1==y1){
            return true;
        }
        else
        {
            return false;
        }
    }
}