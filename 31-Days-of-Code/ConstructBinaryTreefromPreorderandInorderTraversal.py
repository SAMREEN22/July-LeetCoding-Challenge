# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        preorder=deque(preorder)
        inorder_map={v:k for k,v in enumerate(inorder)}
        def construct(left,right):
            if left>right:
                return None
            root_val=preorder.popleft()
            root=TreeNode(root_val)
            index=inorder_map[root_val]
            root.left=construct(left,index-1)
            root.right=construct(index+1,right)
            return root
        return construct(0,len(inorder)-1)
