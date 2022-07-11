/*
    Date    : 2022.07.11
    level   : 2
    url     : https://school.programmers.co.kr/learn/courses/30/lessons/12914
*/
 
import java.math.BigInteger

class Solution {
        fun solution(n: Int): Long {
        var answer = 1L 

        for (i in 1L..n / 2L) {
            val j: Long = n - i * 2
            if (i == 1L) {
                answer += (i + j)
                continue
            }

            // n값이 짝수일 경우 마지막 경우의 수
            if (j == 0L) {
                answer += 1L
                break
            }

            answer += combi(i + j, if (i > j) j else i)
        }
        return answer%1234567L
    }

    // 조합 -> total C r
    // ex 6C2 => 6*5/2*1
    fun combi(total: Long, r: Long): Long {
        var top = total
        var bottom = r
        for (i in 1 until r) {
            top *= (total - i)
            bottom *= (r - i)
        }
        return (top / bottom)
    }
}
