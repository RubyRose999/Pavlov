# A dynamic array is an array whose size can be changed dynamically.

# The following pseudocode implements a dynamic array in Python.

class DynamicArray:

def __init__(self):
# The capacity of the array is initially set to 1.
self.capacity = 1
# The data of the array is initially empty.
self.data = []

def __len__(self):
# Returns the length of the array.
return len(self.data)

def __getitem__(self, index):
# Returns the element at the specified index.
return self.data[index]

def __setitem__(self, index, value):
# Sets the element at the specified index to the specified value.
self.data[index] = value

def append(self, value):
# Appends the specified value to the end of the array.
if len(self.data) == self.capacity:
# If the array is full, double its capacity.
self.capacity *= 2
# Create a new array with the doubled capacity.
new_data = [None] * self.capacity
# Copy the data from the old array to the new array.
for i in range(len(self.data)):
new_data[i] = self.data[i]
# Set the data of the array to the new array.
self.data = new_data
# Append the value to the end of the array.
self.data.append(value)

def extend(self, other_array):
# Extends the array by appending all the elements of the specified array.
for item in other_array:
self.append(item)