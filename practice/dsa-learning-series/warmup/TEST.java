import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = null;
    List<String> output = new ArrayList<>();
    boolean stopProcessing = false;
    while (true) {
      s = br.readLine();
      if (s == null || s.length() == 0) {
        break;
      }
      if (stopProcessing) {
        continue;
      }
      if (s.equals("42")) {
        stopProcessing = true;
      }
      else {
        output.add(s);
      }
    }
    output.forEach(System.out::println);
  }
}
