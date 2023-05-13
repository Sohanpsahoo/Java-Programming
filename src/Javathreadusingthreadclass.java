package com.company;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

public class Javathreadusingthreadclass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}

/*
        Creating a Thread by Extending Thread class:

Multithreading In Java :

1.Used to maximize the CPU utilization.
2.We don't want our CPU to be in a free state; for example, Func1() comes into the memory and demands any
input/output process. The CPU will need to wait for unit Func1() to complete its input/output operation in such a condition.
 But, while Func1() completes its I/O operation, the CPU is free and not executing any thread. So, the efficiency of the
 CPU is decreased in the absence of multithreading.
3.In the case of multithreading, if a thread demands any I/O operation, then the CPU will let the thread perform
its I/O operation, but it will start the execution of a new thread parallelly. So, in this case, two threads
 are executing at the same time.

Flow Of Control In Java :
 1. Without threading :

class ThreadExample{
    public static void main(String[] args) {
        Func1();
        Func2();
    }
}

In the above code, you can see that Func1() and Func2() are called inside the main() function.
But the execution of Func2() will start only after the completion of the Func1().

  2. With threading :

class Multi extends Thread{
public void run(){
System.out.println("thread is running...");
}
public static void main(String args[]){
Multi func1=new Multi();
func1.start();
Multi func2=new Multi();
func2.start();
 }
}

Again, Func1() and Func2() are called inside the main function, but none of the two functions is waiting for the execution of the other function. Both the functions are getting executed concurrently.

Ways To Create A Thread In Java:

1.By extending the thread class
2.By implementing a Runnable interface
Let's see how we can create a thread by extending the thread class.

Extending Thread Class :
To create a thread using the thread class, we need to extend the thread class. Java's multithreading system is based on the thread class.

class MyThread extends Thread{
    @Override
    public void run(){
                          //code that we want to get executed on running the thread
        }
    }

==>In the above code, we're first inheriting the Thread class and then overriding the run() method.
==>The code you want to execute on the thread's execution goes inside the run() method.

class MyThread extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am happy!");
            i++;
        }
    }
}
public class cwh_70 {
    public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.start();
    }
}

In order to execute the thread, the start() method is used. start() is called on the object of the MyThread class.
It automatically calls the run() method, and a new stack is provided to the thread. So, that's how you easily create
 threads by extending the thread class in Java.                       */
