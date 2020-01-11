## 검색한 결과 가져오기
- 구글 검색 결과를 가져오는 코드
```python
from bs4 import BeautifulSoup as BS
import ssl, urllib
import traceback

base_url = 'https://www.google.co.kr/search'

#: 검색조건 설정
values = {
    'q': target,    # 검색할 내용
    'oq': target,
    'aqs': 'chrome..69i57.35694j0j7',
    'sourceid': 'chrome',
    'ie': 'UTF-8',
}

# Google에서는 Header 설정 필요
hdr = {'User-Agent': 'Mozilla/5.0'}

query_string = urllib.parse.urlencode(values)
req = urllib.request.Request(base_url + '?' + query_string, headers=hdr)
context = ssl._create_unverified_context()
try:
    res = urllib.request.urlopen(req, context=context)
except:
    traceback.print_exc()

html_data = BS(res.read(), 'html.parser')
```


- 네이버 검색 결과를 가져오는 코드
```python
from bs4 import BeautifulSoup as BS
import ssl, urllib
import traceback

base_url = 'https://search.naver.com/search.naver'

#: 검색조건 설정
values = {
    'where': blog,      # 검색 대상(블로그, 웹문서 등)
    'sm': 'tab_jum',
    'ie': 'utf8',
    'query': target,    # 검색할 내용
    'st': 'sim',        # 관련도순 정렬
    'srchby': 'all',    # 검색범위 전체(제목+본문)
    'start': '1',       # start page
    'date_option': '0'  # 날짜범위 전체
}

# The resulting string is a series of key=value pairs separated by '&' characters
query_string = urllib.parse.urlencode(values)

context = ssl._create_unverified_context()
try:
    res = urllib.request.urlopen(base_url + '?' + query_string, context=context)
except:
    traceback.print_exc()

html_data = BS(res.read(), 'html.parser')
```


#### `base_url`
검색할 포털 url을 입력해줍니다.


#### `values`
Chrome 개발자 도구 - Network - Headers를 통하여 요청사항을 맞춰줍니다.


#### `headers`
구글은 Header를 'Mozilla/5.0'로 꼭 설정해주어야 합니다.


#### `query_string`
검색조건을 설정해준 후 `urllib.parse.urlencode를 통하여 쿼리 스트링으로 만들어줍니다.


#### `context`
ssl을 설정해주지 않으면 permission denied 에러가 뜹니다. 꼭 해주세요!


여태까지 설정해준 값들을 이용하여 검색을 실행한 결과를 받습니다.
`BeautifulSoup`을 이용하여 `res`로 받은 값을 읽어들입니다.

> 요청 결과에 따라 'html.parser'를 형식에 맞춰 수정가능합니다.



## 검색한 결과에서 원하는 내용 꺼내오기

```python
g_list = html_data.find_all('div', attrs={'class': 'g'})
try:
    for g in g_list:
        # 컨텐츠 URL 꺼내기
        ahref = g.find('a')['href']
        ahref = 'https://www.google.co.kr' + ahref

        # 컨텐츠에서 검색결과와 일치하는 부분 꺼내기
        span = g.find('span', attrs = {'class': 'st'})
        if span:
            span_text = span.get_text()
            span_text = span_text.replace(' ', '')
            span_text = span_text.replace('\n', '')
except:
    traceback.print_exc()
```



```python
g_list = html_data.find_all('div', attrs={'class': 'g'})
```

`html_data`은 위에서 BeatifulSoup으로 꺼낸 html입니다.

__class 이름이 'g'__ 인 `div`를 `find_all()` 함수를 통하여 모두 꺼냅니다.


```python
ahref = g.find('a')['href']
ahref = 'https://www.google.co.kr' + ahref
```
g_list에서 하나씩 꺼낸 뒤에
그 안에 있는 `a`의 `href` 링크를 꺼냅니다.

구글은 앞에 구글 URL을 입력하지 않으면 링크로 연결이 안되더군요!..


```python
span_text = span.get_text()
```
get_text()함수를 통하여 span 내용을 str으로 뽑아냅니다.


이런식으로 Chrome 개발자 도구 - Elements을 통하여 꺼내고 싶은 부분을 찾고
그 부분을 꺼내기위해 저렇게 파내면 됩니다.



> **참고**
>
> - https://www.crummy.com/software/BeautifulSoup/bs4/doc/
>
>