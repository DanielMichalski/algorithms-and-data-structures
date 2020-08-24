package pl.dmichalski.algorithms._7_binary_search

import spock.lang.Specification
import spock.lang.Unroll

class SearchServiceTest extends Specification {

    private SearchService underTest = new SearchService()

    @Unroll
    def 'should return [expectedResult=#expectedResult] for [numbers=#numbers]'() {
        when:
        def result = underTest.search(numbers as int[], numberToSearch)

        then:
        result as int[] == expectedResult as int[]

        where:
        numbers            | numberToSearch | expectedResult
        null               | 1              | -1
        []                 | 1              | -1
        [1]                | 1              | 0
        [1, 2, 3, 4, 5, 6] | 4              | 3
        [1, 2, 3, 4, 5, 6] | 6              | 5
        [1, 2, 3, 4, 5, 6] | 11             | -1
    }

}