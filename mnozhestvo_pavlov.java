# Create a set.
set1 = {1, 2, 3, 4, 5}

# Check if an element is in the set.
if 1 in set1:
print("1 is in the set")
else:
print("1 is not in the set")

# Add an element to the set.
set1.add(6)

# Remove an element from the set.
set1.remove(3)

# Get the length of the set.
length = len(set1)

# Iterate over the set.
for element in set1:
print(element)