public class DisjointSet{

    int[] rank;
    int[] parent;
    int[] size;

    public DisjointSet(int vertex){
        
        this.size = new int[vertex + 1];
        this.rank = new int[vertex + 1]; // for both 0 and 1 based indexing
        this.parent = new int[vertex + 1];

        for(int i = 0; i <= vertex; i++){
            this.size[i] = 1; // initially node itself is component so size is 1
            this.rank[i] = 0; // initially all ranks are 0.
            this.parent[i] = i; // initially each node is parent of itself.
        }
    }

    // method to find ultimate parent with path compression
    public int findUParent(int node){

        //base case
        if(parent[node] == node){
            return node;
        }

        // path compression
        return parent[node] = findUParent(parent[node]);
    }

    // method to take union of two sets by rank
    public void unionByRank(int u, int v){

        int ulp_u = findUParent(u);
        int ulp_v = findUParent(v);

        // both belong to same set(having same ultimate parent)
        if(ulp_u == ulp_v){
            return;
        }

        // connect smaller to larger
        if(rank[ulp_u] < rank[ulp_v]){
            parent[ulp_u] = ulp_v;
        }else if(rank[ulp_u] > rank[ulp_v]){
            parent[ulp_v] = ulp_u;
        }else{
            parent[ulp_v] = ulp_u;
            rank[ulp_u] += 1;
        }
    }

    // method to take union of two sets by size
    public void unionBySize(int u, int v){

        int ulp_u = findUParent(u);
        int ulp_v = findUParent(v);

        // both belong to same set(having same ultimate parent)
        if(ulp_u == ulp_v){
            return;
        }

        if(size[ulp_u] < size[ulp_v]){
            parent[ulp_u] = ulp_v;
            size[ulp_v] = size[ulp_v] + size[ulp_u];
        }else{
            parent[ulp_v] = ulp_u;
            size[ulp_u] = size[ulp_u] + size[ulp_v];
        }
    }
}

class DSUClient{

    public static void main(String[] args){

        System.out.println("DSU Implementation");
        DisjointSet ds = new DisjointSet(7);

        ds.unionBySize(1, 2);
        ds.unionBySize(2, 3);
        ds.unionBySize(4, 5);
        ds.unionBySize(6, 7);
        ds.unionBySize(5, 6);
        
        if(ds.findUParent(3) == ds.findUParent(7)){
            System.out.println("Same Ultimate Parent");
        }else{
            System.out.println("Different Ultimate Parent");
        }

        ds.unionBySize(3, 7);
        
        if(ds.findUParent(3) == ds.findUParent(7)){
            System.out.println("Same Ultimate Parent");
        }else{
            System.out.println("Different Ultimate Parent");
        }
    }
}
