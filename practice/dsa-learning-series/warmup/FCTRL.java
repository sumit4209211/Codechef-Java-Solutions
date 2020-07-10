import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      long n = Long.parseLong(br.readLine());
      long numOfZeros = 0;
      long mul = 5;
      while (true) {
        long fact = n / mul;
        if (fact == 0) {
          break;
        }
        numOfZeros += fact;
        mul *= 5;
      }
      System.out.println(numOfZeros);
    }
  }
}
