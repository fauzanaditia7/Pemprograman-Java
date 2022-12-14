import java.io.DataInputStream;
import java.io.FileInputStream;
import java.lang.Math;

public class membaca_file {
    public static void main(String[] args) {
        int i = 0, tugas, uts, uas, total;
        double h = 0, na;
        try {
            FileInputStream fstream = new FileInputStream("./tugasP3.txt");
            DataInputStream dataInput = new DataInputStream(fstream);
            System.out.println("No\tTugas\tUTS\tUAS\tNilai Akhir");
            System.out.println("--------------------------------------------");
            while (dataInput.available() != 0) {
                i += 1;
                String x = dataInput.readLine();
                tugas = Integer.parseInt(x.substring(1, 3));
                uts = Integer.parseInt(x.substring(6, 8));
                uas = Integer.parseInt(x.substring(9, 11));
                total = tugas + uts + uas;
                na = Math.abs(total/3);
                h += na;
                System.out.print(i + "\t" + tugas + "\t" + uts + "\t" + uas + "\t" + na);
                System.out.println();
            }
            System.out.println("--------------------------------------------");
            System.out.println("Rata-rata : \t" + h / i);
            fstream.close();
            dataInput.close();
        } catch (Exception e) {
            System.err.println("Kesalahan : " + e.getMessage());
        }
    }
}
