import java.util.*;

public class OrderIt {
    static int minOps(List<Integer> a) {
        int n = a.size();
        char[] s = new char[n];
        char[] g = new char[n];
        for (int i = 0; i < n; ++i) s[i] = (char)(a.get(i));
        for (int i = 0; i < n; ++i) g[i] = (char)(i);

        String sStr = new String(s);
        String gStr = new String(g);
        if (sStr.equals(gStr)) return 0;

        List<int[]> mv = new ArrayList<>(n * n * n);
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j <= n; ++j) {
                int ln = j - i;
                for (int k = 0; k <= n - ln; ++k) {
                    if (k == i) continue;
                    mv.add(new int[]{i, j, k});
                }
            }
        }

        Deque<String> q1 = new ArrayDeque<>();
        Deque<String> q2 = new ArrayDeque<>();
        Map<String, Integer> d1 = new HashMap<>();
        Map<String, Integer> d2 = new HashMap<>();
        q1.add(sStr);
        d1.put(sStr, 0);
        q2.add(gStr);
        d2.put(gStr, 0);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.size() <= q2.size()) {
                int ans = expand(q1, d1, d2, mv);
                if (ans != -1) return ans;
            } else {
                int ans = expand(q2, d2, d1, mv);
                if (ans != -1) return ans;
            }
        }
        return 0;
    }

    static int expand(Deque<String> q, Map<String, Integer> dself, Map<String, Integer> dother, List<int[]> mv) {
        int m = q.size();
        while (m-- > 0) {
            String x = q.poll();
            int dx = dself.get(x);
            for (int[] t : mv) {
                int i = t[0], j = t[1], k = t[2];
                int ln = j - i;
                String b = x.substring(i, j);
                String r = x.substring(0, i) + x.substring(j);
                String y = r.substring(0, k) + b + r.substring(k);
                if (dself.containsKey(y)) continue;
                int nd = dx + 1;
                if (dother.containsKey(y)) return nd + dother.get(y);
                dself.put(y, nd);
                q.add(y);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine(); // consume endline after n
        sc.nextLine(); // blank line

        String[] sh = new String[n];
        for (int i = 0; i < n; ++i) {
            sh[i] = sc.nextLine();
        }
        sc.nextLine(); // blank line

        String[] og = new String[n];
        for (int i = 0; i < n; ++i) {
            og[i] = sc.nextLine();
        }

        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; ++i) mp.put(og[i], i);

        List<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) a.add(mp.get(sh[i]));

        System.out.println(minOps(a));
    }
}
