package pl.edu.ur.oopl5.stack;

import java.util.EmptyStackException;

public class Stack extends AbstractStack {

    private int n;
    private int[] tab;
    private int rozmiar;
    private int index;

    public Stack(int rozmiar) {
        tab = new int[rozmiar];
        index = 0;
    }

    int getMaximumStackSize() {
        return tab.length;
    }

    int getSize() {
        return index;
    }

    @Override
    public void push(int i) throws EmptyStackException {
        if (index < tab.length) {
            tab[index] = i;
            index++;

        } else {
            throw new StackOverflowError(
                    "Przepe³nienie stosu, operacja nie powiod³a siê");
        }
    }

    @Override
    public int pop() throws EmptyStackException {
        if (index <= 0) {
            throw new StackOverflowError(
                    "Stos jest pusty, operacja nie powiod³a siê");
        }

        int temp = tab[index - 1];
        index--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        } else {
            return false;
        }
    }

   

}

