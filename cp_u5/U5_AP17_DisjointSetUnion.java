public class U5_AP17_DisjointSetUnion {
    
}
// Program to implement Disjoint Set Data Structure.

/*
5 = number of friends
3 = number of relationships
2 = number of friendship check
input=5
3
0 2
4 2
3 1
2
4 0
1 0
output=4 is a friend of 0
1 is not a friend of 0

*/
import java.io.*;
import java.util.*;

class DisjointUnionSets {
	int[] rank, parent;
	int n;

	public DisjointUnionSets(int n){
		rank = new int[n];
		parent = new int[n];
		this.n = n;
		makeSet();
	}
	// Creates n sets with single item in each
	void makeSet(){
	    for(int i=0;i<n;i++){
	        parent[i]=i;
	    }
		
	}

	// Returns representative of x's set
	int find(int x){
	    if(parent[x]!=x){
	        return find(parent[x]);
	    }
		return parent[x];
	}

	// Unites the set that includes x and the set that includes x
	void union(int x, int y){
	    int xroot = find(x);
	    int yroot = find(y);
	    if(xroot==yroot){
	        return;
	    }
	    if(rank[xroot]>rank[yroot]){
	        parent[xroot]=yroot;
	    }
	    else if(rank[xroot]>rank[yroot]){
	        parent[yroot]=xroot;
	    }
	    else{
	        parent[xroot] = yroot;
	        rank[xroot]++;
	    }
	
	}
}

class test {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int m=sc.nextInt();
		 DisjointUnionSets dus=new DisjointUnionSets(n);
		 for(int i=0;i<m;i++) {
		     int a=sc.nextInt();
		     int b=sc.nextInt();
		     dus.union(a,b);
		     }
		 int x=sc.nextInt();
		 for(int i=0;i<x;i++) {
		     int a=sc.nextInt();
		     int b=sc.nextInt();
		     if(dus.find(a)==dus.find(b)) {
		         System.out.println(a+" is a friend of "+b);
		         }
		     else {

		         System.out.print(a+" is not a friend of "+ b);
		         }
		}		
	}
}




