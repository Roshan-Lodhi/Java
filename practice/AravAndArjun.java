package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AravAndArjun {

     public static double calculateArea(List<int[]> vertices) {
        int n = vertices.size();
        double area = 0;
        for (int i = 0; i < n; i++) {
            int[] current = vertices.get(i);
            int[] next = vertices.get((i + 1) % n);
            area += (current[0] * next[1]) - (current[1] * next[0]);
        }
        return Math.abs(area) / 2.0;
    }

     
    public static boolean isClosedFigure(Map<String, List<String>> graph) {
        Set<String> visited = new HashSet<>();

        
        boolean hasCycle = false;
        for (String node : graph.keySet()) {
            if (!visited.contains(node)) {
                hasCycle |= dfs(node, null, graph, visited);
                if (hasCycle) break;
            }
        }
        return hasCycle;
    }

    private static boolean dfs(String node, String parent, Map<String, List<String>> graph, Set<String> visited) {
        visited.add(node);
        for (String neighbor : graph.get(node)) {
            if (neighbor.equals(parent)) continue;  
            if (visited.contains(neighbor) || dfs(neighbor, node, graph, visited)) {
                return true;  
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int[][] sticks = new int[n][4];
        Map<String, List<String>> graph = new HashMap<>();

         
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            sticks[i][0] = x1;
            sticks[i][1] = y1;
            sticks[i][2] = x2;
            sticks[i][3] = y2;

            String point1 = x1 + "," + y1;
            String point2 = x2 + "," + y2;

            graph.computeIfAbsent(point1, k -> new ArrayList<>()).add(point2);
            graph.computeIfAbsent(point2, k -> new ArrayList<>()).add(point1);
        }

         
        if (!isClosedFigure(graph)) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");

         
        List<int[]> vertices = new ArrayList<>();  
        double area = calculateArea(vertices);

         
        double leftoverLength = 0;
        for (int[] stick : sticks) {
            int x1 = stick[0], y1 = stick[1], x2 = stick[2], y2 = stick[3];
            boolean used = false;  
            if (!used) {
                leftoverLength += Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            }
        }

        double perimeter = 0;
        for (int i = 0; i < vertices.size(); i++) {
            int[] current = vertices.get(i);
            int[] next = vertices.get((i + 1) % vertices.size());
            perimeter += Math.sqrt(Math.pow(next[0] - current[0], 2) + Math.pow(next[1] - current[1], 2));
        }

        if (Math.abs(leftoverLength - perimeter) < 1e-2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.printf("%.2f\n", area);
    }
}
    
