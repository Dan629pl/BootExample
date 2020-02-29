package org.example.algorithms

import spock.lang.Specification
import spock.lang.Unroll

class AlgorithmImplTest extends Specification {
    AlgorithmImpl sut = []

    @Unroll
    def "Metoda getMinimumNumberOfMoves powinna zwrocic #expected gdy dane wejsciowe to #values"() {

        when:
        def result = sut.getMinimumNumberOfCubeMoves(values)

        then:
        result == expected

        where:
        values       | expected
        [1, 6]       | 2
        [2, 5]       | 2
        [3, 4]       | 2
        [1, 2]       | 1
        [1, 2, 3]    | 2
        [1, 1, 6]    | 2
        [1, 6, 2, 3] | 3
        [1, 1, 1, 1] | 0
    }
}
