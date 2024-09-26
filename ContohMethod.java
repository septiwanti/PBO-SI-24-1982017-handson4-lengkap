public class ContohMethod {
    public static int hitungPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        int sisi = 5;
        int luas = hitungPersegi(sisi); // remove "int" here
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas); // add "luas" here
    }
}
