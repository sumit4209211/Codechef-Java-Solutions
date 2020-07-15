import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String[] strs = br.readLine().split("\\s+");
      int numOfActivities = Integer.parseInt(strs[0]);
      int redeemCount = strs[1].equals("INDIAN") ? 200 : 400;
      long numOfLadoos = 0;
      for (int i = 0; i < numOfActivities; i++) {
        strs = br.readLine().split("\\s+");
        if (strs[0].equals("CONTEST_WON")) {
          numOfLadoos += 300 + Math.max(0, 20 - Long.parseLong(strs[1]));
        }
        else if (strs[0].equals("TOP_CONTRIBUTOR")) {
          numOfLadoos += 300;
        }
        else if (strs[0].equals("BUG_FOUND")) {
          numOfLadoos += Long.parseLong(strs[1]) >= 50 ? Long.parseLong(strs[1]) : 0;
        }
        else {
          numOfLadoos += 50;
        }
      }
      System.out.println(numOfLadoos / redeemCount);
    }
  }
}
