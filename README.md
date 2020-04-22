# Validate-BST
- write a method that check whether a given tree is Valid for BST or not
- A Node contain Value left node and right node if possible,
- a restrict is left node < parent node < right node
- a node can have child or be itself.
- time complexity is O(n) science we have to check every node to get conclusion.
# solution:
- Check each nod if they are in valid range,
- Root node is the first node  so the range is unknown so it should be the biggest range (min, max)
- check the left node if it not null, the maximum can be is their parent node, min is still the same as parent node
- the right node max is the same as there parent node but min is there parent node.
- time complexity : O(N)
