public class MegaBytesConverter {
    public static double printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
        System.out.println("Invalid Value");
    }
    else {
        int megaBytes = kiloBytes/1024;
        int remainingKiloBytes = kiloBytes % 1024;

        System.out.println(kiloBytes + " kb=" + megaBytes + "mb and" + remainingKiloBytes + "kb");

    }
    }
}
