import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      int num = Integer.parseInt(br.readLine());
      int reverseNum = 0;
      while (num > 0) {
        reverseNum = reverseNum * 10 + num % 10;
        num /= 10;
      }
      System.out.println(reverseNum);
    }
  }
}
