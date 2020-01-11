# Python Imaging Library (PIL, Pillow) - 이미지 잘라내기/크롭

```python
import io
from PIL import Image

# 받은 좌표를 crop()에 맞춰서 바꿔주기
# 저 같은 경우는 (x, y, 자를 넓이, 자를 높이)로 요청이 들어와서 crop()에 맞춰서 바꿔줬어야 했습니다.

# 입력받은 좌표를 이용하여 crop()한다.
crop_img = img.crop(`좌표`)
b = io.BytesIO()
crop_img.save(b, format="PNG")
img_bytes = b.getvalue()
```
- 좌표

= (start_x, start_y, start_x + width, start_y + height)
= (left, upper, right, lower)
= (가로 시작점, 세로 시작점, 가로 범위, 세로 범위)

좌표는 왼쪽 윗 모서리를 (0,0)으로 잡는다.

튜플(tuple)로 전달해줘야 한다.



> **참고**
>
> https://pillow.readthedocs.io/en/4.0.x/index.html#
> 
> http://creativeworks.tistory.com/entry/PYTHON-3-Tutorials-40-Cropping-Images-%EC%9D%B4%EB%AF%B8%EC%A7%80-%EC%9E%98%EB%9D%BC%EB%82%B4%EA%B8%B0
