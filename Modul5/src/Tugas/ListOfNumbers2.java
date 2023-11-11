/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Rolan Firmansyah
 */

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.util.Vector;

public class ListOfNumbers2 {

    private Vector victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector(size);
        for (int i = 0; i < size; i++) {
            victor.addElement(i);
        }
        try {
            this.readList("infile.txt");
            this.writeList();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public void readList(String fileName) throws IOException {
        String line = null;
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            while ((line = raf.readLine()) != null) {
                Integer i = Integer.parseInt(line);
                System.out.println(i);
                victor.addElement(i);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + e.getMessage());
        } catch (IOException e) {
            throw new IOException("Error reading the file: " + e.getMessage());
        }
    }

    public void writeList() {
        // Method implementation for writing the list
    }
}

