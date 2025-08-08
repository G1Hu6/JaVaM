class NumberOfOperationsToMakeNetworkConnected{

    static int findEdgesToConnect(int n, int[][] edges){

        DisjointSet ds = new DisjointSet(n);
        int extraEdges = 0;
        for(int i = 0; i < n; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            if(ds.findUParent(u) == ds.findUParent(v)){
                extraEdges++;
            }else{
                ds.unionBySize(u, v);
            }
        }

        int connectedComCount = 0;
        for(int i = 0; i < n ; i++){
            if(ds.findUParent(i) == i) connectedComCount++;
        }

        int ans = connectedComCount - 1;
        if(extraEdges >= ans){
            return ans;
        }
        return -1;
    }

    public static void main(String[] args){

        int[][] edges = {
            {0, 1},
            {0, 3},
            {0, 2},
            {1, 2},
            {2, 3},
            {4, 5},
            {5, 6},
            {7, 8}
        };
        System.out.println("Edges required to connect network :- " + findEdgesToConnect(8, edges));
    }
}
