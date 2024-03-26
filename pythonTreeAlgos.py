class TreeNode:
    def __init__(self, val):
        self.val = val
        self.right = None
        self.left = None
    
    def setLeft(self, node):
        self.left = node
    
    def setRight(self, node):
        self.right = node
    
    def getVal(self):
        return self.val
    
    def __repr__(self):
        return f"Node value: {self.getVal()}"

test = TreeNode(5)
test.left = TreeNode(7)


print(test)
print(test.left)

