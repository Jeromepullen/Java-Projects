public class Factors {

    //prints all the factors of the number set in the printFactors method

    public static void printFactors(int number){
        if (number <1)
            System.out.println("Invalid Value");
        for (int i=1; i<=number;i++){
            if (number%i==0){
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        printFactors(99);
    }

}
