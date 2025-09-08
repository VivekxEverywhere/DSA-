/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private void reverse(List<Integer> list, int i, int j) {
        while (i <= j) {
            Collections.swap(list, i, j);
            i++;
            j--;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int size = list.size();
        for (int i = k; i <= size; i += k) {
            reverse(list, i - k, i - 1);
        }

        temp = head;
        for (int i = 0; i < size; i++) {
            temp.val = list.get(i);
            temp = temp.next;
        }

        return head;
    }
}