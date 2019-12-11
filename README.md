# Maven project that includes the class and Junit tests for the function to find elimination order of children in a game

The algorithm has quadratic time complexity O(n^2)
#
		while (ptr1.next != ptr1) {
			// Find k-th node
			int count = 1;
			while (count != k) {
				ptr2 = ptr1;
				ptr1 = ptr1.next;
				count++;
			}
      ptr2.next = ptr1.next;
			ptr1 = ptr2.next;
		}
 #
 In the above snippet, ptr1 iterates through all 'n' elements in the linked list. Each time, 'k' elements are traversed before an elimination is made and loop is re-iterated for (n-1) elements. 
#
The following has linear time complexity while creating a circular linked list of n elements O(n)
#
	for (int i = 2; i <= n; i++) {
			prev.next = new Node(i);
			prev = prev.next;
		}
#
 Going with worst case time-complexity, the algorithm follows quadratic time complexity.
