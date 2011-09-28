package utilities;

import java.io.*;
import java.util.concurrent.TimeUnit;

import business.Booking;
import business.CancelBook;
import business.Compute;
import java.util.Random;

public class BookParser {

    private String fileName;

    public BookParser(String fileName) {
        this.fileName = fileName;
    }
    Timer timer = new Timer();
    Booking book = new Booking();

    public void parseBook(String identity, String passport,
            String name, String surname, String tel, String Address,
            String fCode, String cardNum, String cardCode) {

        long curTime = timer.getTime();
        try {
            Random random = new Random();
            int sleepT = random.nextInt(10) + 5;
            System.err.println("Delay: " + sleepT);
            TimeUnit.SECONDS.sleep(sleepT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long after = timer.getTime();
        long delay = after - curTime;
        book.book(identity, passport, name, surname,
                Long.valueOf(tel), Address, fCode,
                Long.valueOf(cardNum), Integer.parseInt(cardCode),
                delay);
    }

    public void parseBooks() {
        try {
            FileInputStream fiStream = new FileInputStream(fileName);
            DataInputStream diStream = new DataInputStream(fiStream);
            Compute compute = new Compute();

            BufferedReader breader = new BufferedReader(
                    new InputStreamReader(diStream));

            String newLine;
            while ((newLine = breader.readLine()) != null) {
                String[] tokens = newLine.split("[-]");
                long curTime = timer.getTime();
                System.err.println("curTime: " + curTime);
                try {
                    Random random = new Random();
                    int sleepT = random.nextInt(10) + 5;
                    System.err.println("Delay: " + sleepT);
                    TimeUnit.SECONDS.sleep(sleepT);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                long after = timer.getTime();
                long delay = after - curTime;
                book.book(tokens[0], tokens[1], tokens[2], tokens[3],
                        Long.valueOf(tokens[4]), tokens[5], tokens[6],
                        Long.valueOf(tokens[7]), Integer.parseInt(tokens[8]),
                        delay);
            }
            book.printCustomers();
            //new CancelBook("c7311", "EZY1234");
            System.err.println("lala");
            book.printCustomers();
            compute.printStats();
        } catch (FileNotFoundException e0) {
            e0.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
