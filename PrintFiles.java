import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFiles {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in= new Scanner(System.in);
        ArrayQueue<String>filesToPrint=new ArrayQueue<>(3);
        for (int i = 0; i < 3; i++) {
            filesToPrint.enqueue(in.next());
        }
        while (!filesToPrint.isEmpty()){
            Scanner filescan=new Scanner(new File(filesToPrint.dequeue()));
            while (filescan.hasNextLine())
                System.out.println(filescan.nextLine());
        }
    }
}
