package sync;

class MessagePrinter {
    // Synchronized method to print message with square braces
    public synchronized void printMessage(String message) {
        System.out.print("[");
        System.out.print(message);
        System.out.println("]");
    }
}

// Thread class to pass messages
class MessageThread extends Thread {
    MessagePrinter printer;
    String message;

    public MessageThread(MessagePrinter printer, String message) {
        this.printer = printer;
        this.message = message;
    }

    @Override
    public void run() {
        printer.printMessage(message);
    }
}

public class sync {
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();

        // Creating three threads with different messages
        MessageThread t1 = new MessageThread(printer, "Learn");
        MessageThread t2 = new MessageThread(printer, "Java");
        MessageThread t3 = new MessageThread(printer, "Programming");

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
    }
}


	
