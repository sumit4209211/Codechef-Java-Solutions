import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    while (t-- > 0) {
      pq.add(Integer.parseInt(br.readLine()));
    }
    long maxRevenue = 0;
    while (!pq.isEmpty()) {
      int curr = pq.poll();
      long currRevenue = ((long) curr) * (pq.size() + 1);
      maxRevenue = Math.max(maxRevenue, currRevenue);
    }
    System.out.println(maxRevenue);
  }
}
