import java.io.*;
import java.util.List;

public class FileHandling {
    public void writeToFile(List<Human> humanList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/GT.txt"));
        for (Human human:humanList) {
            bw.write(String.valueOf(human) + "\n");
        }
        bw.close();
    }
    public void readFromFile() throws IOException {
        FileReader fr = new FileReader("src/GT.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

    }
}
