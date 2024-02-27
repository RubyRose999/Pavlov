# A queue is a linear data structure in which elements are added at one end, called the rear, and removed from the other end, called the front.

# The following pseudocode implements a queue using an array:

def queue_init():
# Create an empty queue.
queue = []
return queue

def queue_enqueue(queue, item):
# Add an item to the rear of the queue.
queue.append(item)

def queue_dequeue(queue):
# Remove an item from the front of the queue.
item = queue.pop(0)
return item

def queue_is_empty(queue):
# Check if the queue is empty.
return len(queue) == 0

# The following code shows how to use the queue functions:

queue = queue_init()
queue_enqueue(queue, 1)
queue_enqueue(queue, 2)
queue_enqueue(queue, 3)
print(queue_dequeue(queue))
print(queue_dequeue(queue))
print(queue_dequeue(queue))

# The output of the code is:

# 1
# 2
# 3