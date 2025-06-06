/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

class Solution {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        // add code here.
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size =  queue.size();
            for(int i=1;i<=size;i++){
                Node n = queue.poll();
                if(i==size){
                    list.add(n.data);
                }
                if(n.left!=null){
                    queue.add(n.left);
                }
                if(n.right!=null){
                    queue.add(n.right);
                }
            }
        }
        return list;
    }
}