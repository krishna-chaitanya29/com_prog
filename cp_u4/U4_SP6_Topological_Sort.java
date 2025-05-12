package cp_u4;

public class U4_SP6_Topological_Sort {
    
}
// Class to represent a graph
// class Graph 
// {
// 	// No. of vertices
// 	int V;

// 	// An Array of List which contains references to the Adjacency List of each vertex
// 	List<Integer> adj[];
// 	// Constructor
// 	public Graph(int V)
// 	{
// 		this.V = V;
// 		adj = new ArrayList[V];
// 		for (int i = 0; i < V; i++)
// 			adj[i] = new ArrayList<Integer>();
// 	}

// 	// Function to add an edge to graph
// 	public void addEdge(int u, int v)
// 	{
// 		adj[u].add(v);

// 	}
// 	public void dfs(int node,boolean[] v,Stack<Integer> stack){
// 	    v[node] = true;
// 	    for(int nei:adj[node]){
// 	        if(!v[nei]){
// 	            dfs(nei,v,stack);
// 	        }
// 	    }
// 	    stack.push(node);
// 	}
// 	public void topologicalSort()
// 	{
// 		//Write your code here and print the vertices order after sorting
// 		Stack<Integer> stack = new Stack<>();
// 		boolean[] v = new boolean[V];
// 		for(int i=0;i<V;i++){
// 		    if(!v[i]){
// 		        dfs(i,v,stack);
// 		    }
// 		}
// 		List<Integer> order = new ArrayList<>();
// 		while(!stack.isEmpty()){
// 		    order.add(stack.pop());
// 		}
// 		System.out.println(order);
// 	}
// }

// Create a graph 

// 		Graph g = new Graph(n);

//System.out.println("Following is a Topological Sort");

// ------------------------------------------------------------------------------------------

/* A Java program to print topological sorting of a graph using indegrees

Sample Input=1:
---------------
6 //no of vertices
6 //no of edges
5 2
5 0
4 0
4 1
2 3
3 1

Sample Output-1:
----------------
4 5 2 0 3 1

Sample Input-2:
---------------
5
5
4 0
4 1
2 3
3 1
2 0

Sample Output-2:
----------------
2 4 3 0 1

*/
/* A Java program to print topological sorting of a graph using indegrees

Sample Input=1:
---------------
6 //no of vertices
6 //no of edges
5 2
5 0
4 0
4 1
2 3
3 1

Sample Output-1:
----------------
4 5 2 0 3 1

Sample Input-2:
---------------
5
5
4 0
4 1
2 3
3 1
2 0

Sample Output-2:
----------------
2 4 3 0 1

*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

// Class to represent a graph
class Graph 
{
	// No. of vertices
	int V;
	int[] degree;

	// An Array of List which contains references to the Adjacency List of each vertex
	List<Integer> adj[];
	// Constructor
	public Graph(int V)
	{
		this.V = V;
		degree=new int[V];
		adj = new ArrayList[V];
		for (int i = 0; i < V; i++)
			adj[i] = new ArrayList<Integer>();
	}

	// Function to add an edge to graph
	public void addEdge(int u, int v)
	{
	    degree[v]++;
		adj[u].add(v);
	}

	public void topologicalSort()
	{
		//Write your code here and print the vertices order after sorting
		Queue<Integer> queue=new LinkedList<>();
		int count=0;
		for(int i=0;i<degree.length;i++){
		    if(degree[i]==0){
		        count++;
		        queue.offer(i);
		    }
		}
		if(count==0){
		    System.out.println(-1);
		    return;
		}
		while(!queue.isEmpty()){
		    int curr=queue.poll();
		    System.out.print(curr+" ");
		    for(Integer neighbour:adj[curr]){
		        degree[neighbour]--;
		        if(degree[neighbour]==0){
		          queue.offer(neighbour);
		        }
		    }
		}
	}
}

class test 
{
	public static void main(String args[])
	{
		// Create a graph 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Graph g = new Graph(n);
        int e=sc.nextInt();
		for(int i=0;i<e;i++){
			int e1=sc.nextInt();
			int e2=sc.nextInt();
			g.addEdge(e1,e2);
		}

		//System.out.println("Following is a Topological Sort");
		g.topologicalSort();
	}
}
