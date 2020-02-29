package org.example.algorithms;

public interface Algorithm {

    /**
     * Zadanie polega na zwroceniu minimalnej liczby ruchow szesciennej kostki do gry, tak aby wszystkie kosci mialy identyczna wartosc.
     * Kosci do gry moga miec wartosci od 1-6. Pary liczb przeciwnych (na odwrocie kosci) wygladaja nastepujaco: 6-1,5-2,4-3. Oznacza to ze
     * minimalna liczba ruchow aby kosc z liczby 6 przeszla na 1 wynosi 2.
     *
     * Parametr values to tablica kosci z ich aktualna wartoscia. Metoda powinna zwrocic minimalna liczbe ruchow tak aby na kazdej kosci
     * widniala taka sama liczba oczek.
     */
    int getMinimumNumberOfCubeMoves(int[] values);
}
