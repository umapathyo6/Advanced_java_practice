package Colletions_list;
/*insert at end	add()
insert at first	addFirst()
insert at last	addLast()
insert at index	add(index,obj)
delete first	removeFirst()
delete last	removeLast()
delete by index	remove(index)*/

public class LinkedList {

}
Use LinkedList When

✅ frequent insertion/deletion
✅ working in middle/front
✅ need List + Queue features together

Example:

music playlist
browser history
undo/redo navigation
LinkedList<Integer> list = new LinkedList<>();
2. Use Queue When

✅ FIFO required
(First In First Out)

Example:

ticket booking line
printer queue
task scheduling
CPU scheduling

Best classes:

Queue<Integer> q = new LinkedList<>();

or

PriorityQueue<Integer>
3. Use Stack When

✅ LIFO required
(Last In First Out)

Example:

undo operation
browser back button
recursion
expression evaluation

Modern preferred way:

Deque<Integer> stack = new LinkedList<>();

instead of old Stack class.

Important Reality

Usually developers do NOT write:

Stack stack = new Stack();

nowadays.

Instead they use:

Deque<Integer> stack = new LinkedList<>();

because:

faster
modern
better design
Which is Better?
Requirement	Best Choice
Normal dynamic list	ArrayList
Frequent insertion/deletion	LinkedList
FIFO operations	Queue
LIFO operations	Stack/Deque
Real Industry Usage

Mostly used:

✅ ArrayList → most common
✅ Queue → scheduling systems
✅ Deque → stack operations
✅ LinkedList → less common than ArrayList

Very Important Point

Queue and Stack are not competitors to LinkedList.

Because:

LinkedList is a class
Queue/Stack are behaviors or interfaces

Example:

Queue<Integer> q = new LinkedList<>();

Here:

Queue = behavior
LinkedList = implementation

Same for stack behavior.

Easy Final Understanding
Need	Use
Simple list	ArrayList
Many insert/delete	LinkedList
First come first serve	Queue
Last entered first out	Stack*/


/*1. LinkedList Object Creation
import java.util.LinkedList;

LinkedList<Integer> list = new LinkedList<>();

Example:

list.add(10);
list.add(20);

System.out.println(list);
2. Queue Object Creation

Queue is an interface.
So object created using implementation class.

Mostly:

import java.util.Queue;
import java.util.LinkedList;

Queue<Integer> q = new LinkedList<>();

Example:

q.offer(10);
q.offer(20);

System.out.println(q);

q.poll();

System.out.println(q);
3. Stack Object Creation

Old way:

import java.util.Stack;

Stack<Integer> s = new Stack<>();

Example:

s.push(10);
s.push(20);

System.out.println(s);

s.pop();

System.out.println(s);
Modern Stack Creation (Recommended)

Using Deque

import java.util.Deque;
import java.util.LinkedList;

Deque<Integer> stack = new LinkedList<>();

Example:

stack.push(10);
stack.push(20);

System.out.println(stack);

stack.pop();

System.out.println(stack);
Important Understanding
Type	Object Creation
LinkedList	new LinkedList<>()
Queue	Queue q = new LinkedList<>()
Stack	Stack s = new Stack<>()
Why Queue Uses Interface?
Queue<Integer> q = new LinkedList<>();

Means:

reference → Queue
object → LinkedList

This is called:

upcasting

Java prefers interface reference.

Easy Memory Trick
Work	Syntax
List	LinkedList<>
Queue	Queue<> = new LinkedList<>
Stack	Stack<> or Deque<>*/