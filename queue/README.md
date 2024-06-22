# What is a Queue ?

A queue is a FIFO data structure - First In First Out
Like a real life queue, first come first served
New items are added the end of the queue - called the tail
Items are removed from the beginning of the queue - called the head

### functions

enqueue (.offer(), .add()) - adds a new item to the tail of the queue
dequeue (.poll(), .remove()) - remove the item at the head of the queue
.reveal(), .peak() - shows the item on the head of the queue

### other functions

.isEmpty() - returns true if the queue is empty

### Note

add(), remove() and reveal() throw exceptions, so offer(), poll() and peak() are preferable
