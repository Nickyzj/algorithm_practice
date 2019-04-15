package ch08.LinkedList;

import ch08.LinkedList.Node;

public class MyLinklistUtil {

    public static void printListReversely(Node pListHead) {
        if (pListHead == null) return;
        printListReversely(pListHead.next);
        System.out.print(String.format("%d ", pListHead.getData()));
    }

    public static Node searchMid(Node pListHead) {
        Node pFast = pListHead;
        Node pSlow = pListHead;

        while (pFast.next != null) {
            pFast = pFast.next;
            if (pFast.next != null) {
                pFast = pFast.next;
            } else break;
            pSlow = pSlow.next;
        }
        return pSlow;
    }
}
