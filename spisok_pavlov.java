# A binary tree node.
class BinaryTreeNode:
def __init__(self, value):
self.value = value
self.left = None
self.right = None

# Create a binary tree.
def create_binary_tree(values):
root = BinaryTreeNode(values[0])
for value in values[1:]:
insert_node(root, value)

# Insert a node into a binary tree.
def insert_node(root, value):
current_node = root
while True:
if value < current_node.value:
if current_node.left is None:
current_node.left = BinaryTreeNode(value)
break
else:
current_node = current_node.left
else:
if current_node.right is None:
current_node.right = BinaryTreeNode(value)
break
else:
current_node = current_node.right

# Print a binary tree.
def print_binary_tree(root):
if root is None:
return
print(root.value)
print_binary_tree(root.left)
print_binary_tree(root.right)

# Main function.
def main():
values = [10, 5, 15, 2, 7, 12, 17]
create_binary_tree(values)
print_binary_tree(root)

if __name__ == "__main__":
main()