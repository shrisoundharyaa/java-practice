
/* 0 to 1 -> 1
0 to 2 -> 4
0 to 1 -> 0



1 to 0 -> 1
1 to 2 -> 3
1 to 1 -> 0


2 to 0 -> 4
2 to 1 -> 3
2 to 2 -> 0
*/
import java.util.*;
public class dijistrasalgo {
  public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int V = in.nextInt();
     int E = in.nextInt();
     List<List< Edge>> outer = new ArrayList<>();
     for(int i=0;i<V;i++){
        List<Edge> inner =  new ArrayList<>();
        outer.add(inner);

        
     }
     //add the edges
     for(int i=0;i<E;i++){
        int u= in.nextInt();
        int v = in.nextInt();
        int w= in.nextInt();
         //edge object
     Edge   obj1 = new Edge(v,w);
     Edge  obj2 = new Edge(u,w);
     outer.get(u) .add(obj1);
     outer.get(v).add(obj2);

     }
    
     int source = in.nextInt();
     dijstraAlgo(outer,source,V);

     in.close();

  }
 static class Edge{
    int x,y;//instance variable
    Edge(int x,int y){//local variable
        this.x = x;//this.instance_variable = local variable
        this.y=y;
    }
  }
  static void dijstraAlgo(List<List<Edge>> outer, int source, int V){
    int[] distance = new int[V];
    Arrays.fill(distance,Integer.MAX_VALUE);
    distance[source] = 0;
    Queue<int[]> q = new ArrayDeque<>();
    int[] arr  = {source,0};
    q.add(arr);
    while(!q.isEmpty()){
        int next_vertex = q.peek()[0]; //vertex
        int prev_weight = q.peek()[1]; //weight
        q.poll();
        //Traverse the object
        for(Edge e:outer.get(next_vertex)){
            int curr_vertex = e.x;
            int curr_weight = e.y;
            if(distance[curr_vertex]>curr_weight+prev_weight){
                distance[curr_vertex] = curr_weight+prev_weight;
                int temp[] = {curr_vertex,distance[curr_vertex]};
                q.add(temp);
            }
        }
    }
    
    System.out.print(Arrays.toString(distance));

}
  




}




