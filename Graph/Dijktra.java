import java.util.*;
public class Dijktra{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int[][] graph = new int[v][v];
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                graph[i][j] = sc.nextInt();
            }
        }
        solve(graph ,v ,0);
    }
 
    public static void solve(int[][] graph, int v, int src){
        int [] ans = new int[v];
        boolean[] spt = new boolean[v];

        Arrays.fill(ans ,Integer.MAX_VALUE);

        ans[src] =0;

        for(int i=0; i<v-1; i++){
            int u =minDistance(ans,spt,v);
            spt[u] = true;
            for(int j=0; j<v; j++){
                if(graph[u][j]!=0 && !spt[j] && ans[u]+graph[u][j]<ans[j]){
                    ans[j] = ans[u]+graph[u][j];
                }
            }
        }
        for(int x : ans) System.out.println(x);
    }
    public static void minDistance(int[] ans , boolean[] spt  ,int v){
        int min = Integer.MIN_VALUE , idx = -1;
        for(int i=0; i<v; i++){
            if(!spt[i] && ans[i]<min){
                min = ans[i];
                idx =i;
            }
        }
        return idx;
    }
}