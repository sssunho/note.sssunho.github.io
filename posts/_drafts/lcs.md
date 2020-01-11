# [알고리즘] LCS(Longest Common Substring) with Python

'최장 길이 공통 부분 문자열'을 구하는 알고리즘
두개를 비교하여 일치하는, 연속된 문자열을 뽑아내는 알고리즘입니다.

```python
def _extractLCS(self, target, comparison_target):
    '''
    Longest Common Substring(LCS)를 이용하여 검색한 문장을 검색된 내용과 일치하는 부분을 찾는다.

    :param target: A, 검색할 문장
    :param comparison_target: B, 비교 대상
    :return: 일치하는 부분. B에서 A와 일치하는 부분
    '''
    len_t = len(target)
    len_c = len(comparison_target)
    result = ''

    for i in range(len_t):
        for j in range(len_c):
            lcs_temp = 0
            match = ''

            while ((i + lcs_temp < len_t) and (j + lcs_temp < len_c) and (target[i + lcs_temp] == comparison_target[j + lcs_temp])):
                match += comparison_target[j + lcs_temp]
                lcs_temp += 1
            if len(match) > len(result):
                result = match

    return result
```

> **참고**
> - 개념을 쉽게 설명해줬던 사이트: http://twinw.tistory.com/126
> - 코드를 참고한 사이트: https://only2sea.wordpress.com/2012/10/02/%EC%B5%9C%EC%9E%A5-%EA%B3%B5%ED%86%B5-%EB%B6%80%EB%B6%84-%EC%88%98%EC%97%B4/
>
> 진짜 쓴 코드는 그대로 닫아버려서 뭔지 모르겠다.. 죄송해요 원작자님;(