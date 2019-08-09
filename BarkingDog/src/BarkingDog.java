public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if (((hourOfDay >= 0) && (hourOfDay < 8)) || (hourOfDay == 23))
        {
            if (barking == true)
            {
                System.out.println("The Dog is Barking");
                return true;
            }
            else
            {
                System.out.println("The Dog is not Barking but hours of day is in range of 0-23");
                return false;
            }
        }
        else if ((hourOfDay < 0) || (hourOfDay > 23))
        {
            if (barking == true)
            {
                System.out.println("The Dog is barking but hours of day is not in range");
                return false;
            }
            else
            {
                System.out.println("Since the dog is not barking");
                return false;
            }
        }
        else
            System.out.println("Invalid");
        return false;
    }
}