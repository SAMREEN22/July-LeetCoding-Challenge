# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        answer=[]
        depth=1
        def dfs(node, depth):
            nonlocal answer
            if depth>len(answer):
                answer.append(node.val)         
            if node.right:
                dfs(node.right, depth+1)           
            if node.left:
                dfs(node.left, depth+1)            
        dfs(root, depth)
        return answer
