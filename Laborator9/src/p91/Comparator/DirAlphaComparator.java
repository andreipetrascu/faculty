package p91.Comparator;

import java.util.Comparator;
import java.io.*;

// Pentru a sorta directoarele inaintea fisierelor, apoi alfabetic.
class DirAlphaComparator implements Comparator<File> {
    // Interfata Comparator necesita definirea metodei compare.
    public int compare(File filea, File fileb) {
        //... Sorteaza directoarele inaintea fisierelor,
        // altfel alfabetic fara a tine seama de majuscule/minuscule.
        if (filea.isDirectory() && !fileb.isDirectory()) {
            return -1;
        } else if (!filea.isDirectory() && fileb.isDirectory()) {
            return 1;
        } else {
            return filea.getName().compareToIgnoreCase(fileb.getName());
        }
    }
}