/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        Node tmp = head;
        int i = 0;
        while(tmp != null){
            i++;
            tmp = tmp.next;
        }
        tmp = head;
        int[] arr = new int[i];
        i = 0;
        while(tmp != null){
            arr[i] = tmp.val;
            i++;
            tmp = tmp.next;
        }
        return arr;
    }
}