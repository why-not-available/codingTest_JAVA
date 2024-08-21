import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // Number of pipes
        int C = sc.nextInt();  // Number of connections
        
        // Create graph as an adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Read the connections and build the graph
        for (int i = 0; i < C; i++) {
            int Ei = sc.nextInt();
            int B1i = sc.nextInt();
            int B2i = sc.nextInt();
            
            graph.get(Ei).add(B1i);
            graph.get(Ei).add(B2i);
            graph.get(B1i).add(Ei);
            graph.get(B2i).add(Ei);
        }
        
        // Use BFS to calculate distances from pipe 1 (the barn)
        int[] distances = new int[N + 1];
        Arrays.fill(distances, -1);  // Initialize distances as -1 (unvisited)
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        distances[1] = 1;  // Distance from barn to pipe 1 is 1
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (int neighbor : graph.get(current)) {
                if (distances[neighbor] == -1) {  // If neighbor not visited
                    distances[neighbor] = distances[current] + 1;
                    queue.add(neighbor);
                }
            }
        }
        
        // Print the distances from the barn for each pipe
        for (int i = 1; i <= N; i++) {
            System.out.println(distances[i]);
        }
        
        sc.close();
    }
}
