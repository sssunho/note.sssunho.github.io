---
layout: post
title: "Welcome to Jekyll!"
date: 2017-04-06 13:32:20 +0300
description: You’ll find this post in your `_posts` directory. Go ahead and edit it and re-build the site to see your changes. # Add post description (optional)
img:  # Add image post (optional)
---

# Color Picker
pick most used colors.

The file format does not matter. At least jpg and png are possible.

사진에서 많이 사용된 색을 골라줍니다. 5개까지 제대로 나오는 듯?

코드를 작성하는 것보다 라이브러리 다운로드 받는게 더더더더더 힘들었습니다..


## Requirements
- sklearn
- numpy
- matplotlib
- opencv

```python
pip3 install sklearn
pip3 install scipy
pip3 install matplotlib
pip3 install opencv-python
```

## How to use
### use with Flask
1. Set environment
```
export MPLBACKEND="pdf" or "Agg"
```

2. run run.py

3. using Tool like PostMan
```
POST /pick/colors/<int:num>
Host: localhost:5000
Content-Type: multipart/form-data
Kye: img
Values: file, your image
```
I recommend that you only include `num` up to 5

4. get colors!
```
{
    "colors": [
        {
            "rgb": [ 30, 25, 24 ],
            "hex": "#1e1918"
        }
}
```

### use with argparse
```
python pick_colors_with_argparse.py --image images/your_image.png --clusters 3
```


## Reference
- [OpenCV and Python K-Means Color Clustering](http://www.pyimagesearch.com/2014/05/26/opencv-python-k-means-color-clustering/)
- [Ubuntu 16.04에 opencv_contrib 포함하여 OpenCV 3.2 설치](http://webnautes.tistory.com/1030)

