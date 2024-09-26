 public class ContohParameterMethod {
        //method dengan satu parameter
        public static int kaliDua(int angka) {
            int hasil = angka * 2;
            System.out.println("Hasil: " + hasil);
            return hasil;
        }

        public static double hitungLuasSegitiga(double alas, double tinggi) {
            return 0.5 * alas * tinggi;
        }

        public static void main(String[] args) {
            int hasilKaliDua = kaliDua(5);
            System.out.println("5 * 2 = " + hasilKaliDua);

            double luasSegitiga = hitungLuasSegitiga(4, 6);
            System.out.println("Luas Segitiga: " + luasSegitiga);
        }
    

}
