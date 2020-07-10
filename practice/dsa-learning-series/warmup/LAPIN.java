import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String s = br.readLine();
      int n = s.length();
      String response = (
          n % 2 == 0 ? isLapindromes(s.substring(0, n / 2), s.substring(n / 2))
              : isLapindromes(s.substring(0, n / 2), s.substring(n / 2 + 1))
      );
      System.out.println(response);
    }
  }

  private static String isLapindromes(String s1, String s2) {
    int[] count = new int[26];
    for (int i = 0; i < s1.length(); i++) {
      count[s1.charAt(i) - 'a']++;
      count[s2.charAt(i) - 'a']--;
    }
    for (int i = 0; i < 26; i++) {
      if (count[i] != 0) {
        return "NO";
      }
    }
    return "YES";
  }
}
