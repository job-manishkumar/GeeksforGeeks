/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=1;i<=size;i++){
                Node n = queue.poll();
                temp.add(n.data);
                if(n.left!=null){
                queue.add(n.left);
                }
                if(n.right!=null){
                queue.add(n.right);
                }
            }
            list.add(temp);
        }
        return list;
    }
}