/*
    Date    : 2022.07.11
    level   : 2
    url     : https://school.programmers.co.kr/learn/courses/30/lessons/12914
*/

class Solution {
    fun solution(n: Int): Long {
        val DP = Array(2001) { 1.toLong() }
        DP[1] = 1
        DP[2] = 2
        if (n >= 3) {
            for (i in 3..n) {
                DP[i] = (DP[i - 1] + DP[i - 2]) % 1234567
            }
        }
        return DP[n]
    }
}
