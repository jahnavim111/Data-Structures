class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def append(self,data):
        newNode = Node(data)
        if(self.head is None):
            self.head = newNode
            return
        curr = self.head
        while(curr.next != None):
            curr = curr.next
        curr.next = newNode
    
    def delete(self,value):
        if self.head is None:
            print("List is empty, nothing to delete")
            return
        if self.head.data == value:
            self.head = self.head.next
            return
        curr = self.head
        while(curr.next is not None and curr.next.data != value):
            curr = curr.next
        if(curr.next is not None):
            curr.next = curr.next.next
        else:
            print("Value not found in the list")
    def display(self):
        curr = self.head
        while(curr is not None):
            print(curr.data,end="->")
            curr = curr.next
        print(None)


l = LinkedList()
l.append(3)
l.append(4)
l.display()
l.delete(4)
l.display()
        